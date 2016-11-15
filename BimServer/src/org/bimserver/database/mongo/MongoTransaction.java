package org.bimserver.database.mongo;


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

import org.bimserver.database.BimTransaction;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;


public class MongoTransaction implements BimTransaction {

//	private final Transaction transaction;
	private boolean transactionAlive = true;
/*
	public MongoTransaction(Transaction transaction) {
//		this.transaction = transaction;
	}

	public Transaction getTransaction() {
		return transaction;
	}
*/
	@Override
	public void setName(String name) {
		return ;//transaction.setName(name);
	}

	@Override
	public void close() {
	}

	@Override
	public void rollback() {
		return ;
	}

	@Override
	public void commit() throws BimserverLockConflictException, BimserverDatabaseException {
		return ;
	}

	@Override
	public long getId() {
		return 0;
	}
}