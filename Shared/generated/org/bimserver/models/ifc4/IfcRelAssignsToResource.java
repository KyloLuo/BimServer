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
 * A representation of the model object '<em><b>Ifc Rel Assigns To Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssignsToResource()
 * @model
 * @generated
 */
public interface IfcRelAssignsToResource extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Resource</em>' reference.
	 * @see #setRelatingResource(IfcResourceSelect)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssignsToResource_RelatingResource()
	 * @model
	 * @generated
	 */
	IfcResourceSelect getRelatingResource();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Resource</em>' reference.
	 * @see #getRelatingResource()
	 * @generated
	 */
	void setRelatingResource(IfcResourceSelect value);

} // IfcRelAssignsToResource
