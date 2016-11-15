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
 * A representation of the model object '<em><b>Ifc Quantity Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcQuantityCount#getCountValue <em>Count Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcQuantityCount#getCountValueAsString <em>Count Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityCount()
 * @model
 * @generated
 */
public interface IfcQuantityCount extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Count Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Value</em>' attribute.
	 * @see #setCountValue(double)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityCount_CountValue()
	 * @model
	 * @generated
	 */
	double getCountValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcQuantityCount#getCountValue <em>Count Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Value</em>' attribute.
	 * @see #getCountValue()
	 * @generated
	 */
	void setCountValue(double value);

	/**
	 * Returns the value of the '<em><b>Count Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Value As String</em>' attribute.
	 * @see #setCountValueAsString(String)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityCount_CountValueAsString()
	 * @model
	 * @generated
	 */
	String getCountValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcQuantityCount#getCountValueAsString <em>Count Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Value As String</em>' attribute.
	 * @see #getCountValueAsString()
	 * @generated
	 */
	void setCountValueAsString(String value);

} // IfcQuantityCount
