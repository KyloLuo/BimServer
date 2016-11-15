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
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralActivity()
 * @model
 * @generated
 */
public interface IfcRelConnectsStructuralActivity extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcStructuralActivityAssignmentSelect)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralActivity_RelatingElement()
	 * @model
	 * @generated
	 */
	IfcStructuralActivityAssignmentSelect getRelatingElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcStructuralActivityAssignmentSelect value);

	/**
	 * Returns the value of the '<em><b>Related Structural Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Activity</em>' reference.
	 * @see #setRelatedStructuralActivity(IfcStructuralActivity)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralActivity_RelatedStructuralActivity()
	 * @see org.bimserver.models.ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem
	 * @model opposite="AssignedToStructuralItem"
	 * @generated
	 */
	IfcStructuralActivity getRelatedStructuralActivity();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Activity</em>' reference.
	 * @see #getRelatedStructuralActivity()
	 * @generated
	 */
	void setRelatedStructuralActivity(IfcStructuralActivity value);

} // IfcRelConnectsStructuralActivity
