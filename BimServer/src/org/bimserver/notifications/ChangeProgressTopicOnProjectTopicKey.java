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

public class ChangeProgressTopicOnProjectTopicKey extends TopicKey {

	private Long poid;

	public ChangeProgressTopicOnProjectTopicKey(Long poid) {
		this.poid = poid;
	}
	
	public Long getPoid() {
		return poid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poid == null) ? 0 : poid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChangeProgressTopicOnProjectTopicKey other = (ChangeProgressTopicOnProjectTopicKey) obj;
		if (poid == null) {
			if (other.poid != null)
				return false;
		} else if (!poid.equals(other.poid))
			return false;
		return true;
	}
}
