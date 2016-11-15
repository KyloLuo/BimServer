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
 * A representation of the model object '<em><b>Ifc Rel Connects With Realizing Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelConnectsWithRealizingElements#getRealizingElements <em>Realizing Elements</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelConnectsWithRealizingElements()
 * @model
 * @generated
 */
public interface IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements {
	/**
	 * Returns the value of the '<em><b>Realizing Elements</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc4.IfcElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc4.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Elements</em>' reference list.
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelConnectsWithRealizingElements_RealizingElements()
	 * @see org.bimserver.models.ifc4.IfcElement#getIsConnectionRealization
	 * @model opposite="IsConnectionRealization"
	 * @generated
	 */
	EList<IfcElement> getRealizingElements();

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #setConnectionType(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelConnectsWithRealizingElements_ConnectionType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getConnectionType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(String)
	 * @generated
	 */
	void unsetConnectionType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Type</em>' attribute is set.
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(String)
	 * @generated
	 */
	boolean isSetConnectionType();

} // IfcRelConnectsWithRealizingElements
