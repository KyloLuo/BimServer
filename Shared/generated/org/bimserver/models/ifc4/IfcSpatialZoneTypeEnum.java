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
package org.bimserver.models.ifc4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Spatial Zone Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcSpatialZoneTypeEnum()
 * @model
 * @generated
 */
public enum IfcSpatialZoneTypeEnum implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", "NULL"),

	/**
	 * The '<em><b>THERMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMAL_VALUE
	 * @generated
	 * @ordered
	 */
	THERMAL(1, "THERMAL", "THERMAL"),

	/**
	 * The '<em><b>OCCUPANCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPANCY_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPANCY(2, "OCCUPANCY", "OCCUPANCY"),

	/**
	 * The '<em><b>TRANSPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPORT(3, "TRANSPORT", "TRANSPORT"),

	/**
	 * The '<em><b>CONSTRUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTION(4, "CONSTRUCTION", "CONSTRUCTION"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(5, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>VENTILATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENTILATION_VALUE
	 * @generated
	 * @ordered
	 */
	VENTILATION(6, "VENTILATION", "VENTILATION"),

	/**
	 * The '<em><b>FIRESAFETY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRESAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	FIRESAFETY(7, "FIRESAFETY", "FIRESAFETY"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(8, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>SECURITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(9, "SECURITY", "SECURITY"),

	/**
	 * The '<em><b>LIGHTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTING_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTING(10, "LIGHTING", "LIGHTING");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>THERMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_VALUE = 1;

	/**
	 * The '<em><b>OCCUPANCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCUPANCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCUPANCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPANCY_VALUE = 2;

	/**
	 * The '<em><b>TRANSPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPORT_VALUE = 3;

	/**
	 * The '<em><b>CONSTRUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTRUCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTION_VALUE = 4;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 5;

	/**
	 * The '<em><b>VENTILATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VENTILATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VENTILATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENTILATION_VALUE = 6;

	/**
	 * The '<em><b>FIRESAFETY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRESAFETY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRESAFETY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRESAFETY_VALUE = 7;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 8;

	/**
	 * The '<em><b>SECURITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECURITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 9;

	/**
	 * The '<em><b>LIGHTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTING_VALUE = 10;

	/**
	 * An array of all the '<em><b>Ifc Spatial Zone Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcSpatialZoneTypeEnum[] VALUES_ARRAY = new IfcSpatialZoneTypeEnum[] { NULL, THERMAL, OCCUPANCY, TRANSPORT, CONSTRUCTION, NOTDEFINED, VENTILATION,
			FIRESAFETY, USERDEFINED, SECURITY, LIGHTING, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Spatial Zone Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcSpatialZoneTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Spatial Zone Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcSpatialZoneTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcSpatialZoneTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Spatial Zone Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcSpatialZoneTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcSpatialZoneTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Spatial Zone Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcSpatialZoneTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case THERMAL_VALUE:
			return THERMAL;
		case OCCUPANCY_VALUE:
			return OCCUPANCY;
		case TRANSPORT_VALUE:
			return TRANSPORT;
		case CONSTRUCTION_VALUE:
			return CONSTRUCTION;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case VENTILATION_VALUE:
			return VENTILATION;
		case FIRESAFETY_VALUE:
			return FIRESAFETY;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case SECURITY_VALUE:
			return SECURITY;
		case LIGHTING_VALUE:
			return LIGHTING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcSpatialZoneTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IfcSpatialZoneTypeEnum
