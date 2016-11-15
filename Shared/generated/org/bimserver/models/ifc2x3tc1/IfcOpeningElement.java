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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Opening Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcOpeningElement()
 * @model
 * @generated
 */
public interface IfcOpeningElement extends IfcFeatureElementSubtraction {
	/**
	 * Returns the value of the '<em><b>Has Fillings</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelFillsElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fillings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fillings</em>' reference list.
	 * @see #isSetHasFillings()
	 * @see #unsetHasFillings()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcOpeningElement_HasFillings()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelFillsElement#getRelatingOpeningElement
	 * @model opposite="RelatingOpeningElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelFillsElement> getHasFillings();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasFillings()
	 * @see #getHasFillings()
	 * @generated
	 */
	void unsetHasFillings();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Fillings</em>' reference list is set.
	 * @see #unsetHasFillings()
	 * @see #getHasFillings()
	 * @generated
	 */
	boolean isSetHasFillings();

} // IfcOpeningElement
