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
import org.bimserver.models.ifc4.IfcRelConnectsStructuralMember;
import org.bimserver.models.ifc4.IfcStructuralMember;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStructuralMemberImpl#getConnectedBy <em>Connected By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralMemberImpl extends IfcStructuralItemImpl implements IfcStructuralMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_STRUCTURAL_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelConnectsStructuralMember> getConnectedBy() {
		return (EList<IfcRelConnectsStructuralMember>) eGet(Ifc4Package.Literals.IFC_STRUCTURAL_MEMBER__CONNECTED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectedBy() {
		eUnset(Ifc4Package.Literals.IFC_STRUCTURAL_MEMBER__CONNECTED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectedBy() {
		return eIsSet(Ifc4Package.Literals.IFC_STRUCTURAL_MEMBER__CONNECTED_BY);
	}

} //IfcStructuralMemberImpl
