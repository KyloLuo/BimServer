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

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcPresentationLayerAssignment;
import org.bimserver.models.ifc4.IfcRepresentationItem;
import org.bimserver.models.ifc4.IfcStyledItem;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRepresentationItemImpl#getLayerAssignment <em>Layer Assignment</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRepresentationItemImpl#getStyledByItem <em>Styled By Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationItemImpl extends IdEObjectImpl implements IfcRepresentationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REPRESENTATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPresentationLayerAssignment> getLayerAssignment() {
		return (EList<IfcPresentationLayerAssignment>) eGet(Ifc4Package.Literals.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerAssignment() {
		eUnset(Ifc4Package.Literals.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerAssignment() {
		return eIsSet(Ifc4Package.Literals.IFC_REPRESENTATION_ITEM__LAYER_ASSIGNMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcStyledItem> getStyledByItem() {
		return (EList<IfcStyledItem>) eGet(Ifc4Package.Literals.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyledByItem() {
		eUnset(Ifc4Package.Literals.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyledByItem() {
		return eIsSet(Ifc4Package.Literals.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM);
	}

} //IfcRepresentationItemImpl
