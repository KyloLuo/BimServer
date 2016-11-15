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
 * A representation of the literals of the enumeration '<em><b>Ifc Benchmark Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcBenchmarkEnum()
 * @model
 * @generated
 */
public enum IfcBenchmarkEnum implements Enumerator {
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
	 * The '<em><b>INCLUDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDES(1, "INCLUDES", "INCLUDES"),

	/**
	 * The '<em><b>LESSTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHAN(2, "LESSTHAN", "LESSTHAN"),

	/**
	 * The '<em><b>GREATERTHANOREQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHANOREQUALTO(3, "GREATERTHANOREQUALTO", "GREATERTHANOREQUALTO"),

	/**
	 * The '<em><b>NOTINCLUDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTINCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	NOTINCLUDES(4, "NOTINCLUDES", "NOTINCLUDES"),

	/**
	 * The '<em><b>EQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALTO(5, "EQUALTO", "EQUALTO"),

	/**
	 * The '<em><b>LESSTHANOREQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHANOREQUALTO(6, "LESSTHANOREQUALTO", "LESSTHANOREQUALTO"),

	/**
	 * The '<em><b>NOTINCLUDEDIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTINCLUDEDIN_VALUE
	 * @generated
	 * @ordered
	 */
	NOTINCLUDEDIN(7, "NOTINCLUDEDIN", "NOTINCLUDEDIN"),

	/**
	 * The '<em><b>NOTEQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEQUALTO(8, "NOTEQUALTO", "NOTEQUALTO"),

	/**
	 * The '<em><b>INCLUDEDIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDEDIN_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDEDIN(9, "INCLUDEDIN", "INCLUDEDIN"),

	/**
	 * The '<em><b>GREATERTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHAN(10, "GREATERTHAN", "GREATERTHAN");

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
	 * The '<em><b>INCLUDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDES_VALUE = 1;

	/**
	 * The '<em><b>LESSTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSTHAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHAN_VALUE = 2;

	/**
	 * The '<em><b>GREATERTHANOREQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATERTHANOREQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHANOREQUALTO_VALUE = 3;

	/**
	 * The '<em><b>NOTINCLUDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTINCLUDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTINCLUDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTINCLUDES_VALUE = 4;

	/**
	 * The '<em><b>EQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALTO_VALUE = 5;

	/**
	 * The '<em><b>LESSTHANOREQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSTHANOREQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHANOREQUALTO_VALUE = 6;

	/**
	 * The '<em><b>NOTINCLUDEDIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTINCLUDEDIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTINCLUDEDIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTINCLUDEDIN_VALUE = 7;

	/**
	 * The '<em><b>NOTEQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTEQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTEQUALTO_VALUE = 8;

	/**
	 * The '<em><b>INCLUDEDIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUDEDIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDEDIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDEDIN_VALUE = 9;

	/**
	 * The '<em><b>GREATERTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATERTHAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHAN_VALUE = 10;

	/**
	 * An array of all the '<em><b>Ifc Benchmark Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcBenchmarkEnum[] VALUES_ARRAY = new IfcBenchmarkEnum[] { NULL, INCLUDES, LESSTHAN, GREATERTHANOREQUALTO, NOTINCLUDES, EQUALTO, LESSTHANOREQUALTO,
			NOTINCLUDEDIN, NOTEQUALTO, INCLUDEDIN, GREATERTHAN, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Benchmark Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcBenchmarkEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Benchmark Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcBenchmarkEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcBenchmarkEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Benchmark Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcBenchmarkEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcBenchmarkEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Benchmark Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcBenchmarkEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case INCLUDES_VALUE:
			return INCLUDES;
		case LESSTHAN_VALUE:
			return LESSTHAN;
		case GREATERTHANOREQUALTO_VALUE:
			return GREATERTHANOREQUALTO;
		case NOTINCLUDES_VALUE:
			return NOTINCLUDES;
		case EQUALTO_VALUE:
			return EQUALTO;
		case LESSTHANOREQUALTO_VALUE:
			return LESSTHANOREQUALTO;
		case NOTINCLUDEDIN_VALUE:
			return NOTINCLUDEDIN;
		case NOTEQUALTO_VALUE:
			return NOTEQUALTO;
		case INCLUDEDIN_VALUE:
			return INCLUDEDIN;
		case GREATERTHAN_VALUE:
			return GREATERTHAN;
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
	private IfcBenchmarkEnum(int value, String name, String literal) {
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

} //IfcBenchmarkEnum
