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
 * A representation of the literals of the enumeration '<em><b>Ifc Audio Visual Appliance Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcAudioVisualApplianceTypeEnum()
 * @model
 * @generated
 */
public enum IfcAudioVisualApplianceTypeEnum implements Enumerator {
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
	 * The '<em><b>PROJECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECTOR(1, "PROJECTOR", "PROJECTOR"),

	/**
	 * The '<em><b>PLAYER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYER(2, "PLAYER", "PLAYER"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(3, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>RECEIVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVER_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVER(4, "RECEIVER", "RECEIVER"),

	/**
	 * The '<em><b>MICROPHONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	MICROPHONE(5, "MICROPHONE", "MICROPHONE"),

	/**
	 * The '<em><b>CAMERA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMERA_VALUE
	 * @generated
	 * @ordered
	 */
	CAMERA(6, "CAMERA", "CAMERA"),

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
	 * The '<em><b>AMPLIFIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPLIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	AMPLIFIER(8, "AMPLIFIER", "AMPLIFIER"),

	/**
	 * The '<em><b>TELEPHONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	TELEPHONE(9, "TELEPHONE", "TELEPHONE"),

	/**
	 * The '<em><b>DISPLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY(10, "DISPLAY", "DISPLAY"),

	/**
	 * The '<em><b>TUNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNER_VALUE
	 * @generated
	 * @ordered
	 */
	TUNER(11, "TUNER", "TUNER"),

	/**
	 * The '<em><b>SWITCHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCHER_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCHER(12, "SWITCHER", "SWITCHER"),

	/**
	 * The '<em><b>SPEAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_VALUE
	 * @generated
	 * @ordered
	 */
	SPEAKER(13, "SPEAKER", "SPEAKER");

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
	 * The '<em><b>PROJECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROJECTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROJECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROJECTOR_VALUE = 1;

	/**
	 * The '<em><b>PLAYER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAYER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_VALUE = 2;

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
	public static final int NOTDEFINED_VALUE = 3;

	/**
	 * The '<em><b>RECEIVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECEIVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVER_VALUE = 4;

	/**
	 * The '<em><b>MICROPHONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MICROPHONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICROPHONE_VALUE = 5;

	/**
	 * The '<em><b>CAMERA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAMERA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAMERA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAMERA_VALUE = 6;

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
	 * The '<em><b>AMPLIFIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMPLIFIER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMPLIFIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMPLIFIER_VALUE = 8;

	/**
	 * The '<em><b>TELEPHONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TELEPHONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TELEPHONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_VALUE = 9;

	/**
	 * The '<em><b>DISPLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISPLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPLAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_VALUE = 10;

	/**
	 * The '<em><b>TUNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUNER_VALUE = 11;

	/**
	 * The '<em><b>SWITCHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWITCHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHER_VALUE = 12;

	/**
	 * The '<em><b>SPEAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEAKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEAKER_VALUE = 13;

	/**
	 * An array of all the '<em><b>Ifc Audio Visual Appliance Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcAudioVisualApplianceTypeEnum[] VALUES_ARRAY = new IfcAudioVisualApplianceTypeEnum[] { NULL, PROJECTOR, PLAYER, NOTDEFINED, RECEIVER, MICROPHONE,
			CAMERA, USERDEFINED, AMPLIFIER, TELEPHONE, DISPLAY, TUNER, SWITCHER, SPEAKER, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Audio Visual Appliance Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcAudioVisualApplianceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Audio Visual Appliance Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcAudioVisualApplianceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcAudioVisualApplianceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Audio Visual Appliance Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcAudioVisualApplianceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcAudioVisualApplianceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Audio Visual Appliance Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcAudioVisualApplianceTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case PROJECTOR_VALUE:
			return PROJECTOR;
		case PLAYER_VALUE:
			return PLAYER;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case RECEIVER_VALUE:
			return RECEIVER;
		case MICROPHONE_VALUE:
			return MICROPHONE;
		case CAMERA_VALUE:
			return CAMERA;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case AMPLIFIER_VALUE:
			return AMPLIFIER;
		case TELEPHONE_VALUE:
			return TELEPHONE;
		case DISPLAY_VALUE:
			return DISPLAY;
		case TUNER_VALUE:
			return TUNER;
		case SWITCHER_VALUE:
			return SWITCHER;
		case SPEAKER_VALUE:
			return SPEAKER;
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
	private IfcAudioVisualApplianceTypeEnum(int value, String name, String literal) {
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

} //IfcAudioVisualApplianceTypeEnum
