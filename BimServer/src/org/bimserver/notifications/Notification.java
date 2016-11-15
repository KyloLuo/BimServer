package org.bimserver.notifications;

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

import org.bimserver.BimServer;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Notification implements Runnable {

	private static final Logger LOGGER = LoggerFactory.getLogger(Notification.class);
	private BimServer bimServer;

	public Notification(BimServer bimServer) {
		this.bimServer = bimServer;
	}
	
	public BimServer getBimServer() {
		return bimServer;
	}
	
	public abstract void process() throws BimserverDatabaseException, UserException, ServerException;
	
	@Override
	public void run() {
		try {
			process();
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}
}