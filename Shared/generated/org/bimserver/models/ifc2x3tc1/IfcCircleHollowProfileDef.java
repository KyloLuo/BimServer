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
package org.bimserver.models.ifc2x3tc1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Circle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCircleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCircleHollowProfileDef#getWallThicknessAsString <em>Wall Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCircleHollowProfileDef()
 * @model
 * @generated
 */
public interface IfcCircleHollowProfileDef extends IfcCircleProfileDef {
	/**
	 * Returns the value of the '<em><b>Wall Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall Thickness</em>' attribute.
	 * @see #setWallThickness(double)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCircleHollowProfileDef_WallThickness()
	 * @model
	 * @generated
	 */
	double getWallThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCircleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Thickness</em>' attribute.
	 * @see #getWallThickness()
	 * @generated
	 */
	void setWallThickness(double value);

	/**
	 * Returns the value of the '<em><b>Wall Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall Thickness As String</em>' attribute.
	 * @see #setWallThicknessAsString(String)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCircleHollowProfileDef_WallThicknessAsString()
	 * @model
	 * @generated
	 */
	String getWallThicknessAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCircleHollowProfileDef#getWallThicknessAsString <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Thickness As String</em>' attribute.
	 * @see #getWallThicknessAsString()
	 * @generated
	 */
	void setWallThicknessAsString(String value);

} // IfcCircleHollowProfileDef
