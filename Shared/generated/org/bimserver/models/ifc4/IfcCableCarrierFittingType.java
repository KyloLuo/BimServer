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
 * A representation of the model object '<em><b>Ifc Cable Carrier Fitting Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcCableCarrierFittingType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCableCarrierFittingType()
 * @model
 * @generated
 */
public interface IfcCableCarrierFittingType extends IfcFlowFittingType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcCableCarrierFittingTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcCableCarrierFittingTypeEnum
	 * @see #setPredefinedType(IfcCableCarrierFittingTypeEnum)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcCableCarrierFittingType_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcCableCarrierFittingTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcCableCarrierFittingType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcCableCarrierFittingTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCableCarrierFittingTypeEnum value);

} // IfcCableCarrierFittingType
