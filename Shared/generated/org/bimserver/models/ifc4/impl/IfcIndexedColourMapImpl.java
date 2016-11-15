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
import org.bimserver.models.ifc4.IfcColourRgbList;
import org.bimserver.models.ifc4.IfcIndexedColourMap;
import org.bimserver.models.ifc4.IfcSurfaceStyleShading;
import org.bimserver.models.ifc4.IfcTessellatedFaceSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Indexed Colour Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getMappedTo <em>Mapped To</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getColours <em>Colours</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcIndexedColourMapImpl#getColourIndex <em>Colour Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcIndexedColourMapImpl extends IfcPresentationItemImpl implements IfcIndexedColourMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIndexedColourMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTessellatedFaceSet getMappedTo() {
		return (IfcTessellatedFaceSet) eGet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__MAPPED_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedTo(IfcTessellatedFaceSet newMappedTo) {
		eSet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__MAPPED_TO, newMappedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleShading getOverrides() {
		return (IfcSurfaceStyleShading) eGet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__OVERRIDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrides(IfcSurfaceStyleShading newOverrides) {
		eSet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__OVERRIDES, newOverrides);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverrides() {
		eUnset(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__OVERRIDES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverrides() {
		return eIsSet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__OVERRIDES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgbList getColours() {
		return (IfcColourRgbList) eGet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__COLOURS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColours(IfcColourRgbList newColours) {
		eSet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__COLOURS, newColours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getColourIndex() {
		return (EList<Integer>) eGet(Ifc4Package.Literals.IFC_INDEXED_COLOUR_MAP__COLOUR_INDEX, true);
	}

} //IfcIndexedColourMapImpl
