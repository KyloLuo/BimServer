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
import org.bimserver.shared.exceptions.ErrorCode;
import org.bimserver.shared.exceptions.UserException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class AddReferenceChange implements Change {

	private final long oid;
	private final String referenceName;
	private final long referenceOid;

	public AddReferenceChange(long oid, String referenceName, long referenceOid) {
		this.oid = oid;
		this.referenceName = referenceName;
		this.referenceOid = referenceOid;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void execute(IfcModelInterface model, Project project, ConcreteRevision concreteRevision, DatabaseSession databaseSession, Map<Long, IdEObject> created, Map<Long, IdEObject> deleted) throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		PackageMetaData packageMetaData = databaseSession.getMetaDataManager().getPackageMetaData(project.getSchema());
		IdEObject idEObject = databaseSession.get(model, oid, new Query(packageMetaData, project.getId(), concreteRevision.getId(), -1));
		if (idEObject == null) {
			idEObject = created.get(oid);
		}
		EClass eClass = databaseSession.getEClassForOid(oid);
		if (idEObject == null) {
			throw new UserException("No object of type " + eClass.getName() + " with oid " + oid + " found in project with pid " + project.getId());
		}
		EReference eReference = packageMetaData.getEReference(eClass.getName(), referenceName);
		if (eReference == null) {
			throw new UserException("No reference with the name " + referenceName + " found in class " + eClass.getName());
		}
		if (!eReference.isMany()) {
			throw new UserException("Reference is not of type 'many'");
		}
		IdEObject referencedObject = databaseSession.get(referenceOid, new Query(packageMetaData, project.getId(), concreteRevision.getId(), -1));
		if (referencedObject == null) {
			referencedObject = created.get(oid);
		}
		if (referencedObject == null) {
			EClass referenceEClass = databaseSession.getEClassForOid(referenceOid);
			throw new UserException("Referenced object of type " + referenceEClass.getName() + " with oid " + referenceOid + " not found");
		}
		
		boolean added = false;
		
		if (eReference.getEOpposite() != null) {
			if (eReference.getEOpposite().isMany()) {
				List oppositeList = (List)referencedObject.eGet(eReference.getEOpposite());
				oppositeList.add(idEObject);
				databaseSession.store(referencedObject, project.getId(), concreteRevision.getId());
				added = true;
			} else {
				IdEObject oldReferencing = (IdEObject) referencedObject.eGet(eReference.getEOpposite());
				if (oldReferencing != null) {
					throw new UserException("You cannot add a reference on " + idEObject.eClass().getName() + " (" + idEObject.getOid() + ")." + eReference.getName() + " to " + referencedObject.eClass().getName() + " (" + referencedObject.getOid() + ") because another object (" + oldReferencing.eClass().getName() + " (" + oldReferencing.getOid() + ")) is already and there is a singular inverse defined", ErrorCode.SET_REFERENCE_FAILED_OPPOSITE_ALREADY_SET);
				}
				referencedObject.eSet(eReference.getEOpposite(), idEObject); // This will also trigger EMF's opposite, so added=true
				databaseSession.store(referencedObject, project.getId(), concreteRevision.getId());
				added = true;
			}
		}
		
		if (!added) {
			List list = (List) idEObject.eGet(eReference);
			list.add(referencedObject);
		}

		databaseSession.store(idEObject, project.getId(), concreteRevision.getId());
	}
}