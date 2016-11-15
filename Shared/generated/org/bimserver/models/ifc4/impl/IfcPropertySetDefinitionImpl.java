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
import org.bimserver.models.ifc4.IfcPropertySetDefinition;
import org.bimserver.models.ifc4.IfcRelDefinesByProperties;
import org.bimserver.models.ifc4.IfcRelDefinesByTemplate;
import org.bimserver.models.ifc4.IfcTypeObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcPropertySetDefinitionImpl#getDefinesType <em>Defines Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcPropertySetDefinitionImpl#getIsDefinedBy <em>Is Defined By</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcPropertySetDefinitionImpl#getDefinesOccurrence <em>Defines Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertySetDefinitionImpl extends IfcPropertyDefinitionImpl implements IfcPropertySetDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcTypeObject> getDefinesType() {
		return (EList<IfcTypeObject>) eGet(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinesType() {
		eUnset(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinesType() {
		return eIsSet(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__DEFINES_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDefinesByTemplate> getIsDefinedBy() {
		return (EList<IfcRelDefinesByTemplate>) eGet(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__IS_DEFINED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDefinedBy() {
		eUnset(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__IS_DEFINED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDefinedBy() {
		return eIsSet(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__IS_DEFINED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDefinesByProperties> getDefinesOccurrence() {
		return (EList<IfcRelDefinesByProperties>) eGet(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__DEFINES_OCCURRENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinesOccurrence() {
		eUnset(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__DEFINES_OCCURRENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinesOccurrence() {
		return eIsSet(Ifc4Package.Literals.IFC_PROPERTY_SET_DEFINITION__DEFINES_OCCURRENCE);
	}

} //IfcPropertySetDefinitionImpl
