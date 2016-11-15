package org.bimserver.schemaconverter;

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

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.Schema;

public class Ifc4ToIfc2x3tc1SchemaConverterFactory implements SchemaConverterFactory {

	@Override
	public SchemaConverter create(IfcModelInterface sourceModel, IfcModelInterface targetModel) {
		return new Ifc4ToIfcIfc2x3tc1Converter(sourceModel, targetModel);
	}

	@Override
	public Schema getSourceSchema() {
		return Schema.IFC4;
	}

	@Override
	public Schema getTargetSchema() {
		return Schema.IFC2X3TC1;
	}
}