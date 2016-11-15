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
import org.bimserver.models.ifc4.IfcElement;
import org.bimserver.models.ifc4.IfcPort;
import org.bimserver.models.ifc4.IfcRelConnectsPorts;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPortsImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPortsImpl#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPortsImpl#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPortsImpl extends IfcRelConnectsImpl implements IfcRelConnectsPorts {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatingPort() {
		return (IfcPort) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__RELATING_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPort(IfcPort newRelatingPort) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__RELATING_PORT, newRelatingPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatedPort() {
		return (IfcPort) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__RELATED_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPort(IfcPort newRelatedPort) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__RELATED_PORT, newRelatedPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRealizingElement() {
		return (IfcElement) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingElement(IfcElement newRealizingElement) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, newRealizingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRealizingElement() {
		eUnset(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRealizingElement() {
		return eIsSet(Ifc4Package.Literals.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT);
	}

} //IfcRelConnectsPortsImpl
