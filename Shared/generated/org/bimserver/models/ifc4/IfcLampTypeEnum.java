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
 * A representation of the literals of the enumeration '<em><b>Ifc Lamp Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcLampTypeEnum()
 * @model
 * @generated
 */
public enum IfcLampTypeEnum implements Enumerator {
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
	 * The '<em><b>OLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLED_VALUE
	 * @generated
	 * @ordered
	 */
	OLED(1, "OLED", "OLED"),

	/**
	 * The '<em><b>HIGHPRESSUREMERCURY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSUREMERCURY_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHPRESSUREMERCURY(2, "HIGHPRESSUREMERCURY", "HIGHPRESSUREMERCURY"),

	/**
	 * The '<em><b>COMPACTFLUORESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACTFLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACTFLUORESCENT(3, "COMPACTFLUORESCENT", "COMPACTFLUORESCENT"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(4, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>TUNGSTENFILAMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNGSTENFILAMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TUNGSTENFILAMENT(5, "TUNGSTENFILAMENT", "TUNGSTENFILAMENT"),

	/**
	 * The '<em><b>METALHALIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALHALIDE_VALUE
	 * @generated
	 * @ordered
	 */
	METALHALIDE(6, "METALHALIDE", "METALHALIDE"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(7, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>LED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_VALUE
	 * @generated
	 * @ordered
	 */
	LED(8, "LED", "LED"),

	/**
	 * The '<em><b>HIGHPRESSURESODIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSURESODIUM_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHPRESSURESODIUM(9, "HIGHPRESSURESODIUM", "HIGHPRESSURESODIUM"),

	/**
	 * The '<em><b>HALOGEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALOGEN_VALUE
	 * @generated
	 * @ordered
	 */
	HALOGEN(10, "HALOGEN", "HALOGEN"),

	/**
	 * The '<em><b>FLUORESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENT(11, "FLUORESCENT", "FLUORESCENT");

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
	 * The '<em><b>OLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OLED_VALUE = 1;

	/**
	 * The '<em><b>HIGHPRESSUREMERCURY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHPRESSUREMERCURY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSUREMERCURY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHPRESSUREMERCURY_VALUE = 2;

	/**
	 * The '<em><b>COMPACTFLUORESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPACTFLUORESCENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPACTFLUORESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPACTFLUORESCENT_VALUE = 3;

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
	public static final int NOTDEFINED_VALUE = 4;

	/**
	 * The '<em><b>TUNGSTENFILAMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUNGSTENFILAMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNGSTENFILAMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUNGSTENFILAMENT_VALUE = 5;

	/**
	 * The '<em><b>METALHALIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METALHALIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METALHALIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METALHALIDE_VALUE = 6;

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
	public static final int USERDEFINED_VALUE = 7;

	/**
	 * The '<em><b>LED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LED_VALUE = 8;

	/**
	 * The '<em><b>HIGHPRESSURESODIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHPRESSURESODIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSURESODIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHPRESSURESODIUM_VALUE = 9;

	/**
	 * The '<em><b>HALOGEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALOGEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALOGEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALOGEN_VALUE = 10;

	/**
	 * The '<em><b>FLUORESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLUORESCENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENT_VALUE = 11;

	/**
	 * An array of all the '<em><b>Ifc Lamp Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcLampTypeEnum[] VALUES_ARRAY = new IfcLampTypeEnum[] { NULL, OLED, HIGHPRESSUREMERCURY, COMPACTFLUORESCENT, NOTDEFINED, TUNGSTENFILAMENT, METALHALIDE,
			USERDEFINED, LED, HIGHPRESSURESODIUM, HALOGEN, FLUORESCENT, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Lamp Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcLampTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Lamp Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLampTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLampTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Lamp Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLampTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLampTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Lamp Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLampTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case OLED_VALUE:
			return OLED;
		case HIGHPRESSUREMERCURY_VALUE:
			return HIGHPRESSUREMERCURY;
		case COMPACTFLUORESCENT_VALUE:
			return COMPACTFLUORESCENT;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case TUNGSTENFILAMENT_VALUE:
			return TUNGSTENFILAMENT;
		case METALHALIDE_VALUE:
			return METALHALIDE;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case LED_VALUE:
			return LED;
		case HIGHPRESSURESODIUM_VALUE:
			return HIGHPRESSURESODIUM;
		case HALOGEN_VALUE:
			return HALOGEN;
		case FLUORESCENT_VALUE:
			return FLUORESCENT;
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
	private IfcLampTypeEnum(int value, String name, String literal) {
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

} //IfcLampTypeEnum
