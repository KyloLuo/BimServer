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
 * A representation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralConnection()
 * @model
 * @generated
 */
public interface IfcStructuralConnection extends IfcStructuralItem {
	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' reference.
	 * @see #isSetAppliedCondition()
	 * @see #unsetAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralConnection_AppliedCondition()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcBoundaryCondition getAppliedCondition();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' reference.
	 * @see #isSetAppliedCondition()
	 * @see #unsetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(IfcBoundaryCondition value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @generated
	 */
	void unsetAppliedCondition();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applied Condition</em>' reference is set.
	 * @see #unsetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @generated
	 */
	boolean isSetAppliedCondition();

	/**
	 * Returns the value of the '<em><b>Connects Structural Members</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects Structural Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects Structural Members</em>' reference list.
	 * @see #isSetConnectsStructuralMembers()
	 * @see #unsetConnectsStructuralMembers()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralConnection_ConnectsStructuralMembers()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember#getRelatedStructuralConnection
	 * @model opposite="RelatedStructuralConnection" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectsStructuralMembers()
	 * @see #getConnectsStructuralMembers()
	 * @generated
	 */
	void unsetConnectsStructuralMembers();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connects Structural Members</em>' reference list is set.
	 * @see #unsetConnectsStructuralMembers()
	 * @see #getConnectsStructuralMembers()
	 * @generated
	 */
	boolean isSetConnectsStructuralMembers();

} // IfcStructuralConnection
