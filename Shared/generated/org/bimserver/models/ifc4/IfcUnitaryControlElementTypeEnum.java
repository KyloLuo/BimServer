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
 * A representation of the literals of the enumeration '<em><b>Ifc Unitary Control Element Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcUnitaryControlElementTypeEnum()
 * @model
 * @generated
 */
public enum IfcUnitaryControlElementTypeEnum implements Enumerator {
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
	 * The '<em><b>THERMOSTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMOSTAT(1, "THERMOSTAT", "THERMOSTAT"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(2, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>WEATHERSTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEATHERSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	WEATHERSTATION(3, "WEATHERSTATION", "WEATHERSTATION"),

	/**
	 * The '<em><b>HUMIDISTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDISTAT_VALUE
	 * @generated
	 * @ordered
	 */
	HUMIDISTAT(4, "HUMIDISTAT", "HUMIDISTAT"),

	/**
	 * The '<em><b>GASDETECTIONPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASDETECTIONPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	GASDETECTIONPANEL(5, "GASDETECTIONPANEL", "GASDETECTIONPANEL"),

	/**
	 * The '<em><b>MIMICPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIMICPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	MIMICPANEL(6, "MIMICPANEL", "MIMICPANEL"),

	/**
	 * The '<em><b>CONTROLPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLPANEL(7, "CONTROLPANEL", "CONTROLPANEL"),

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
	 * The '<em><b>INDICATORPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICATORPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATORPANEL(9, "INDICATORPANEL", "INDICATORPANEL"),

	/**
	 * The '<em><b>ALARMPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARMPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	ALARMPANEL(10, "ALARMPANEL", "ALARMPANEL");

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
	 * The '<em><b>THERMOSTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMOSTAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMOSTAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMOSTAT_VALUE = 1;

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
	public static final int NOTDEFINED_VALUE = 2;

	/**
	 * The '<em><b>WEATHERSTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEATHERSTATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEATHERSTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEATHERSTATION_VALUE = 3;

	/**
	 * The '<em><b>HUMIDISTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HUMIDISTAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMIDISTAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUMIDISTAT_VALUE = 4;

	/**
	 * The '<em><b>GASDETECTIONPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GASDETECTIONPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASDETECTIONPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GASDETECTIONPANEL_VALUE = 5;

	/**
	 * The '<em><b>MIMICPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIMICPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIMICPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIMICPANEL_VALUE = 6;

	/**
	 * The '<em><b>CONTROLPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTROLPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLPANEL_VALUE = 7;

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
	 * The '<em><b>INDICATORPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INDICATORPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDICATORPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDICATORPANEL_VALUE = 9;

	/**
	 * The '<em><b>ALARMPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALARMPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALARMPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALARMPANEL_VALUE = 10;

	/**
	 * An array of all the '<em><b>Ifc Unitary Control Element Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcUnitaryControlElementTypeEnum[] VALUES_ARRAY = new IfcUnitaryControlElementTypeEnum[] { NULL, THERMOSTAT, NOTDEFINED, WEATHERSTATION, HUMIDISTAT,
			GASDETECTIONPANEL, MIMICPANEL, CONTROLPANEL, USERDEFINED, INDICATORPANEL, ALARMPANEL, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Unitary Control Element Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcUnitaryControlElementTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Unitary Control Element Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcUnitaryControlElementTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcUnitaryControlElementTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Unitary Control Element Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcUnitaryControlElementTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcUnitaryControlElementTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Unitary Control Element Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcUnitaryControlElementTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case THERMOSTAT_VALUE:
			return THERMOSTAT;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case WEATHERSTATION_VALUE:
			return WEATHERSTATION;
		case HUMIDISTAT_VALUE:
			return HUMIDISTAT;
		case GASDETECTIONPANEL_VALUE:
			return GASDETECTIONPANEL;
		case MIMICPANEL_VALUE:
			return MIMICPANEL;
		case CONTROLPANEL_VALUE:
			return CONTROLPANEL;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case INDICATORPANEL_VALUE:
			return INDICATORPANEL;
		case ALARMPANEL_VALUE:
			return ALARMPANEL;
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
	private IfcUnitaryControlElementTypeEnum(int value, String name, String literal) {
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

} //IfcUnitaryControlElementTypeEnum
