package org.bimserver.client;

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

import org.bimserver.models.geometry.GeometryInfo;
import org.bimserver.models.ifc2x3tc1.impl.IfcProductImpl;

public class IfcProductFaker extends IfcProductImpl {
	@Override
	public GeometryInfo getGeometry() {
		GeometryInfo geometryInfo = super.getGeometry();
		if (geometryInfo == null) {
			
		}
		return geometryInfo;
	}
}
