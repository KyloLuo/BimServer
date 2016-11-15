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
 * A representation of the model object '<em><b>Ifc Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getTag <em>Tag</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasStructuralMember <em>Has Structural Member</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getFillsVoids <em>Fills Voids</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasProjections <em>Has Projections</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getReferencedInStructures <em>Referenced In Structures</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasPorts <em>Has Ports</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasOpenings <em>Has Openings</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getProvidesBoundaries <em>Provides Boundaries</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getConnectedFrom <em>Connected From</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcElement#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement()
 * @model
 * @generated
 */
public interface IfcElement extends IfcProduct, IfcStructuralActivityAssignmentSelect {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #setTag(String)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_Tag()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	boolean isSetTag();

	/**
	 * Returns the value of the '<em><b>Has Structural Member</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Structural Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Structural Member</em>' reference list.
	 * @see #isSetHasStructuralMember()
	 * @see #unsetHasStructuralMember()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_HasStructuralMember()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatingElement
	 * @model opposite="RelatingElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralElement> getHasStructuralMember();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasStructuralMember <em>Has Structural Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasStructuralMember()
	 * @see #getHasStructuralMember()
	 * @generated
	 */
	void unsetHasStructuralMember();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasStructuralMember <em>Has Structural Member</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Structural Member</em>' reference list is set.
	 * @see #unsetHasStructuralMember()
	 * @see #getHasStructuralMember()
	 * @generated
	 */
	boolean isSetHasStructuralMember();

	/**
	 * Returns the value of the '<em><b>Fills Voids</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelFillsElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fills Voids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fills Voids</em>' reference list.
	 * @see #isSetFillsVoids()
	 * @see #unsetFillsVoids()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_FillsVoids()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelFillsElement#getRelatedBuildingElement
	 * @model opposite="RelatedBuildingElement" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelFillsElement> getFillsVoids();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getFillsVoids <em>Fills Voids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillsVoids()
	 * @see #getFillsVoids()
	 * @generated
	 */
	void unsetFillsVoids();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getFillsVoids <em>Fills Voids</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fills Voids</em>' reference list is set.
	 * @see #unsetFillsVoids()
	 * @see #getFillsVoids()
	 * @generated
	 */
	boolean isSetFillsVoids();

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see #isSetConnectedTo()
	 * @see #unsetConnectedTo()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_ConnectedTo()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements#getRelatingElement
	 * @model opposite="RelatingElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsElements> getConnectedTo();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getConnectedTo <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectedTo()
	 * @see #getConnectedTo()
	 * @generated
	 */
	void unsetConnectedTo();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getConnectedTo <em>Connected To</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connected To</em>' reference list is set.
	 * @see #unsetConnectedTo()
	 * @see #getConnectedTo()
	 * @generated
	 */
	boolean isSetConnectedTo();

	/**
	 * Returns the value of the '<em><b>Has Coverings</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelCoversBldgElements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelCoversBldgElements#getRelatingBuildingElement <em>Relating Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Coverings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Coverings</em>' reference list.
	 * @see #isSetHasCoverings()
	 * @see #unsetHasCoverings()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_HasCoverings()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelCoversBldgElements#getRelatingBuildingElement
	 * @model opposite="RelatingBuildingElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelCoversBldgElements> getHasCoverings();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasCoverings <em>Has Coverings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasCoverings()
	 * @see #getHasCoverings()
	 * @generated
	 */
	void unsetHasCoverings();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasCoverings <em>Has Coverings</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Coverings</em>' reference list is set.
	 * @see #unsetHasCoverings()
	 * @see #getHasCoverings()
	 * @generated
	 */
	boolean isSetHasCoverings();

	/**
	 * Returns the value of the '<em><b>Has Projections</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelProjectsElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Projections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Projections</em>' reference list.
	 * @see #isSetHasProjections()
	 * @see #unsetHasProjections()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_HasProjections()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelProjectsElement#getRelatingElement
	 * @model opposite="RelatingElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelProjectsElement> getHasProjections();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasProjections <em>Has Projections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasProjections()
	 * @see #getHasProjections()
	 * @generated
	 */
	void unsetHasProjections();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasProjections <em>Has Projections</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Projections</em>' reference list is set.
	 * @see #unsetHasProjections()
	 * @see #getHasProjections()
	 * @generated
	 */
	boolean isSetHasProjections();

	/**
	 * Returns the value of the '<em><b>Referenced In Structures</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelReferencedInSpatialStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced In Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced In Structures</em>' reference list.
	 * @see #isSetReferencedInStructures()
	 * @see #unsetReferencedInStructures()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_ReferencedInStructures()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcRelReferencedInSpatialStructure> getReferencedInStructures();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getReferencedInStructures <em>Referenced In Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencedInStructures()
	 * @see #getReferencedInStructures()
	 * @generated
	 */
	void unsetReferencedInStructures();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getReferencedInStructures <em>Referenced In Structures</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referenced In Structures</em>' reference list is set.
	 * @see #unsetReferencedInStructures()
	 * @see #getReferencedInStructures()
	 * @generated
	 */
	boolean isSetReferencedInStructures();

