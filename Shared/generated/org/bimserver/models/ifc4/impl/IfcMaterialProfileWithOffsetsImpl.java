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
import org.bimserver.models.ifc4.IfcMaterialProfileWithOffsets;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Profile With Offsets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMaterialProfileWithOffsetsImpl#getOffsetValues <em>Offset Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMaterialProfileWithOffsetsImpl#getOffsetValuesAsString <em>Offset Values As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialProfileWithOffsetsImpl extends IfcMaterialProfileImpl implements IfcMaterialProfileWithOffsets {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialProfileWithOffsetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_MATERIAL_PROFILE_WITH_OFFSETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Double> getOffsetValues() {
		return (EList<Double>) eGet(Ifc4Package.Literals.IFC_MATERIAL_PROFILE_WITH_OFFSETS__OFFSET_VALUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getOffsetValuesAsString() {
		return (EList<String>) eGet(Ifc4Package.Literals.IFC_MATERIAL_PROFILE_WITH_OFFSETS__OFFSET_VALUES_AS_STRING, true);
	}

} //IfcMaterialProfileWithOffsetsImpl
