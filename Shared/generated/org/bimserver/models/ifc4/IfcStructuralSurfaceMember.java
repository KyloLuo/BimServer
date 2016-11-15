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
 * A representation of the model object '<em><b>Ifc Structural Surface Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcStructuralSurfaceMember()
 * @model
 * @generated
 */
public interface IfcStructuralSurfaceMember extends IfcStructuralMember {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcStructuralSurfaceMemberTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcStructuralSurfaceMemberTypeEnum
	 * @see #setPredefinedType(IfcStructuralSurfaceMemberTypeEnum)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcStructuralSurfaceMember_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcStructuralSurfaceMemberTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcStructuralSurfaceMemberTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcStructuralSurfaceMemberTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcStructuralSurfaceMember_Thickness()
	 * @model unsettable="true"
	 * @generated
	 */
	double getThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(double)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' attribute is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(double)
	 * @generated
	 */
	boolean isSetThickness();

	/**
	 * Returns the value of the '<em><b>Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness As String</em>' attribute.
	 * @see #isSetThicknessAsString()
	 * @see #unsetThicknessAsString()
	 * @see #setThicknessAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcStructuralSurfaceMember_ThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getThicknessAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness As String</em>' attribute.
	 * @see #isSetThicknessAsString()
	 * @see #unsetThicknessAsString()
	 * @see #getThicknessAsString()
	 * @generated
	 */
	void setThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThicknessAsString()
	 * @see #getThicknessAsString()
	 * @see #setThicknessAsString(String)
	 * @generated
	 */
	void unsetThicknessAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness As String</em>' attribute is set.
	 * @see #unsetThicknessAsString()
	 * @see #getThicknessAsString()
	 * @see #setThicknessAsString(String)
	 * @generated
	 */
	boolean isSetThicknessAsString();

} // IfcStructuralSurfaceMember
