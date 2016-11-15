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
import org.bimserver.models.ifc2x3tc1.IfcSlippageConnectionCondition;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Slippage Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageX <em>Slippage X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageXAsString <em>Slippage XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageY <em>Slippage Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageYAsString <em>Slippage YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageZ <em>Slippage Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageZAsString <em>Slippage ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSlippageConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcSlippageConnectionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSlippageConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlippageX() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageX(double newSlippageX) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X, newSlippageX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageX() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageX() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlippageXAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageXAsString(String newSlippageXAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING, newSlippageXAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageXAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageXAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlippageY() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageY(double newSlippageY) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y, newSlippageY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageY() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageY() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlippageYAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageYAsString(String newSlippageYAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING, newSlippageYAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageYAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageYAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlippageZ() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageZ(double newSlippageZ) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z, newSlippageZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageZ() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageZ() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlippageZAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageZAsString(String newSlippageZAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING, newSlippageZAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageZAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageZAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING);
	}

} //IfcSlippageConnectionConditionImpl
