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
import org.bimserver.models.ifc4.IfcExternalSpatialElement;
import org.bimserver.models.ifc4.IfcExternalSpatialElementTypeEnum;
import org.bimserver.models.ifc4.IfcRelSpaceBoundary;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc External Spatial Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcExternalSpatialElementImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcExternalSpatialElementImpl#getBoundedBy <em>Bounded By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcExternalSpatialElementImpl extends IfcExternalSpatialStructureElementImpl implements IfcExternalSpatialElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExternalSpatialElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternalSpatialElementTypeEnum getPredefinedType() {
		return (IfcExternalSpatialElementTypeEnum) eGet(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcExternalSpatialElementTypeEnum newPredefinedType) {
		eSet(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__PREDEFINED_TYPE, newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__PREDEFINED_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__PREDEFINED_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelSpaceBoundary> getBoundedBy() {
		return (EList<IfcRelSpaceBoundary>) eGet(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__BOUNDED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoundedBy() {
		eUnset(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__BOUNDED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoundedBy() {
		return eIsSet(Ifc4Package.Literals.IFC_EXTERNAL_SPATIAL_ELEMENT__BOUNDED_BY);
	}

} //IfcExternalSpatialElementImpl
