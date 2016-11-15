package org.bimserver.servlets;

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
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

import javax.activation.DataHandler;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import org.bimserver.BimServer;
import org.bimserver.interfaces.objects.SFile;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.shared.interfaces.ServiceInterface;
import org.bimserver.utils.InputStreamDataSource;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UploadServlet extends SubServlet {

	private static final Logger LOGGER = LoggerFactory.getLogger(UploadServlet.class);
	private DiskFileItemFactory factory;

	public UploadServlet(BimServer bimServer, ServletContext servletContext) {
		super(bimServer, servletContext);
		factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024 * 1024 * 500); // 500 MB
	}

	@SuppressWarnings("unchecked")
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getHeader("Origin") != null && !getBimServer().getServerSettingsCache().isHostAllowed(request.getHeader("Origin"))) {
			response.setStatus(403);
			return;
		}
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		String token = (String)request.getSession().getAttribute("token");
		
		JSONObject result = new JSONObject();
		response.setContentType("text/json");
		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			long poid = -1;
			String comment = null;
			if (isMultipart) {
				ServletFileUpload upload = new ServletFileUpload(factory);
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> iter = items.iterator();
				InputStream in = null;
				long size = 0;
				String name = "";
				long deserializerOid = -1;
				boolean merge = false;
				boolean sync = false;
				String compression = null;
				String action = null;
				while (iter.hasNext()) {
					FileItem item = iter.next();
					if (item.isFormField()) {
						if ("action".equals(item.getFieldName())) {
							action = item.getString();
						}
						if ("token".equals(item.getFieldName())) {
							token = item.getString();
						}
						if ("poid".equals(item.getFieldName())) {
							poid = Long.parseLong(item.getString());
						}
						if ("comment".equals(item.getFieldName())) {
							comment = item.getString();
						}
						if ("sync".equals(item.getFieldName())) {
							sync = item.getString().equals("true");
						}
						if ("merge".equals(item.getFieldName())) {
							merge = item.getString().equals("true");
						}
						if ("compression".equals(item.getFieldName())) {
							compression = item.getString();
						}
						if ("deserializerOid".equals(item.getFieldName())) {
							deserializerOid = Long.parseLong(item.getString());
						}
					} else {
						size = item.getSize();
						name = item.getName();
						in = item.getInputStream();
					}
				}
				if ("file".equals(action)) {
					ServiceInterface serviceInterface = getBimServer().getServiceFactory().get(token, AccessMethod.INTERNAL).get(ServiceInterface.class);
					SFile file = new SFile();
					file.setData(IOUtils.toByteArray(in));
					file.setFilename(name);
					result.put("fileId", serviceInterface.uploadFile(file));
				} else if (poid != -1) {
					if (size == 0) {
						result.put("exception", "Uploaded file empty, or no file uploaded at all");
					} else {
						InputStream realStream = null;
						if ("gzip".equals(compression)) {
							realStream = new GZIPInputStream(in);
						} else if ("deflate".equals(compression)) {
							realStream = new InflaterInputStream(in);
						} else {
							realStream = in;
						}
						InputStreamDataSource inputStreamDataSource = new InputStreamDataSource(realStream);
						inputStreamDataSource.setName(name);
						DataHandler ifcFile = new DataHandler(inputStreamDataSource);
						
						if (token != null) {
							ServiceInterface service = getBimServer().getServiceFactory().get(token, AccessMethod.INTERNAL).get(ServiceInterface.class);
							long checkinId = service.checkin(poid, comment, deserializerOid, size, name, ifcFile, merge, sync);
							result.put("checkinid", checkinId);
						}
					}
				} else {
					result.put("exception", "No poid");
				}
			}
		} catch (Exception e) {
			sendException(response, e);
			return;
		}
		try {
			result.write(response.getWriter());
		} catch (JSONException e) {
			LOGGER.error("", e);
		}
	}

	private void sendException(HttpServletResponse response, Exception exception) {
		try {
			JSONObject responseObject = new JSONObject();
			JSONObject exceptionJson = new JSONObject();
			exceptionJson.put("__type", exception.getClass().getSimpleName());
			if (exception.getMessage() == null) {
				exceptionJson.put("message", "Unknown exception");
			} else {
				exceptionJson.put("message", exception.getMessage());
			}
			responseObject.put("exception", exceptionJson);
			responseObject.write(response.getWriter());
		} catch (JSONException e) {
		} catch (IOException e) {
		}
	}
}