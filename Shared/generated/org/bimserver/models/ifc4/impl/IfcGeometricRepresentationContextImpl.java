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
import org.bimserver.models.ifc4.IfcAxis2Placement;
import org.bimserver.models.ifc4.IfcDirection;
import org.bimserver.models.ifc4.IfcGeometricRepresentationContext;
import org.bimserver.models.ifc4.IfcGeometricRepresentationSubContext;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcGeometricRepresentationContextImpl#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcGeometricRepresentationContextImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcGeometricRepresentationContextImpl#getPrecisionAsString <em>Precision As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcGeometricRepresentationContextImpl#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcGeometricRepresentationContextImpl#getTrueNorth <em>True North</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcGeometricRepresentationContextImpl#getHasSubContexts <em>Has Sub Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricRepresentationContextImpl extends IfcRepresentationContextImpl implements IfcGeometricRepresentationContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoordinateSpaceDimension() {
		return (Integer) eGet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSpaceDimension(int newCoordinateSpaceDimension) {
		eSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION, newCoordinateSpaceDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecision() {
		return (Double) eGet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(double newPrecision) {
		eSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecision() {
		eUnset(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecision() {
		return eIsSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecisionAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAsString(String newPrecisionAsString) {
		eSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING, newPrecisionAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAsString() {
		eUnset(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getWorldCoordinateSystem() {
		return (IfcAxis2Placement) eGet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldCoordinateSystem(IfcAxis2Placement newWorldCoordinateSystem) {
		eSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, newWorldCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getTrueNorth() {
		return (IfcDirection) eGet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueNorth(IfcDirection newTrueNorth) {
		eSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, newTrueNorth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrueNorth() {
		eUnset(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrueNorth() {
		return eIsSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcGeometricRepresentationSubContext> getHasSubContexts() {
		return (EList<IfcGeometricRepresentationSubContext>) eGet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasSubContexts() {
		eUnset(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasSubContexts() {
		return eIsSet(Ifc4Package.Literals.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS);
	}

} //IfcGeometricRepresentationContextImpl
