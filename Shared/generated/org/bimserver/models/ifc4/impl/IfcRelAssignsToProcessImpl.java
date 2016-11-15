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
import org.bimserver.models.ifc4.IfcMeasureWithUnit;
import org.bimserver.models.ifc4.IfcProcessSelect;
import org.bimserver.models.ifc4.IfcRelAssignsToProcess;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelAssignsToProcessImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelAssignsToProcessImpl#getQuantityInProcess <em>Quantity In Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToProcessImpl extends IfcRelAssignsImpl implements IfcRelAssignsToProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcessSelect getRelatingProcess() {
		return (IfcProcessSelect) eGet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(IfcProcessSelect newRelatingProcess) {
		eSet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, newRelatingProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getQuantityInProcess() {
		return (IfcMeasureWithUnit) eGet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityInProcess(IfcMeasureWithUnit newQuantityInProcess) {
		eSet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, newQuantityInProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantityInProcess() {
		eUnset(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantityInProcess() {
		return eIsSet(Ifc4Package.Literals.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS);
	}

} //IfcRelAssignsToProcessImpl
