package org.bimserver.database;

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

public class ClearProjectPlan {

	private final int pid;
	private final int oldRid;
	private final int newRid;

	public ClearProjectPlan(int pid, int oldRid, int newRid) {
		this.pid = pid;
		this.oldRid = oldRid;
		this.newRid = newRid;
	}
	
	public int getPid() {
		return pid;
	}

	public int getOldRid() {
		return oldRid;
	}
	
	public int getNewRid() {
		return newRid;
	}
}
