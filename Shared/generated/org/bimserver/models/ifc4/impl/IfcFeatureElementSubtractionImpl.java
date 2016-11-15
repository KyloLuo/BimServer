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
import org.bimserver.models.ifc4.IfcFeatureElementSubtraction;
import org.bimserver.models.ifc4.IfcRelVoidsElement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Feature Element Subtraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcFeatureElementSubtractionImpl#getVoidsElements <em>Voids Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFeatureElementSubtractionImpl extends IfcFeatureElementImpl implements IfcFeatureElementSubtraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFeatureElementSubtractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_FEATURE_ELEMENT_SUBTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelVoidsElement getVoidsElements() {
		return (IfcRelVoidsElement) eGet(Ifc4Package.Literals.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoidsElements(IfcRelVoidsElement newVoidsElements) {
		eSet(Ifc4Package.Literals.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, newVoidsElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoidsElements() {
		eUnset(Ifc4Package.Literals.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoidsElements() {
		return eIsSet(Ifc4Package.Literals.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS);
	}

} //IfcFeatureElementSubtractionImpl
