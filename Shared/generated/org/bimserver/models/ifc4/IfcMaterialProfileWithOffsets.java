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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Profile With Offsets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcMaterialProfileWithOffsets#getOffsetValues <em>Offset Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcMaterialProfileWithOffsets#getOffsetValuesAsString <em>Offset Values As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcMaterialProfileWithOffsets()
 * @model
 * @generated
 */
public interface IfcMaterialProfileWithOffsets extends IfcMaterialProfile {
	/**
	 * Returns the value of the '<em><b>Offset Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Values</em>' attribute list.
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcMaterialProfileWithOffsets_OffsetValues()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getOffsetValues();

	/**
	 * Returns the value of the '<em><b>Offset Values As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Values As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Values As String</em>' attribute list.
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcMaterialProfileWithOffsets_OffsetValuesAsString()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOffsetValuesAsString();

} // IfcMaterialProfileWithOffsets
