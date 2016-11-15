/**
 * Copyright (C) 2009-2013 BIMserver.org
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
package org.bimserver.models.ifc4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Group By Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelAssignsToGroupByFactor#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelAssignsToGroupByFactor#getFactorAsString <em>Factor As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssignsToGroupByFactor()
 * @model
 * @generated
 */
public interface IfcRelAssignsToGroupByFactor extends IfcRelAssignsToGroup {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssignsToGroupByFactor_Factor()
	 * @model
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelAssignsToGroupByFactor#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Returns the value of the '<em><b>Factor As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor As String</em>' attribute.
	 * @see #setFactorAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssignsToGroupByFactor_FactorAsString()
	 * @model
	 * @generated
	 */
	String getFactorAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelAssignsToGroupByFactor#getFactorAsString <em>Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor As String</em>' attribute.
	 * @see #getFactorAsString()
	 * @generated
	 */
	void setFactorAsString(String value);

} // IfcRelAssignsToGroupByFactor
