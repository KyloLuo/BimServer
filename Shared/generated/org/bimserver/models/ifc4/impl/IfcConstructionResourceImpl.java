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
import org.bimserver.models.ifc4.IfcAppliedValue;
import org.bimserver.models.ifc4.IfcConstructionResource;
import org.bimserver.models.ifc4.IfcPhysicalQuantity;
import org.bimserver.models.ifc4.IfcResourceTime;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcConstructionResourceImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcConstructionResourceImpl#getBaseCosts <em>Base Costs</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcConstructionResourceImpl#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstructionResourceImpl extends IfcResourceImpl implements IfcConstructionResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstructionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResourceTime getUsage() {
		return (IfcResourceTime) eGet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(IfcResourceTime newUsage) {
		eSet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__USAGE, newUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		eUnset(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__USAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return eIsSet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__USAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAppliedValue> getBaseCosts() {
		return (EList<IfcAppliedValue>) eGet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_COSTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseCosts() {
		eUnset(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_COSTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseCosts() {
		return eIsSet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_COSTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalQuantity getBaseQuantity() {
		return (IfcPhysicalQuantity) eGet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseQuantity(IfcPhysicalQuantity newBaseQuantity) {
		eSet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY, newBaseQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseQuantity() {
		eUnset(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseQuantity() {
		return eIsSet(Ifc4Package.Literals.IFC_CONSTRUCTION_RESOURCE__BASE_QUANTITY);
	}

} //IfcConstructionResourceImpl
