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
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDoor;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDoorImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDoorImpl#getOverallHeightAsString <em>Overall Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDoorImpl#getOverallWidth <em>Overall Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDoorImpl#getOverallWidthAsString <em>Overall Width As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorImpl extends IfcBuildingElementImpl implements IfcDoor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_DOOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallHeight() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(double newOverallHeight) {
		eSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT, newOverallHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallHeight() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallHeight() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallHeightAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeightAsString(String newOverallHeightAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT_AS_STRING, newOverallHeightAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallHeightAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallHeightAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_HEIGHT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallWidth() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidth(double newOverallWidth) {
		eSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH, newOverallWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallWidth() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallWidth() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallWidthAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidthAsString(String newOverallWidthAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH_AS_STRING, newOverallWidthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallWidthAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallWidthAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_DOOR__OVERALL_WIDTH_AS_STRING);
	}

} //IfcDoorImpl
