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
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.emf.IdEObject;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.shared.exceptions.UserException;

public abstract class AbstractGetByConditionDatabaseAction<T extends IdEObject> extends BimDatabaseAction<T> {

	private Condition condition;
	private Class<T> clazz;

	public AbstractGetByConditionDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod, Class<T> clazz) {
		super(databaseSession, accessMethod);
		this.clazz = clazz;
	}

	@Override
	public T execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		return getDatabaseSession().querySingle(condition, clazz, Query.getDefault());
	}
	
	protected void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	public Class<T> getClazz() {
		return clazz;
	}
}