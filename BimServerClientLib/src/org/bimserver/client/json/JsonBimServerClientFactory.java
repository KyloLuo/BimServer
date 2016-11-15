package org.bimserver.client.json;

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

import org.bimserver.client.AbstractBimServerClientFactory;
import org.bimserver.client.BimServerClient;
import org.bimserver.emf.MetaDataManager;
import org.bimserver.shared.AuthenticationInfo;
import org.bimserver.shared.ChannelConnectionException;
import org.bimserver.shared.exceptions.ServiceException;
import org.bimserver.shared.meta.SServicesMap;
import org.bimserver.shared.reflector.FileBasedReflectorFactoryBuilder;
import org.bimserver.shared.reflector.ReflectorFactory;

public class JsonBimServerClientFactory extends AbstractBimServerClientFactory {

	private String address;
	private JsonSocketReflectorFactory jsonSocketReflectorFactory;
	private ReflectorFactory reflectorFactory;

	public JsonBimServerClientFactory(String address, SServicesMap servicesMap, JsonSocketReflectorFactory jsonSocketReflectorFactory, ReflectorFactory reflectorFactory, MetaDataManager metaDataManager) {
		super(servicesMap, metaDataManager);
		this.address = address;
		this.jsonSocketReflectorFactory = jsonSocketReflectorFactory;
		this.reflectorFactory = reflectorFactory;
	}

	public JsonBimServerClientFactory(MetaDataManager metaDataManager, String address) {
		super(metaDataManager);
		this.address = address;
		this.jsonSocketReflectorFactory = new JsonSocketReflectorFactory(getServicesMap());
		FileBasedReflectorFactoryBuilder reflectorBuilder = new FileBasedReflectorFactoryBuilder();
		reflectorFactory = reflectorBuilder.newReflectorFactory();
	}

	@Override
	public BimServerClient create(AuthenticationInfo authenticationInfo) throws ServiceException, ChannelConnectionException {
		JsonChannel jsonChannel = new JsonChannel(getHttpClient(), reflectorFactory, jsonSocketReflectorFactory, address + "/json", getServicesMap());
		BimServerClient bimServerClient = new BimServerClient(this, address, getServicesMap(), jsonChannel);
		jsonChannel.connect(bimServerClient);
		bimServerClient.setAuthentication(authenticationInfo);
		bimServerClient.connect();
		return bimServerClient;
	}
}