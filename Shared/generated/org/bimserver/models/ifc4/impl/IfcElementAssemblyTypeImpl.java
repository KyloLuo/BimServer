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
import org.bimserver.models.ifc4.IfcElementAssemblyType;
import org.bimserver.models.ifc4.IfcElementAssemblyTypeEnum;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcElementAssemblyTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElementAssemblyTypeImpl extends IfcElementTypeImpl implements IfcElementAssemblyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_ELEMENT_ASSEMBLY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssemblyTypeEnum getPredefinedType() {
		return (IfcElementAssemblyTypeEnum) eGet(Ifc4Package.Literals.IFC_ELEMENT_ASSEMBLY_TYPE__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcElementAssemblyTypeEnum newPredefinedType) {
		eSet(Ifc4Package.Literals.IFC_ELEMENT_ASSEMBLY_TYPE__PREDEFINED_TYPE, newPredefinedType);
	}

} //IfcElementAssemblyTypeImpl
