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
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.shared.exceptions.UserException;

public class GetAllRevisionsOfProjectDatabaseAction extends BimDatabaseAction<Set<Revision>> {

	private final long poid;

	public GetAllRevisionsOfProjectDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod, long poid) {
		super(databaseSession, accessMethod);
		this.poid = poid;
	}

	@Override
	public Set<Revision> execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		Project project = getProjectByPoid(poid);
		return new HashSet<Revision>(project.getRevisions());
	}
}