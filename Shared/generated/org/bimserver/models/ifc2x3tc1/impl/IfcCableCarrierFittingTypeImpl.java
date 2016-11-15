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
import org.bimserver.models.ifc2x3tc1.IfcCableCarrierFittingType;
import org.bimserver.models.ifc2x3tc1.IfcCableCarrierFittingTypeEnum;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cable Carrier Fitting Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCableCarrierFittingTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCableCarrierFittingTypeImpl extends IfcFlowFittingTypeImpl implements IfcCableCarrierFittingType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCableCarrierFittingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_CABLE_CARRIER_FITTING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierFittingTypeEnum getPredefinedType() {
		return (IfcCableCarrierFittingTypeEnum) eGet(Ifc2x3tc1Package.Literals.IFC_CABLE_CARRIER_FITTING_TYPE__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcCableCarrierFittingTypeEnum newPredefinedType) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CABLE_CARRIER_FITTING_TYPE__PREDEFINED_TYPE, newPredefinedType);
	}

} //IfcCableCarrierFittingTypeImpl
