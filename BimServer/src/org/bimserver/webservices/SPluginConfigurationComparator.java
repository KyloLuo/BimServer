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

import java.util.Comparator;

import org.bimserver.interfaces.objects.SPluginConfiguration;

public class SPluginConfigurationComparator implements Comparator<SPluginConfiguration> {

	@Override
	public int compare(SPluginConfiguration o1, SPluginConfiguration o2) {
		if (o1.getName() == null && o2.getName() != null) {
			return 1;
		} else if (o1.getName() != null && o2.getName() == null) {
			return -1;
		} else if (o1.getName() == null && o2.getName() == null) {
			return 0;
		} else {
			return o1.getName().compareTo(o2.getName());
		}
	}
}
