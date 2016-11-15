package org.bimserver.changes;

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

import java.util.List;
import java.util.Map;

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.Project;
import org.bimserver.shared.exceptions.UserException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;

public class SetAttributeChangeAtIndex implements Change {

	private final long oid;
	private final String attributeName;
	private final Object value;
	private int index;

	public SetAttributeChangeAtIndex(long oid, String attributeName, int index, Object value) {
		this.oid = oid;
		this.attributeName = attributeName;
		this.index = index;
		this.value = value;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void execute(IfcModelInterface model, Project project, ConcreteRevision concreteRevision, DatabaseSession databaseSession, Map<Long, IdEObject> created, Map<Long, IdEObject> deleted) throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		PackageMetaData packageMetaData = databaseSession.getMetaDataManager().getPackageMetaData(project.getSchema());
		IdEObject idEObject = databaseSession.get(model, oid, new Query(packageMetaData, project.getId(), concreteRevision.getId(), -1));
		EClass eClass = databaseSession.getEClassForOid(oid);
		if (idEObject == null) {
			idEObject = created.get(oid);
		}
		if (idEObject == null) {
			throw new UserException("No object of type \"" + eClass.getName() + "\" with oid " + oid + " found in project with pid " + project.getId());
		}
		EAttribute eAttribute = packageMetaData.getEAttribute(eClass.getName(), attributeName);
		if (eAttribute == null) {
			throw new UserException("No attribute with the name \"" + attributeName + "\" found in class \"" + eClass.getName() + "\"");
		}
		if (!eAttribute.isMany()) {
			throw new UserException("Attribute is not of type 'many'");
		}
		List list = (List)idEObject.eGet(eAttribute);
		List asStringList = null;
		if (eAttribute.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
			asStringList = (List)idEObject.eGet(idEObject.eClass().getEStructuralFeature(attributeName + "AsString"));
			asStringList.set(index, String.valueOf(value));
		}
		list.set(index, value);
		databaseSession.store(idEObject, project.getId(), concreteRevision.getId());
	}
}