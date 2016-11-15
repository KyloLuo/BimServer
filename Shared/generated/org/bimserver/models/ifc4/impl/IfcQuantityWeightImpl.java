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
import org.bimserver.models.ifc4.IfcQuantityWeight;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcQuantityWeightImpl#getWeightValue <em>Weight Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcQuantityWeightImpl#getWeightValueAsString <em>Weight Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcQuantityWeightImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityWeightImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityWeight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityWeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_QUANTITY_WEIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeightValue() {
		return (Double) eGet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightValue(double newWeightValue) {
		eSet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE, newWeightValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeightValueAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightValueAsString(String newWeightValueAsString) {
		eSet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING, newWeightValueAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return (String) eGet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__FORMULA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		eSet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__FORMULA, newFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormula() {
		eUnset(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__FORMULA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormula() {
		return eIsSet(Ifc4Package.Literals.IFC_QUANTITY_WEIGHT__FORMULA);
	}

} //IfcQuantityWeightImpl
