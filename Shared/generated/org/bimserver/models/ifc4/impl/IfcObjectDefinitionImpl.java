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
import org.bimserver.models.ifc4.IfcObjectDefinition;
import org.bimserver.models.ifc4.IfcRelAggregates;
import org.bimserver.models.ifc4.IfcRelAssigns;
import org.bimserver.models.ifc4.IfcRelAssociates;
import org.bimserver.models.ifc4.IfcRelDeclares;
import org.bimserver.models.ifc4.IfcRelNests;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getNests <em>Nests</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getIsNestedBy <em>Is Nested By</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getHasContext <em>Has Context</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcObjectDefinitionImpl#getHasAssociations <em>Has Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectDefinitionImpl extends IfcRootImpl implements IfcObjectDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_OBJECT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssigns> getHasAssignments() {
		return (EList<IfcRelAssigns>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasAssignments() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasAssignments() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelNests> getNests() {
		return (EList<IfcRelNests>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__NESTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNests() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__NESTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNests() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__NESTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelNests> getIsNestedBy() {
		return (EList<IfcRelNests>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__IS_NESTED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsNestedBy() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__IS_NESTED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsNestedBy() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__IS_NESTED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDeclares> getHasContext() {
		return (EList<IfcRelDeclares>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasContext() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasContext() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAggregates> getIsDecomposedBy() {
		return (EList<IfcRelAggregates>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDecomposedBy() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDecomposedBy() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAggregates> getDecomposes() {
		return (EList<IfcRelAggregates>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__DECOMPOSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecomposes() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__DECOMPOSES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecomposes() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__DECOMPOSES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssociates> getHasAssociations() {
		return (EList<IfcRelAssociates>) eGet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasAssociations() {
		eUnset(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasAssociations() {
		return eIsSet(Ifc4Package.Literals.IFC_OBJECT_DEFINITION__HAS_ASSOCIATIONS);
	}

} //IfcObjectDefinitionImpl
