package org.bimserver.database.actions;

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

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Service;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.webservices.authorization.Authorization;

public class AddServiceToProjectDatabaseAction extends BimDatabaseAction<Long> {

	private long poid;
	private Authorization authorization;
	private Service service;

	public AddServiceToProjectDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod, long poid, Service service, Authorization authorization) {
		super(databaseSession, accessMethod);
		this.poid = poid;
		this.service = service;
		this.authorization = authorization;
	}

	@Override
	public Long execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		Project project = getDatabaseSession().get(StorePackage.eINSTANCE.getProject(), poid, Query.getDefault());
		User user = getDatabaseSession().get(StorePackage.eINSTANCE.getUser(), authorization.getUoid(), Query.getDefault());
		service.setUser(user);
		for (org.bimserver.models.store.Service existing : project.getServices()) {
			if (existing.getName().equals(service.getName())) {
				throw new UserException("Service name \"" + service.getName() + "\" already used in this project");
			}
		}
		project.getServices().add(service);
		service.setProject(project);
		long serviceOid = getDatabaseSession().store(service);
		getDatabaseSession().store(project);
		return serviceOid;
	}
}