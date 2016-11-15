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

import java.util.HashSet;
import java.util.Set;

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ObjectState;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.models.store.UserType;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.webservices.authorization.Authorization;

public class GetAllWritableProjectsDatabaseAction extends BimDatabaseAction<Set<Project>> {

	private Authorization authorization;

	public GetAllWritableProjectsDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod, Authorization authorization) {
		super(databaseSession, accessMethod);
		this.authorization = authorization;
	}

	@Override
	public Set<Project> execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		User user = getUserByUoid(authorization.getUoid());
		IfcModelInterface projectsModel = getDatabaseSession().getAllOfType(StorePackage.eINSTANCE.getProject(), Query.getDefault());
		Set<Project> result = new HashSet<Project>();
		for (IdEObject idEObject : projectsModel.getValues()) {
			if (idEObject instanceof Project) {
				Project project = (Project)idEObject;
				if (!project.getName().equals("INT-Store")) {
					if ((user.getUserType() == UserType.ADMIN || (project.getState() == ObjectState.ACTIVE) && authorization.hasRightsOnProjectOrSuperProjects(user, project))) {
						result.add(project);
					}
				}
			}
		}
		return result;
	}
}