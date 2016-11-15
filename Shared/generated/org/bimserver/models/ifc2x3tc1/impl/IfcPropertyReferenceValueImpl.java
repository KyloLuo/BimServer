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
import org.bimserver.models.ifc2x3tc1.IfcObjectReferenceSelect;
import org.bimserver.models.ifc2x3tc1.IfcPropertyReferenceValue;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcPropertyReferenceValueImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcPropertyReferenceValueImpl#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyReferenceValueImpl extends IfcSimplePropertyImpl implements IfcPropertyReferenceValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageName() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageName(String newUsageName) {
		eSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME, newUsageName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageName() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageName() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectReferenceSelect getPropertyReference() {
		return (IfcObjectReferenceSelect) eGet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyReference(IfcObjectReferenceSelect newPropertyReference) {
		eSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, newPropertyReference);
	}

} //IfcPropertyReferenceValueImpl
