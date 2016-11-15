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
import org.bimserver.models.ifc4.IfcElementCompositionEnum;
import org.bimserver.models.ifc4.IfcSpatialStructureElement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Spatial Structure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcSpatialStructureElementImpl#getCompositionType <em>Composition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpatialStructureElementImpl extends IfcSpatialElementImpl implements IfcSpatialStructureElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpatialStructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_SPATIAL_STRUCTURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnum getCompositionType() {
		return (IfcElementCompositionEnum) eGet(Ifc4Package.Literals.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionType(IfcElementCompositionEnum newCompositionType) {
		eSet(Ifc4Package.Literals.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE, newCompositionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompositionType() {
		eUnset(Ifc4Package.Literals.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompositionType() {
		return eIsSet(Ifc4Package.Literals.IFC_SPATIAL_STRUCTURE_ELEMENT__COMPOSITION_TYPE);
	}

} //IfcSpatialStructureElementImpl
