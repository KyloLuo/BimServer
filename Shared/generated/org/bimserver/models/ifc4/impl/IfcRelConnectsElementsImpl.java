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
import org.bimserver.models.ifc4.IfcConnectionGeometry;
import org.bimserver.models.ifc4.IfcElement;
import org.bimserver.models.ifc4.IfcRelConnectsElements;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsElementsImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsElementsImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsElementsImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsElementsImpl extends IfcRelConnectsImpl implements IfcRelConnectsElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionGeometry() {
		return (IfcConnectionGeometry) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(IfcConnectionGeometry newConnectionGeometry) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, newConnectionGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionGeometry() {
		eUnset(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionGeometry() {
		return eIsSet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingElement() {
		return (IfcElement) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcElement newRelatingElement) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, newRelatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedElement() {
		return (IfcElement) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(IfcElement newRelatedElement) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, newRelatedElement);
	}

} //IfcRelConnectsElementsImpl
