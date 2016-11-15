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
 * A representation of the literals of the enumeration '<em><b>Ifc Labor Resource Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcLaborResourceTypeEnum()
 * @model
 * @generated
 */
public enum IfcLaborResourceTypeEnum implements Enumerator {
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
	 * The '<em><b>SITEGRADING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITEGRADING_VALUE
	 * @generated
	 * @ordered
	 */
	SITEGRADING(1, "SITEGRADING", "SITEGRADING"),

	/**
	 * The '<em><b>GENERAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL(2, "GENERAL", "GENERAL"),

	/**
	 * The '<em><b>LANDSCAPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPING_VALUE
	 * @generated
	 * @ordered
	 */
	LANDSCAPING(3, "LANDSCAPING", "LANDSCAPING"),

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
	 * The '<em><b>HVAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVAC_VALUE
	 * @generated
	 * @ordered
	 */
	HVAC(5, "HVAC", "HVAC"),

	/**
	 * The '<em><b>CLEANING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEANING_VALUE
	 * @generated
	 * @ordered
	 */
	CLEANING(6, "CLEANING", "CLEANING"),

	/**
	 * The '<em><b>ROOFING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOFING_VALUE
	 * @generated
	 * @ordered
	 */
	ROOFING(7, "ROOFING", "ROOFING"),

	/**
	 * The '<em><b>ELECTRIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRIC(8, "ELECTRIC", "ELECTRIC"),

	/**
	 * The '<em><b>PAVING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAVING_VALUE
	 * @generated
	 * @ordered
	 */
	PAVING(9, "PAVING", "PAVING"),

	/**
	 * The '<em><b>CARPENTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARPENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	CARPENTRY(10, "CARPENTRY", "CARPENTRY"),

	/**
	 * The '<em><b>MASONRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASONRY_VALUE
	 * @generated
	 * @ordered
	 */
	MASONRY(11, "MASONRY", "MASONRY"),

	/**
	 * The '<em><b>PAINTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAINTING_VALUE
	 * @generated
	 * @ordered
	 */
	PAINTING(12, "PAINTING", "PAINTING"),

	/**
	 * The '<em><b>CONCRETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	CONCRETE(13, "CONCRETE", "CONCRETE"),

	/**
	 * The '<em><b>DRYWALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRYWALL_VALUE
	 * @generated
	 * @ordered
	 */
	DRYWALL(14, "DRYWALL", "DRYWALL"),

	/**
	 * The '<em><b>PLUMBING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUMBING_VALUE
	 * @generated
	 * @ordered
	 */
	PLUMBING(15, "PLUMBING", "PLUMBING"),

	/**
	 * The '<em><b>FINISHING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHING_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHING(16, "FINISHING", "FINISHING"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(17, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>FLOORING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOORING_VALUE
	 * @generated
	 * @ordered
	 */
	FLOORING(18, "FLOORING", "FLOORING"),

	/**
	 * The '<em><b>STEELWORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEELWORK_VALUE
	 * @generated
	 * @ordered
	 */
	STEELWORK(19, "STEELWORK", "STEELWORK"),

	/**
	 * The '<em><b>SURVEYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEYING_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEYING(20, "SURVEYING", "SURVEYING"),

	/**
	 * The '<em><b>ADMINISTRATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATION(21, "ADMINISTRATION", "ADMINISTRATION");

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
	 * The '<em><b>SITEGRADING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SITEGRADING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SITEGRADING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SITEGRADING_VALUE = 1;

	/**
	 * The '<em><b>GENERAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GENERAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_VALUE = 2;

	/**
	 * The '<em><b>LANDSCAPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LANDSCAPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANDSCAPING_VALUE = 3;

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
	 * The '<em><b>HVAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HVAC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HVAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HVAC_VALUE = 5;

	/**
	 * The '<em><b>CLEANING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLEANING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEANING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLEANING_VALUE = 6;

	/**
	 * The '<em><b>ROOFING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOFING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOFING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOFING_VALUE = 7;

	/**
	 * The '<em><b>ELECTRIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_VALUE = 8;

	/**
	 * The '<em><b>PAVING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAVING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAVING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAVING_VALUE = 9;

	/**
	 * The '<em><b>CARPENTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARPENTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARPENTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARPENTRY_VALUE = 10;

	/**
	 * The '<em><b>MASONRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASONRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASONRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASONRY_VALUE = 11;

	/**
	 * The '<em><b>PAINTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAINTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAINTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAINTING_VALUE = 12;

	/**
	 * The '<em><b>CONCRETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONCRETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCRETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_VALUE = 13;

	/**
	 * The '<em><b>DRYWALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRYWALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRYWALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRYWALL_VALUE = 14;

	/**
	 * The '<em><b>PLUMBING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUMBING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUMBING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLUMBING_VALUE = 15;

	/**
	 * The '<em><b>FINISHING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINISHING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINISHING_VALUE = 16;

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
	public static final int USERDEFINED_VALUE = 17;

	/**
	 * The '<em><b>FLOORING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOORING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOORING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOORING_VALUE = 18;

	/**
	 * The '<em><b>STEELWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEELWORK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEELWORK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEELWORK_VALUE = 19;

	/**
	 * The '<em><b>SURVEYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SURVEYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVEYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SURVEYING_VALUE = 20;

	/**
	 * The '<em><b>ADMINISTRATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADMINISTRATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATION_VALUE = 21;

	/**
	 * An array of all the '<em><b>Ifc Labor Resource Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcLaborResourceTypeEnum[] VALUES_ARRAY = new IfcLaborResourceTypeEnum[] { NULL, SITEGRADING, GENERAL, LANDSCAPING, NOTDEFINED, HVAC, CLEANING, ROOFING,
			ELECTRIC, PAVING, CARPENTRY, MASONRY, PAINTING, CONCRETE, DRYWALL, PLUMBING, FINISHING, USERDEFINED, FLOORING, STEELWORK, SURVEYING, ADMINISTRATION, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Labor Resource Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcLaborResourceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Labor Resource Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLaborResourceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLaborResourceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Labor Resource Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLaborResourceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLaborResourceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Labor Resource Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLaborResourceTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case SITEGRADING_VALUE:
			return SITEGRADING;
		case GENERAL_VALUE:
			return GENERAL;
		case LANDSCAPING_VALUE:
			return LANDSCAPING;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case HVAC_VALUE:
			return HVAC;
		case CLEANING_VALUE:
			return CLEANING;
		case ROOFING_VALUE:
			return ROOFING;
		case ELECTRIC_VALUE:
			return ELECTRIC;
		case PAVING_VALUE:
			return PAVING;
		case CARPENTRY_VALUE:
			return CARPENTRY;
		case MASONRY_VALUE:
			return MASONRY;
		case PAINTING_VALUE:
			return PAINTING;
		case CONCRETE_VALUE:
			return CONCRETE;
		case DRYWALL_VALUE:
			return DRYWALL;
		case PLUMBING_VALUE:
			return PLUMBING;
		case FINISHING_VALUE:
			return FINISHING;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case FLOORING_VALUE:
			return FLOORING;
		case STEELWORK_VALUE:
			return STEELWORK;
		case SURVEYING_VALUE:
			return SURVEYING;
		case ADMINISTRATION_VALUE:
			return ADMINISTRATION;
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
	private IfcLaborResourceTypeEnum(int value, String name, String literal) {
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

} //IfcLaborResourceTypeEnum
