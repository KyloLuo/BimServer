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
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcCartesianPoint;
import org.bimserver.models.ifc4.IfcCartesianTransformationOperator;
import org.bimserver.models.ifc4.IfcDirection;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCartesianTransformationOperatorImpl#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCartesianTransformationOperatorImpl#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCartesianTransformationOperatorImpl#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCartesianTransformationOperatorImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCartesianTransformationOperatorImpl#getScaleAsString <em>Scale As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcCartesianTransformationOperatorImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperatorImpl extends IfcGeometricRepresentationItemImpl implements IfcCartesianTransformationOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis1() {
		return (IfcDirection) eGet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis1(IfcDirection newAxis1) {
		eSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, newAxis1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxis1() {
		eUnset(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxis1() {
		return eIsSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis2() {
		return (IfcDirection) eGet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis2(IfcDirection newAxis2) {
		eSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, newAxis2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxis2() {
		eUnset(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxis2() {
		return eIsSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getLocalOrigin() {
		return (IfcCartesianPoint) eGet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOrigin(IfcCartesianPoint newLocalOrigin) {
		eSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, newLocalOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return (Double) eGet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		eSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		eUnset(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return eIsSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleAsString(String newScaleAsString) {
		eSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING, newScaleAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScaleAsString() {
		eUnset(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScaleAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return (Integer) eGet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		eSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM, newDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		eUnset(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return eIsSet(Ifc4Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM);
	}

} //IfcCartesianTransformationOperatorImpl
