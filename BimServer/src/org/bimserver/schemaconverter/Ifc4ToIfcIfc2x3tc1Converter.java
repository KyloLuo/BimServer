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

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.emf.Schema;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc4.Ifc4Package;

public class Ifc4ToIfcIfc2x3tc1Converter extends AbstractSchemaConverter implements SchemaConverter {

	public Ifc4ToIfcIfc2x3tc1Converter(IfcModelInterface source, IfcModelInterface target) {
		super(source, target);
	}

	public void convert() throws SchemaConverterException, IfcModelInterfaceException {
		if (getSource().getPackageMetaData().getEPackage() != Ifc4Package.eINSTANCE) {
			throw new SchemaConverterException("Source model should be Ifc4");
		}
		if (getTarget().getPackageMetaData().getEPackage() != Ifc2x3tc1Package.eINSTANCE) {
			throw new SchemaConverterException("Target model should be Ifc2x3tc1");
		}

		for (IdEObject idEObject : getSource().getValues()) {
			copy(idEObject);
		}
	}

	@Override
	public Schema getSourceSchema() {
		return Schema.IFC2X3TC1;
	}

	@Override
	public Schema getTargetSchema() {
		return Schema.IFC4;
	}
}
