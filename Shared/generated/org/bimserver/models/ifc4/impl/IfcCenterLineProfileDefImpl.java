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
import org.bimserver.models.ifc4.IfcCenterLineProfileDef;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Center Line Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCenterLineProfileDefImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCenterLineProfileDefImpl#getThicknessAsString <em>Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCenterLineProfileDefImpl extends IfcArbitraryOpenProfileDefImpl implements IfcCenterLineProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCenterLineProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_CENTER_LINE_PROFILE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThickness() {
		return (Double) eGet(Ifc4Package.Literals.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(double newThickness) {
		eSet(Ifc4Package.Literals.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS, newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThicknessAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThicknessAsString(String newThicknessAsString) {
		eSet(Ifc4Package.Literals.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING, newThicknessAsString);
	}

} //IfcCenterLineProfileDefImpl
