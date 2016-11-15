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
import org.bimserver.models.ifc4.IfcObjectDefinition;
import org.bimserver.models.ifc4.IfcObjectTypeEnum;
import org.bimserver.models.ifc4.IfcRelAssigns;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelAssignsImpl#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelAssignsImpl#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsImpl extends IfcRelationshipImpl implements IfcRelAssigns {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REL_ASSIGNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcObjectDefinition> getRelatedObjects() {
		return (EList<IfcObjectDefinition>) eGet(Ifc4Package.Literals.IFC_REL_ASSIGNS__RELATED_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum getRelatedObjectsType() {
		return (IfcObjectTypeEnum) eGet(Ifc4Package.Literals.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjectsType(IfcObjectTypeEnum newRelatedObjectsType) {
		eSet(Ifc4Package.Literals.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE, newRelatedObjectsType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatedObjectsType() {
		eUnset(Ifc4Package.Literals.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedObjectsType() {
		return eIsSet(Ifc4Package.Literals.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE);
	}

} //IfcRelAssignsImpl
