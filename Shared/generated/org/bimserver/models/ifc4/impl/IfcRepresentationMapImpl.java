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
import org.bimserver.models.ifc4.IfcAxis2Placement;
import org.bimserver.models.ifc4.IfcMappedItem;
import org.bimserver.models.ifc4.IfcRepresentation;
import org.bimserver.models.ifc4.IfcRepresentationMap;
import org.bimserver.models.ifc4.IfcShapeAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRepresentationMapImpl#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRepresentationMapImpl#getMappedRepresentation <em>Mapped Representation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRepresentationMapImpl#getHasShapeAspects <em>Has Shape Aspects</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRepresentationMapImpl#getMapUsage <em>Map Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationMapImpl extends IdEObjectImpl implements IfcRepresentationMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REPRESENTATION_MAP;
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
	public IfcAxis2Placement getMappingOrigin() {
		return (IfcAxis2Placement) eGet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingOrigin(IfcAxis2Placement newMappingOrigin) {
		eSet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, newMappingOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation getMappedRepresentation() {
		return (IfcRepresentation) eGet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedRepresentation(IfcRepresentation newMappedRepresentation) {
		eSet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, newMappedRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcShapeAspect> getHasShapeAspects() {
		return (EList<IfcShapeAspect>) eGet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__HAS_SHAPE_ASPECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasShapeAspects() {
		eUnset(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__HAS_SHAPE_ASPECTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasShapeAspects() {
		return eIsSet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__HAS_SHAPE_ASPECTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcMappedItem> getMapUsage() {
		return (EList<IfcMappedItem>) eGet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAP_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMapUsage() {
		eUnset(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAP_USAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMapUsage() {
		return eIsSet(Ifc4Package.Literals.IFC_REPRESENTATION_MAP__MAP_USAGE);
	}

} //IfcRepresentationMapImpl
