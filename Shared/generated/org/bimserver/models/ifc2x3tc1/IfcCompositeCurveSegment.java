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
 * A representation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getParentCurve <em>Parent Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getUsingCurves <em>Using Curves</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCompositeCurveSegment()
 * @model
 * @generated
 */
public interface IfcCompositeCurveSegment extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3tc1.IfcTransitionCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see org.bimserver.models.ifc2x3tc1.IfcTransitionCode
	 * @see #setTransition(IfcTransitionCode)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCompositeCurveSegment_Transition()
	 * @model
	 * @generated
	 */
	IfcTransitionCode getTransition();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see org.bimserver.models.ifc2x3tc1.IfcTransitionCode
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(IfcTransitionCode value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see org.bimserver.models.ifc2x3tc1.Tristate
	 * @see #setSameSense(Tristate)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCompositeCurveSegment_SameSense()
	 * @model
	 * @generated
	 */
	Tristate getSameSense();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see org.bimserver.models.ifc2x3tc1.Tristate
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Tristate value);

	/**
	 * Returns the value of the '<em><b>Parent Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Curve</em>' reference.
	 * @see #setParentCurve(IfcCurve)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCompositeCurveSegment_ParentCurve()
	 * @model
	 * @generated
	 */
	IfcCurve getParentCurve();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getParentCurve <em>Parent Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Curve</em>' reference.
	 * @see #getParentCurve()
	 * @generated
	 */
	void setParentCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Using Curves</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurve}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurve#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Curves</em>' reference list.
	 * @see #isSetUsingCurves()
	 * @see #unsetUsingCurves()
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCompositeCurveSegment_UsingCurves()
	 * @see org.bimserver.models.ifc2x3tc1.IfcCompositeCurve#getSegments
	 * @model opposite="Segments" unsettable="true"
	 * @generated
	 */
	EList<IfcCompositeCurve> getUsingCurves();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getUsingCurves <em>Using Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsingCurves()
	 * @see #getUsingCurves()
	 * @generated
	 */
	void unsetUsingCurves();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getUsingCurves <em>Using Curves</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Using Curves</em>' reference list is set.
	 * @see #unsetUsingCurves()
	 * @see #getUsingCurves()
	 * @generated
	 */
	boolean isSetUsingCurves();

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #setDim(int)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcCompositeCurveSegment_Dim()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	void unsetDim();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment#getDim <em>Dim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dim</em>' attribute is set.
	 * @see #unsetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	boolean isSetDim();

} // IfcCompositeCurveSegment
