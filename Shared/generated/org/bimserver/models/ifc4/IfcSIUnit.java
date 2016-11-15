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
 * A representation of the model object '<em><b>Ifc SI Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcSIUnit#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcSIUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcSIUnit()
 * @model
 * @generated
 */
public interface IfcSIUnit extends IfcNamedUnit {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcSIPrefix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcSIPrefix
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcSIUnit_Prefix()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSIPrefix getPrefix();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcSIPrefix
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(IfcSIPrefix value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @generated
	 */
	void unsetPrefix();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @generated
	 */
	boolean isSetPrefix();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcSIUnitName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcSIUnitName
	 * @see #setName(IfcSIUnitName)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcSIUnit_Name()
	 * @model
	 * @generated
	 */
	IfcSIUnitName getName();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcSIUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcSIUnitName
	 * @see #getName()
	 * @generated
	 */
	void setName(IfcSIUnitName value);

} // IfcSIUnit
