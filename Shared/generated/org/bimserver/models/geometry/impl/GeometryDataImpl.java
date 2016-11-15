/**
 * Copyright (C) 2009-2013 BIMserver.org
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
package org.bimserver.models.geometry.impl;

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.geometry.GeometryData;
import org.bimserver.models.geometry.GeometryPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.geometry.impl.GeometryDataImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.bimserver.models.geometry.impl.GeometryDataImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.bimserver.models.geometry.impl.GeometryDataImpl#getNormals <em>Normals</em>}</li>
 *   <li>{@link org.bimserver.models.geometry.impl.GeometryDataImpl#getMaterials <em>Materials</em>}</li>
 *   <li>{@link org.bimserver.models.geometry.impl.GeometryDataImpl#getMaterialIndices <em>Material Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryDataImpl extends IdEObjectImpl implements GeometryData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.GEOMETRY_DATA;
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
	public byte[] getIndices() {
		return (byte[]) eGet(GeometryPackage.Literals.GEOMETRY_DATA__INDICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndices(byte[] newIndices) {
		eSet(GeometryPackage.Literals.GEOMETRY_DATA__INDICES, newIndices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getVertices() {
		return (byte[]) eGet(GeometryPackage.Literals.GEOMETRY_DATA__VERTICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertices(byte[] newVertices) {
		eSet(GeometryPackage.Literals.GEOMETRY_DATA__VERTICES, newVertices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getNormals() {
		return (byte[]) eGet(GeometryPackage.Literals.GEOMETRY_DATA__NORMALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormals(byte[] newNormals) {
		eSet(GeometryPackage.Literals.GEOMETRY_DATA__NORMALS, newNormals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMaterials() {
		return (byte[]) eGet(GeometryPackage.Literals.GEOMETRY_DATA__MATERIALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterials(byte[] newMaterials) {
		eSet(GeometryPackage.Literals.GEOMETRY_DATA__MATERIALS, newMaterials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMaterialIndices() {
		return (byte[]) eGet(GeometryPackage.Literals.GEOMETRY_DATA__MATERIAL_INDICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialIndices(byte[] newMaterialIndices) {
		eSet(GeometryPackage.Literals.GEOMETRY_DATA__MATERIAL_INDICES, newMaterialIndices);
	}

} //GeometryDataImpl
