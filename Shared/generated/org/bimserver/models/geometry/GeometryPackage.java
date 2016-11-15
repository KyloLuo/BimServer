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
package org.bimserver.models.geometry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bimserver.models.geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "geometry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geometry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryPackage eINSTANCE = org.bimserver.models.geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.GeometryInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.GeometryInfoImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryInfo()
	 * @generated
	 */
	int GEOMETRY_INFO = 0;

	/**
	 * The feature id for the '<em><b>Min Bounds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__MIN_BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Max Bounds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__MAX_BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Start Vertex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__START_VERTEX = 2;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__START_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Primitive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__PRIMITIVE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__DATA = 5;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__TRANSFORMATION = 7;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.Vector3fImpl <em>Vector3f</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.Vector3fImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__Z = 2;

	/**
	 * The number of structural features of the '<em>Vector3f</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.GeometryDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.GeometryDataImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryData()
	 * @generated
	 */
	int GEOMETRY_DATA = 2;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__INDICES = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__VERTICES = 1;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__NORMALS = 2;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__MATERIALS = 3;

	/**
	 * The feature id for the '<em><b>Material Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__MATERIAL_INDICES = 4;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.GeometryInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.GeometryInstanceImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryInstance()
	 * @generated
	 */
	int GEOMETRY_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INSTANCE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INSTANCE__TRANSFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.GeometryInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo
	 * @generated
	 */
	EClass getGeometryInfo();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getMinBounds <em>Min Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Bounds</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getMinBounds()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_MinBounds();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getMaxBounds <em>Max Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Bounds</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getMaxBounds()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_MaxBounds();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getStartVertex <em>Start Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Vertex</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getStartVertex()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_StartVertex();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getStartIndex()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_StartIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getPrimitiveCount <em>Primitive Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Count</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getPrimitiveCount()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_PrimitiveCount();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getData()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_Data();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getInstance()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_Instance();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getTransformation()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_Transformation();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3f</em>'.
	 * @see org.bimserver.models.geometry.Vector3f
	 * @generated
	 */
	EClass getVector3f();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector3f#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.bimserver.models.geometry.Vector3f#getX()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_X();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector3f#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.bimserver.models.geometry.Vector3f#getY()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector3f#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.bimserver.models.geometry.Vector3f#getZ()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_Z();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.GeometryData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.bimserver.models.geometry.GeometryData
	 * @generated
	 */
	EClass getGeometryData();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indices</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getIndices()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Indices();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertices</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getVertices()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getNormals <em>Normals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getNormals()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Normals();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Materials</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getMaterials()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Materials();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getMaterialIndices <em>Material Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Indices</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getMaterialIndices()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_MaterialIndices();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.GeometryInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.bimserver.models.geometry.GeometryInstance
	 * @generated
	 */
	EClass getGeometryInstance();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInstance#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.bimserver.models.geometry.GeometryInstance#getData()
	 * @see #getGeometryInstance()
	 * @generated
	 */
	EReference getGeometryInstance_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInstance#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see org.bimserver.models.geometry.GeometryInstance#getTransformation()
	 * @see #getGeometryInstance()
	 * @generated
	 */
	EAttribute getGeometryInstance_Transformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryFactory getGeometryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.GeometryInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.GeometryInfoImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryInfo()
		 * @generated
		 */
		EClass GEOMETRY_INFO = eINSTANCE.getGeometryInfo();

		/**
		 * The meta object literal for the '<em><b>Min Bounds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__MIN_BOUNDS = eINSTANCE.getGeometryInfo_MinBounds();

		/**
		 * The meta object literal for the '<em><b>Max Bounds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__MAX_BOUNDS = eINSTANCE.getGeometryInfo_MaxBounds();

		/**
		 * The meta object literal for the '<em><b>Start Vertex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__START_VERTEX = eINSTANCE.getGeometryInfo_StartVertex();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__START_INDEX = eINSTANCE.getGeometryInfo_StartIndex();

		/**
		 * The meta object literal for the '<em><b>Primitive Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__PRIMITIVE_COUNT = eINSTANCE.getGeometryInfo_PrimitiveCount();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__DATA = eINSTANCE.getGeometryInfo_Data();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__INSTANCE = eINSTANCE.getGeometryInfo_Instance();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__TRANSFORMATION = eINSTANCE.getGeometryInfo_Transformation();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.Vector3fImpl <em>Vector3f</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.Vector3fImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getVector3f()
		 * @generated
		 */
		EClass VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__X = eINSTANCE.getVector3f_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__Y = eINSTANCE.getVector3f_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__Z = eINSTANCE.getVector3f_Z();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.GeometryDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.GeometryDataImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryData()
		 * @generated
		 */
		EClass GEOMETRY_DATA = eINSTANCE.getGeometryData();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__INDICES = eINSTANCE.getGeometryData_Indices();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__VERTICES = eINSTANCE.getGeometryData_Vertices();

		/**
		 * The meta object literal for the '<em><b>Normals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__NORMALS = eINSTANCE.getGeometryData_Normals();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__MATERIALS = eINSTANCE.getGeometryData_Materials();

		/**
		 * The meta object literal for the '<em><b>Material Indices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__MATERIAL_INDICES = eINSTANCE.getGeometryData_MaterialIndices();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.GeometryInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.GeometryInstanceImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryInstance()
		 * @generated
		 */
		EClass GEOMETRY_INSTANCE = eINSTANCE.getGeometryInstance();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INSTANCE__DATA = eINSTANCE.getGeometryInstance_Data();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INSTANCE__TRANSFORMATION = eINSTANCE.getGeometryInstance_Transformation();

	}

} //GeometryPackage
