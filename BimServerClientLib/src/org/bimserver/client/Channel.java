package org.bimserver.client;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.DeflaterInputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.bimserver.shared.ChannelConnectionException;
import org.bimserver.shared.ConnectDisconnectListener;
import org.bimserver.shared.PublicInterfaceNotFoundException;
import org.bimserver.shared.ServiceHolder;
import org.bimserver.shared.TokenHolder;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.AdminInterface;
import org.bimserver.shared.interfaces.AuthInterface;
import org.bimserver.shared.interfaces.MetaInterface;
import org.bimserver.shared.interfaces.PluginInterface;
import org.bimserver.shared.interfaces.PublicInterface;
import org.bimserver.shared.interfaces.ServiceInterface;
import org.bimserver.shared.interfaces.SettingsInterface;
import org.bimserver.shared.interfaces.bimsie1.Bimsie1AuthInterface;
import org.bimserver.shared.interfaces.bimsie1.Bimsie1LowLevelInterface;
import org.bimserver.shared.interfaces.bimsie1.Bimsie1NotificationRegistryInterface;
import org.bimserver.shared.interfaces.bimsie1.Bimsie1ServiceInterface;
import org.bimserver.shared.reflector.Reflector;
import org.bimserver.shared.reflector.ReflectorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public abstract class Channel implements ServiceHolder {
	private final Map<String, PublicInterface> serviceInterfaces = new HashMap<String, PublicInterface>();
	private final Set<ConnectDisconnectListener> connectDisconnectListeners = new HashSet<ConnectDisconnectListener>();
	private static final Logger LOGGER = LoggerFactory.getLogger(Channel.class);
	private CloseableHttpClient closeableHttpClient;

	public Channel(CloseableHttpClient closeableHttpClient) {
		this.closeableHttpClient = closeableHttpClient;
	}

	@SuppressWarnings("unchecked")
	public <T extends PublicInterface> T get(String interfaceClass) {
		return (T) serviceInterfaces.get(interfaceClass);
	}
	
	public void add(String interfaceClass, PublicInterface service) {
		serviceInterfaces.put(interfaceClass, service);
	}
	
	public Map<String, PublicInterface> getServiceInterfaces() {
		return serviceInterfaces;
	}
	
	public void registerConnectDisconnectListener(ConnectDisconnectListener connectDisconnectListener) {
		connectDisconnectListeners.add(connectDisconnectListener);
	}
	
	public void notifyOfConnect() {
		for (ConnectDisconnectListener connectDisconnectListener : connectDisconnectListeners) {
			connectDisconnectListener.connected();
		}
	}
	
	public void notifyOfDisconnect() {
		for (ConnectDisconnectListener connectDisconnectListener : connectDisconnectListeners) {
			connectDisconnectListener.disconnected();
		}
	}

	protected void finish(Reflector reflector, ReflectorFactory reflectorFactory) {
	}
	
	public abstract void disconnect();

	public abstract void connect(TokenHolder tokenHolder) throws ChannelConnectionException;

	public long checkin(String baseAddress, String token, long poid, String comment, long deserializerOid, boolean merge, boolean sync, long fileSize, String filename, InputStream inputStream) throws ServerException, UserException {
		String address = baseAddress + "/upload";
		HttpPost httppost = new HttpPost(address);
		try {
			// TODO find some GzipInputStream variant that _compresses_ instead of _decompresses_ using deflate for now
			InputStreamBody data = new InputStreamBody(new DeflaterInputStream(inputStream), filename);
			
			MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
			
			multipartEntityBuilder.addPart("data", data);
			multipartEntityBuilder.addPart("token", new StringBody(token, ContentType.DEFAULT_TEXT));
			multipartEntityBuilder.addPart("deserializerOid", new StringBody("" + deserializerOid, ContentType.DEFAULT_TEXT));
			multipartEntityBuilder.addPart("merge", new StringBody("" + merge, ContentType.DEFAULT_TEXT));
			multipartEntityBuilder.addPart("poid", new StringBody("" + poid, ContentType.DEFAULT_TEXT));
			multipartEntityBuilder.addPart("comment", new StringBody("" + comment, ContentType.DEFAULT_TEXT));
			multipartEntityBuilder.addPart("sync", new StringBody("" + sync, ContentType.DEFAULT_TEXT));
			multipartEntityBuilder.addPart("compression", new StringBody("deflate", ContentType.DEFAULT_TEXT));
			
			httppost.setEntity(multipartEntityBuilder.build());
			
			HttpResponse httpResponse = closeableHttpClient.execute(httppost);
			if (httpResponse.getStatusLine().getStatusCode() == 200) {
				JsonParser jsonParser = new JsonParser();
				InputStreamReader in = new InputStreamReader(httpResponse.getEntity().getContent());
				try {
					JsonElement result = jsonParser.parse(new JsonReader(in));
					if (result instanceof JsonObject) {
						JsonObject jsonObject = (JsonObject)result;
						if (jsonObject.has("exception")) {
							JsonObject exceptionJson = jsonObject.get("exception").getAsJsonObject();
							String exceptionType = exceptionJson.get("__type").getAsString();
							String message = exceptionJson.has("message") ? exceptionJson.get("message").getAsString() : "unknown";
							if (exceptionType.equals(UserException.class.getSimpleName())) {
								throw new UserException(message);
							} else if (exceptionType.equals(ServerException.class.getSimpleName())) {
								throw new ServerException(message);
							}
						} else {
							return jsonObject.get("checkinid").getAsLong();
						}
					}
				} finally {
					in.close();
				}
			}
		} catch (ClientProtocolException e) {
			LOGGER.error("", e);
		} catch (IOException e) {
			LOGGER.error("", e);
		}
		return -1;
	}

	public InputStream getDownloadData(String  baseAddress, String token, long download, long serializerOid) throws IOException {
		String address = baseAddress + "/download?token=" + token + "&longActionId=" + download + "&serializerOid=" + serializerOid;
		HttpPost httppost = new HttpPost(address);
		try {
			HttpResponse httpResponse = closeableHttpClient.execute(httppost);
			if (httpResponse.getStatusLine().getStatusCode() == 200) {
				return httpResponse.getEntity().getContent();
			} else {
				LOGGER.error(httpResponse.getStatusLine().getStatusCode() + " - " + httpResponse.getStatusLine().getReasonPhrase());
			}
		} catch (ClientProtocolException e) {
			LOGGER.error("", e);
		} catch (IOException e) {
			LOGGER.error("", e);
		}
		return null;
	}

	public <T extends PublicInterface> T get(Class<T> class1) throws PublicInterfaceNotFoundException {
		T t = get(class1.getName());
		if (t == null) {
			throw new PublicInterfaceNotFoundException("Interface " + class1.getSimpleName() + " not registered on channel " + this);
		}
		return t;
	}
	
	@Override
	public AdminInterface getAdminInterface() throws PublicInterfaceNotFoundException {
		return get(AdminInterface.class);
	}
	
	@Override
	public Bimsie1AuthInterface getBimsie1AuthInterface() throws PublicInterfaceNotFoundException {
		return get(Bimsie1AuthInterface.class);
	}
	
	@Override
	public AuthInterface getAuthInterface() throws PublicInterfaceNotFoundException {
		return get(AuthInterface.class);
	}
	
	@Override
	public Bimsie1LowLevelInterface getBimsie1LowLevelInterface() throws PublicInterfaceNotFoundException {
		return get(Bimsie1LowLevelInterface.class);
	}
	
	@Override
	public MetaInterface getMeta() throws PublicInterfaceNotFoundException {
		return get(MetaInterface.class);
	}
	
	@Override
	public PluginInterface getPluginInterface() throws PublicInterfaceNotFoundException {
		return get(PluginInterface.class);
	}
	
	@Override
	public Bimsie1NotificationRegistryInterface getRegistry() throws PublicInterfaceNotFoundException {
		return get(Bimsie1NotificationRegistryInterface.class);
	}
	
	@Override
	public SettingsInterface getSettingsInterface() throws PublicInterfaceNotFoundException {
		return get(SettingsInterface.class);
	}
	
	@Override
	public ServiceInterface getServiceInterface() throws PublicInterfaceNotFoundException {
		return get(ServiceInterface.class);
	}

	protected boolean has(Class<? extends PublicInterface> interface1) {
		return serviceInterfaces.containsKey(interface1.getName());
	}

	public AuthInterface getBimServerAuthInterface() throws PublicInterfaceNotFoundException {
		return get(AuthInterface.class);
	}

	public Bimsie1ServiceInterface getBimsie1ServiceInterface() throws PublicInterfaceNotFoundException {
		return get(Bimsie1ServiceInterface.class);
	}
}