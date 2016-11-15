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
 * A representation of the model object '<em><b>Ifc Dimension Curve Terminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcDimensionCurveTerminator#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcDimensionCurveTerminator()
 * @model
 * @generated
 */
public interface IfcDimensionCurveTerminator extends IfcTerminatorSymbol {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3tc1.IfcDimensionExtentUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.bimserver.models.ifc2x3tc1.IfcDimensionExtentUsage
	 * @see #setRole(IfcDimensionExtentUsage)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcDimensionCurveTerminator_Role()
	 * @model
	 * @generated
	 */
	IfcDimensionExtentUsage getRole();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcDimensionCurveTerminator#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.bimserver.models.ifc2x3tc1.IfcDimensionExtentUsage
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IfcDimensionExtentUsage value);

} // IfcDimensionCurveTerminator
