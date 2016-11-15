package org.bimserver.webservices.impl;

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
import org.bimserver.interfaces.objects.SLongActionState;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.NotificationInterfaceAdaptor;

public class Bimsie1NotificationImpl extends NotificationInterfaceAdaptor {

	public Bimsie1NotificationImpl(BimServer bimServer) {
	}

	@Override
	public void progress(Long topicId, SLongActionState state) throws UserException, ServerException {
	}

	@Override
	public void newRevision(Long poid, Long roid) throws UserException, ServerException {
	}

	@Override
	public void newProject(Long poid) throws UserException, ServerException {
	}

	@Override
	public void newUser(Long uoid) throws UserException, ServerException {
	}
}