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
import org.bimserver.models.ifc4.IfcAxis2Placement3D;
import org.bimserver.models.ifc4.IfcStructuralPointConnection;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Point Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStructuralPointConnectionImpl#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralPointConnectionImpl extends IfcStructuralConnectionImpl implements IfcStructuralPointConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralPointConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_STRUCTURAL_POINT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getConditionCoordinateSystem() {
		return (IfcAxis2Placement3D) eGet(Ifc4Package.Literals.IFC_STRUCTURAL_POINT_CONNECTION__CONDITION_COORDINATE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionCoordinateSystem(IfcAxis2Placement3D newConditionCoordinateSystem) {
		eSet(Ifc4Package.Literals.IFC_STRUCTURAL_POINT_CONNECTION__CONDITION_COORDINATE_SYSTEM, newConditionCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionCoordinateSystem() {
		eUnset(Ifc4Package.Literals.IFC_STRUCTURAL_POINT_CONNECTION__CONDITION_COORDINATE_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionCoordinateSystem() {
		return eIsSet(Ifc4Package.Literals.IFC_STRUCTURAL_POINT_CONNECTION__CONDITION_COORDINATE_SYSTEM);
	}

} //IfcStructuralPointConnectionImpl
