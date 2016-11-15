package org.bimserver.database.migrations.steps;

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

import org.bimserver.database.DatabaseSession;
import org.bimserver.database.migrations.Migration;
import org.bimserver.database.migrations.Schema;

public class Step0012 extends Migration {

	@Override
	public void migrate(Schema schema, DatabaseSession databaseSession) {
//		EClass geometryData = schema.getEClass("geometry", "GeometryData");
//		schema.createEAttribute(geometryData, "materials", EcorePackage.eINSTANCE.getEByteArray());
//		schema.createEAttribute(geometryData, "materialIndices", EcorePackage.eINSTANCE.getEByteArray());
	}

	@Override
	public String getDescription() {
		return "Store materials";
	}
}
