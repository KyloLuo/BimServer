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
 * A representation of the model object '<em><b>Ifc Property Table Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningValues <em>Defining Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedValues <em>Defined Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getCurveInterpolation <em>Curve Interpolation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue()
 * @model
 * @generated
 */
public interface IfcPropertyTableValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Defining Values</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc4.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Values</em>' reference list.
	 * @see #isSetDefiningValues()
	 * @see #unsetDefiningValues()
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue_DefiningValues()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcValue> getDefiningValues();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningValues <em>Defining Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefiningValues()
	 * @see #getDefiningValues()
	 * @generated
	 */
	void unsetDefiningValues();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningValues <em>Defining Values</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defining Values</em>' reference list is set.
	 * @see #unsetDefiningValues()
	 * @see #getDefiningValues()
	 * @generated
	 */
	boolean isSetDefiningValues();

	/**
	 * Returns the value of the '<em><b>Defined Values</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc4.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Values</em>' reference list.
	 * @see #isSetDefinedValues()
	 * @see #unsetDefinedValues()
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue_DefinedValues()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcValue> getDefinedValues();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedValues <em>Defined Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinedValues()
	 * @see #getDefinedValues()
	 * @generated
	 */
	void unsetDefinedValues();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedValues <em>Defined Values</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defined Values</em>' reference list is set.
	 * @see #unsetDefinedValues()
	 * @see #getDefinedValues()
	 * @generated
	 */
	boolean isSetDefinedValues();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #isSetExpression()
	 * @see #unsetExpression()
	 * @see #setExpression(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue_Expression()
	 * @model unsettable="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #isSetExpression()
	 * @see #unsetExpression()
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpression()
	 * @see #getExpression()
	 * @see #setExpression(String)
	 * @generated
	 */
	void unsetExpression();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expression</em>' attribute is set.
	 * @see #unsetExpression()
	 * @see #getExpression()
	 * @see #setExpression(String)
	 * @generated
	 */
	boolean isSetExpression();

	/**
	 * Returns the value of the '<em><b>Defining Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Unit</em>' reference.
	 * @see #isSetDefiningUnit()
	 * @see #unsetDefiningUnit()
	 * @see #setDefiningUnit(IfcUnit)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue_DefiningUnit()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcUnit getDefiningUnit();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Unit</em>' reference.
	 * @see #isSetDefiningUnit()
	 * @see #unsetDefiningUnit()
	 * @see #getDefiningUnit()
	 * @generated
	 */
	void setDefiningUnit(IfcUnit value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefiningUnit()
	 * @see #getDefiningUnit()
	 * @see #setDefiningUnit(IfcUnit)
	 * @generated
	 */
	void unsetDefiningUnit();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defining Unit</em>' reference is set.
	 * @see #unsetDefiningUnit()
	 * @see #getDefiningUnit()
	 * @see #setDefiningUnit(IfcUnit)
	 * @generated
	 */
	boolean isSetDefiningUnit();

	/**
	 * Returns the value of the '<em><b>Defined Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Unit</em>' reference.
	 * @see #isSetDefinedUnit()
	 * @see #unsetDefinedUnit()
	 * @see #setDefinedUnit(IfcUnit)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue_DefinedUnit()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcUnit getDefinedUnit();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Unit</em>' reference.
	 * @see #isSetDefinedUnit()
	 * @see #unsetDefinedUnit()
	 * @see #getDefinedUnit()
	 * @generated
	 */
	void setDefinedUnit(IfcUnit value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinedUnit()
	 * @see #getDefinedUnit()
	 * @see #setDefinedUnit(IfcUnit)
	 * @generated
	 */
	void unsetDefinedUnit();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defined Unit</em>' reference is set.
	 * @see #unsetDefinedUnit()
	 * @see #getDefinedUnit()
	 * @see #setDefinedUnit(IfcUnit)
	 * @generated
	 */
	boolean isSetDefinedUnit();

	/**
	 * Returns the value of the '<em><b>Curve Interpolation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcCurveInterpolationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Interpolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Interpolation</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcCurveInterpolationEnum
	 * @see #isSetCurveInterpolation()
	 * @see #unsetCurveInterpolation()
	 * @see #setCurveInterpolation(IfcCurveInterpolationEnum)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcPropertyTableValue_CurveInterpolation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCurveInterpolationEnum getCurveInterpolation();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getCurveInterpolation <em>Curve Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Interpolation</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcCurveInterpolationEnum
	 * @see #isSetCurveInterpolation()
	 * @see #unsetCurveInterpolation()
	 * @see #getCurveInterpolation()
	 * @generated
	 */
	void setCurveInterpolation(IfcCurveInterpolationEnum value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getCurveInterpolation <em>Curve Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveInterpolation()
	 * @see #getCurveInterpolation()
	 * @see #setCurveInterpolation(IfcCurveInterpolationEnum)
	 * @generated
	 */
	void unsetCurveInterpolation();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcPropertyTableValue#getCurveInterpolation <em>Curve Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Interpolation</em>' attribute is set.
	 * @see #unsetCurveInterpolation()
	 * @see #getCurveInterpolation()
	 * @see #setCurveInterpolation(IfcCurveInterpolationEnum)
	 * @generated
	 */
	boolean isSetCurveInterpolation();

} // IfcPropertyTableValue
