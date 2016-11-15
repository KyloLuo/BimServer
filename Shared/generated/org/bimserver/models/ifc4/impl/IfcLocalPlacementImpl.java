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
import org.bimserver.models.ifc4.IfcLocalPlacement;
import org.bimserver.models.ifc4.IfcObjectPlacement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcLocalPlacementImpl#getPlacementRelTo <em>Placement Rel To</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcLocalPlacementImpl#getRelativePlacement <em>Relative Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLocalPlacementImpl extends IfcObjectPlacementImpl implements IfcLocalPlacement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLocalPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_LOCAL_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getPlacementRelTo() {
		return (IfcObjectPlacement) eGet(Ifc4Package.Literals.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRelTo(IfcObjectPlacement newPlacementRelTo) {
		eSet(Ifc4Package.Literals.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, newPlacementRelTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacementRelTo() {
		eUnset(Ifc4Package.Literals.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacementRelTo() {
		return eIsSet(Ifc4Package.Literals.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getRelativePlacement() {
		return (IfcAxis2Placement) eGet(Ifc4Package.Literals.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePlacement(IfcAxis2Placement newRelativePlacement) {
		eSet(Ifc4Package.Literals.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, newRelativePlacement);
	}

} //IfcLocalPlacementImpl
