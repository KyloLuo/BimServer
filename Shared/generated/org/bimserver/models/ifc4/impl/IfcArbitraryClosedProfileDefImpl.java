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
import org.bimserver.models.ifc4.IfcArbitraryClosedProfileDef;
import org.bimserver.models.ifc4.IfcCurve;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Closed Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcArbitraryClosedProfileDefImpl#getOuterCurve <em>Outer Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcArbitraryClosedProfileDefImpl extends IfcProfileDefImpl implements IfcArbitraryClosedProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryClosedProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_ARBITRARY_CLOSED_PROFILE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getOuterCurve() {
		return (IfcCurve) eGet(Ifc4Package.Literals.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterCurve(IfcCurve newOuterCurve) {
		eSet(Ifc4Package.Literals.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, newOuterCurve);
	}

} //IfcArbitraryClosedProfileDefImpl
