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
import org.bimserver.models.ifc4.IfcBSplineCurve;
import org.bimserver.models.ifc4.IfcBSplineCurveForm;
import org.bimserver.models.ifc4.IfcCartesianPoint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc BSpline Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcBSplineCurveImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcBSplineCurveImpl#getControlPointsList <em>Control Points List</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcBSplineCurveImpl#getCurveForm <em>Curve Form</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcBSplineCurveImpl#isClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcBSplineCurveImpl#isSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBSplineCurveImpl extends IfcBoundedCurveImpl implements IfcBSplineCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBSplineCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_BSPLINE_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegree() {
		return (Integer) eGet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__DEGREE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(int newDegree) {
		eSet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__DEGREE, newDegree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCartesianPoint> getControlPointsList() {
		return (EList<IfcCartesianPoint>) eGet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__CONTROL_POINTS_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBSplineCurveForm getCurveForm() {
		return (IfcBSplineCurveForm) eGet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__CURVE_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveForm(IfcBSplineCurveForm newCurveForm) {
		eSet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__CURVE_FORM, newCurveForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosedCurve() {
		return (Boolean) eGet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__CLOSED_CURVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedCurve(boolean newClosedCurve) {
		eSet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__CLOSED_CURVE, newClosedCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfIntersect() {
		return (Boolean) eGet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__SELF_INTERSECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(boolean newSelfIntersect) {
		eSet(Ifc4Package.Literals.IFC_BSPLINE_CURVE__SELF_INTERSECT, newSelfIntersect);
	}

} //IfcBSplineCurveImpl
