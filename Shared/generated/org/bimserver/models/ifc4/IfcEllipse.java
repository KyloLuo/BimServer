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
 * A representation of the model object '<em><b>Ifc Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis1 <em>Semi Axis1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis1AsString <em>Semi Axis1 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis2 <em>Semi Axis2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis2AsString <em>Semi Axis2 As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcEllipse()
 * @model
 * @generated
 */
public interface IfcEllipse extends IfcConic {
	/**
	 * Returns the value of the '<em><b>Semi Axis1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis1</em>' attribute.
	 * @see #setSemiAxis1(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcEllipse_SemiAxis1()
	 * @model
	 * @generated
	 */
	double getSemiAxis1();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis1 <em>Semi Axis1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis1</em>' attribute.
	 * @see #getSemiAxis1()
	 * @generated
	 */
	void setSemiAxis1(double value);

	/**
	 * Returns the value of the '<em><b>Semi Axis1 As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis1 As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis1 As String</em>' attribute.
	 * @see #setSemiAxis1AsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcEllipse_SemiAxis1AsString()
	 * @model
	 * @generated
	 */
	String getSemiAxis1AsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis1AsString <em>Semi Axis1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis1 As String</em>' attribute.
	 * @see #getSemiAxis1AsString()
	 * @generated
	 */
	void setSemiAxis1AsString(String value);

	/**
	 * Returns the value of the '<em><b>Semi Axis2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis2</em>' attribute.
	 * @see #setSemiAxis2(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcEllipse_SemiAxis2()
	 * @model
	 * @generated
	 */
	double getSemiAxis2();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis2 <em>Semi Axis2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis2</em>' attribute.
	 * @see #getSemiAxis2()
	 * @generated
	 */
	void setSemiAxis2(double value);

	/**
	 * Returns the value of the '<em><b>Semi Axis2 As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis2 As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis2 As String</em>' attribute.
	 * @see #setSemiAxis2AsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcEllipse_SemiAxis2AsString()
	 * @model
	 * @generated
	 */
	String getSemiAxis2AsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcEllipse#getSemiAxis2AsString <em>Semi Axis2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis2 As String</em>' attribute.
	 * @see #getSemiAxis2AsString()
	 * @generated
	 */
	void setSemiAxis2AsString(String value);

} // IfcEllipse
