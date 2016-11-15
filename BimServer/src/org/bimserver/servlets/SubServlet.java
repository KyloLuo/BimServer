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

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bimserver.BimServer;

public abstract class SubServlet {

	private BimServer bimServer;
	private ServletContext servletContext;

	public SubServlet(BimServer bimServer, ServletContext servletContext) {
		this.bimServer = bimServer;
		this.servletContext = servletContext;
	}
	
	public BimServer getBimServer() {
		return bimServer;
	}
	
	public abstract void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	public ServletContext getServletContext() {
		return servletContext;
	}
}
