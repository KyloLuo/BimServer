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
import org.bimserver.models.ifc4.IfcRectangleProfileDef;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRectangleProfileDefImpl#getXDim <em>XDim</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRectangleProfileDefImpl#getXDimAsString <em>XDim As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRectangleProfileDefImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRectangleProfileDefImpl#getYDimAsString <em>YDim As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangleProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcRectangleProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXDim() {
		return (Double) eGet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__XDIM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDim(double newXDim) {
		eSet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__XDIM, newXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXDimAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDimAsString(String newXDimAsString) {
		eSet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING, newXDimAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYDim() {
		return (Double) eGet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__YDIM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(double newYDim) {
		eSet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__YDIM, newYDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYDimAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDimAsString(String newYDimAsString) {
		eSet(Ifc4Package.Literals.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING, newYDimAsString);
	}

} //IfcRectangleProfileDefImpl
