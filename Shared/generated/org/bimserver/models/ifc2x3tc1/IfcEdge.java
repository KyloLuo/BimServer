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
 * A representation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcEdge#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcEdge#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcEdge()
 * @model
 * @generated
 */
public interface IfcEdge extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Edge Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Start</em>' reference.
	 * @see #setEdgeStart(IfcVertex)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcEdge_EdgeStart()
	 * @model
	 * @generated
	 */
	IfcVertex getEdgeStart();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcEdge#getEdgeStart <em>Edge Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Start</em>' reference.
	 * @see #getEdgeStart()
	 * @generated
	 */
	void setEdgeStart(IfcVertex value);

	/**
	 * Returns the value of the '<em><b>Edge End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge End</em>' reference.
	 * @see #setEdgeEnd(IfcVertex)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcEdge_EdgeEnd()
	 * @model
	 * @generated
	 */
	IfcVertex getEdgeEnd();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcEdge#getEdgeEnd <em>Edge End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge End</em>' reference.
	 * @see #getEdgeEnd()
	 * @generated
	 */
	void setEdgeEnd(IfcVertex value);

} // IfcEdge
