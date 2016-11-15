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
 * A representation of the model object '<em><b>Ifc Rel Connects Port To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelConnectsPortToElement()
 * @model
 * @generated
 */
public interface IfcRelConnectsPortToElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc4.IfcPort#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Port</em>' reference.
	 * @see #setRelatingPort(IfcPort)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelConnectsPortToElement_RelatingPort()
	 * @see org.bimserver.models.ifc4.IfcPort#getContainedIn
	 * @model opposite="ContainedIn"
	 * @generated
	 */
	IfcPort getRelatingPort();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Port</em>' reference.
	 * @see #getRelatingPort()
	 * @generated
	 */
	void setRelatingPort(IfcPort value);

	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc4.IfcDistributionElement#getHasPorts <em>Has Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' reference.
	 * @see #setRelatedElement(IfcDistributionElement)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelConnectsPortToElement_RelatedElement()
	 * @see org.bimserver.models.ifc4.IfcDistributionElement#getHasPorts
	 * @model opposite="HasPorts"
	 * @generated
	 */
	IfcDistributionElement getRelatedElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Element</em>' reference.
	 * @see #getRelatedElement()
	 * @generated
	 */
	void setRelatedElement(IfcDistributionElement value);

} // IfcRelConnectsPortToElement
