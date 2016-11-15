/**
 * Copyright (C) 2009-2014 BIMserver.org
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
 */
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcExternalReference;
import org.bimserver.models.ifc4.IfcExternalReferenceRelationship;
import org.bimserver.models.ifc4.IfcResourceObjectSelect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc External Reference Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcExternalReferenceRelationshipImpl#getRelatingReference <em>Relating Reference</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcExternalReferenceRelationshipImpl#getRelatedResourceObjects <em>Related Resource Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcExternalReferenceRelationshipImpl extends IfcResourceLevelRelationshipImpl implements IfcExternalReferenceRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExternalReferenceRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_EXTERNAL_REFERENCE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternalReference getRelatingReference() {
		return (IfcExternalReference) eGet(Ifc4Package.Literals.IFC_EXTERNAL_REFERENCE_RELATIONSHIP__RELATING_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingReference(IfcExternalReference newRelatingReference) {
		eSet(Ifc4Package.Literals.IFC_EXTERNAL_REFERENCE_RELATIONSHIP__RELATING_REFERENCE, newRelatingReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcResourceObjectSelect> getRelatedResourceObjects() {
		return (EList<IfcResourceObjectSelect>) eGet(Ifc4Package.Literals.IFC_EXTERNAL_REFERENCE_RELATIONSHIP__RELATED_RESOURCE_OBJECTS, true);
	}

} //IfcExternalReferenceRelationshipImpl
