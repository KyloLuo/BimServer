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
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator2DnonUniform;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator2 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCartesianTransformationOperator2DnonUniformImpl#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCartesianTransformationOperator2DnonUniformImpl#getScale2AsString <em>Scale2 As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperator2DnonUniformImpl extends IfcCartesianTransformationOperator2DImpl implements
		IfcCartesianTransformationOperator2DnonUniform {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator2DnonUniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale2() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2(double newScale2) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2, newScale2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale2() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale2() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale2AsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2AsString(String newScale2AsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2_AS_STRING, newScale2AsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale2AsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale2AsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM__SCALE2_AS_STRING);
	}

} //IfcCartesianTransformationOperator2DnonUniformImpl
