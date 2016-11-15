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
import org.bimserver.models.ifc4.IfcConnectionTypeEnum;
import org.bimserver.models.ifc4.IfcRelConnectsPathElements;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Path Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPathElementsImpl#getRelatingPriorities <em>Relating Priorities</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPathElementsImpl#getRelatedPriorities <em>Related Priorities</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPathElementsImpl#getRelatedConnectionType <em>Related Connection Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelConnectsPathElementsImpl#getRelatingConnectionType <em>Relating Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPathElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsPathElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPathElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRelatingPriorities() {
		return (EList<Integer>) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRelatedPriorities() {
		return (EList<Integer>) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return (IfcConnectionTypeEnum) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedConnectionType(IfcConnectionTypeEnum newRelatedConnectionType) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE, newRelatedConnectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return (IfcConnectionTypeEnum) eGet(Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConnectionType(IfcConnectionTypeEnum newRelatingConnectionType) {
		eSet(Ifc4Package.Literals.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE, newRelatingConnectionType);
	}

} //IfcRelConnectsPathElementsImpl