	/**
	 * Returns the value of the '<em><b>Has Ports</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsPortToElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ports</em>' reference list.
	 * @see #isSetHasPorts()
	 * @see #unsetHasPorts()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_HasPorts()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelConnectsPortToElement#getRelatedElement
	 * @model opposite="RelatedElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsPortToElement> getHasPorts();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasPorts <em>Has Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasPorts()
	 * @see #getHasPorts()
	 * @generated
	 */
	void unsetHasPorts();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasPorts <em>Has Ports</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Ports</em>' reference list is set.
	 * @see #unsetHasPorts()
	 * @see #getHasPorts()
	 * @generated
	 */
	boolean isSetHasPorts();

	/**
	 * Returns the value of the '<em><b>Has Openings</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelVoidsElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Openings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Openings</em>' reference list.
	 * @see #isSetHasOpenings()
	 * @see #unsetHasOpenings()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_HasOpenings()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelVoidsElement#getRelatingBuildingElement
	 * @model opposite="RelatingBuildingElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelVoidsElement> getHasOpenings();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasOpenings <em>Has Openings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasOpenings()
	 * @see #getHasOpenings()
	 * @generated
	 */
	void unsetHasOpenings();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getHasOpenings <em>Has Openings</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Openings</em>' reference list is set.
	 * @see #unsetHasOpenings()
	 * @see #getHasOpenings()
	 * @generated
	 */
	boolean isSetHasOpenings();

	/**
	 * Returns the value of the '<em><b>Is Connection Realization</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsWithRealizingElements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsWithRealizingElements#getRealizingElements <em>Realizing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connection Realization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connection Realization</em>' reference list.
	 * @see #isSetIsConnectionRealization()
	 * @see #unsetIsConnectionRealization()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_IsConnectionRealization()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelConnectsWithRealizingElements#getRealizingElements
	 * @model opposite="RealizingElements" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsWithRealizingElements> getIsConnectionRealization();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConnectionRealization()
	 * @see #getIsConnectionRealization()
	 * @generated
	 */
	void unsetIsConnectionRealization();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Connection Realization</em>' reference list is set.
	 * @see #unsetIsConnectionRealization()
	 * @see #getIsConnectionRealization()
	 * @generated
	 */
	boolean isSetIsConnectionRealization();

	/**
	 * Returns the value of the '<em><b>Provides Boundaries</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelSpaceBoundary}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelSpaceBoundary#getRelatedBuildingElement <em>Related Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Boundaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Boundaries</em>' reference list.
	 * @see #isSetProvidesBoundaries()
	 * @see #unsetProvidesBoundaries()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_ProvidesBoundaries()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelSpaceBoundary#getRelatedBuildingElement
	 * @model opposite="RelatedBuildingElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelSpaceBoundary> getProvidesBoundaries();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getProvidesBoundaries <em>Provides Boundaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvidesBoundaries()
	 * @see #getProvidesBoundaries()
	 * @generated
	 */
	void unsetProvidesBoundaries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getProvidesBoundaries <em>Provides Boundaries</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provides Boundaries</em>' reference list is set.
	 * @see #unsetProvidesBoundaries()
	 * @see #getProvidesBoundaries()
	 * @generated
	 */
	boolean isSetProvidesBoundaries();

	/**
	 * Returns the value of the '<em><b>Connected From</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected From</em>' reference list.
	 * @see #isSetConnectedFrom()
	 * @see #unsetConnectedFrom()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_ConnectedFrom()
	 * @see org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements#getRelatedElement
	 * @model opposite="RelatedElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsElements> getConnectedFrom();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getConnectedFrom <em>Connected From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectedFrom()
	 * @see #getConnectedFrom()
	 * @generated
	 */
	void unsetConnectedFrom();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getConnectedFrom <em>Connected From</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connected From</em>' reference list is set.
	 * @see #unsetConnectedFrom()
	 * @see #getConnectedFrom()
	 * @generated
	 */
	boolean isSetConnectedFrom();

	/**
	 * Returns the value of the '<em><b>Contained In Structure</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcRelContainedInSpatialStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Structure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Structure</em>' reference list.
	 * @see #isSetContainedInStructure()
	 * @see #unsetContainedInStructure()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcElement_ContainedInStructure()
	 * @model unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelContainedInSpatialStructure> getContainedInStructure();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getContainedInStructure <em>Contained In Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainedInStructure()
	 * @see #getContainedInStructure()
	 * @generated
	 */
	void unsetContainedInStructure();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcElement#getContainedInStructure <em>Contained In Structure</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contained In Structure</em>' reference list is set.
	 * @see #unsetContainedInStructure()
	 * @see #getContainedInStructure()
	 * @generated
	 */
	boolean isSetContainedInStructure();

} // IfcElement
