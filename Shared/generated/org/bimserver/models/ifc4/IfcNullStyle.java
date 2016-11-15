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
 * A representation of the model object '<em><b>Ifc Null Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcNullStyle#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcNullStyle()
 * @model
 * @generated
 */
public interface IfcNullStyle extends IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcNullStyleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcNullStyleEnum
	 * @see #setWrappedValue(IfcNullStyleEnum)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcNullStyle_WrappedValue()
	 * @model
	 * @generated
	 */
	IfcNullStyleEnum getWrappedValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcNullStyle#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcNullStyleEnum
	 * @see #getWrappedValue()
	 * @generated
	 */
	void setWrappedValue(IfcNullStyleEnum value);

} // IfcNullStyle
