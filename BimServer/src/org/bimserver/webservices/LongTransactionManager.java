package org.bimserver.webservices;

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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class LongTransactionManager {
	private final AtomicLong counter = new AtomicLong();
	private final Map<Long, LongTransaction> runningTransactions = new HashMap<Long, LongTransaction>();
	
	public synchronized LongTransaction newLongTransaction(long poid, int pid, int rid, long roid, String schemaName) {
		LongTransaction longTransaction = new LongTransaction(poid, roid, pid, rid, counter.incrementAndGet(), schemaName);
		runningTransactions.put(longTransaction.getTid(), longTransaction);
		return longTransaction;
	}

	public LongTransaction get(Long tid) throws NoTransactionException {
		LongTransaction longTransaction = runningTransactions.get(tid);
		if (longTransaction == null) {
			throw new NoTransactionException("No transaction with tid " + tid + " could be found");
		}
		return longTransaction;
	}

	public void remove(long tid) throws NoTransactionException {
		get(tid);
		runningTransactions.remove(tid);
	}
}