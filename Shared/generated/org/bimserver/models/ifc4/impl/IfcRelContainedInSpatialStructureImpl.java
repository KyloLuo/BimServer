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
import org.bimserver.models.ifc4.IfcProduct;
import org.bimserver.models.ifc4.IfcRelContainedInSpatialStructure;
import org.bimserver.models.ifc4.IfcSpatialElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Contained In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelContainedInSpatialStructureImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcRelContainedInSpatialStructureImpl#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelContainedInSpatialStructureImpl extends IfcRelConnectsImpl implements IfcRelContainedInSpatialStructure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelContainedInSpatialStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProduct> getRelatedElements() {
		return (EList<IfcProduct>) eGet(Ifc4Package.Literals.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialElement getRelatingStructure() {
		return (IfcSpatialElement) eGet(Ifc4Package.Literals.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructure(IfcSpatialElement newRelatingStructure) {
		eSet(Ifc4Package.Literals.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, newRelatingStructure);
	}

} //IfcRelContainedInSpatialStructureImpl
