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
 * A representation of the literals of the enumeration '<em><b>Ifc Distribution System Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcDistributionSystemEnum()
 * @model
 * @generated
 */
public enum IfcDistributionSystemEnum implements Enumerator {
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
	 * The '<em><b>DOMESTICCOLDWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTICCOLDWATER_VALUE
	 * @generated
	 * @ordered
	 */
	DOMESTICCOLDWATER(1, "DOMESTICCOLDWATER", "DOMESTICCOLDWATER"),

	/**
	 * The '<em><b>DOMESTICHOTWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTICHOTWATER_VALUE
	 * @generated
	 * @ordered
	 */
	DOMESTICHOTWATER(2, "DOMESTICHOTWATER", "DOMESTICHOTWATER"),

	/**
	 * The '<em><b>CHEMICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL(3, "CHEMICAL", "CHEMICAL"),

	/**
	 * The '<em><b>EXHAUST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXHAUST_VALUE
	 * @generated
	 * @ordered
	 */
	EXHAUST(4, "EXHAUST", "EXHAUST"),

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
	 * The '<em><b>WASTEWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTEWATER_VALUE
	 * @generated
	 * @ordered
	 */
	WASTEWATER(6, "WASTEWATER", "WASTEWATER"),

	/**
	 * The '<em><b>CONTROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL(7, "CONTROL", "CONTROL"),

	/**
	 * The '<em><b>CONVEYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVEYING_VALUE
	 * @generated
	 * @ordered
	 */
	CONVEYING(8, "CONVEYING", "CONVEYING"),

	/**
	 * The '<em><b>REFRIGERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRIGERATION_VALUE
	 * @generated
	 * @ordered
	 */
	REFRIGERATION(9, "REFRIGERATION", "REFRIGERATION"),

	/**
	 * The '<em><b>OIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_VALUE
	 * @generated
	 * @ordered
	 */
	OIL(10, "OIL", "OIL"),

	/**
	 * The '<em><b>STORMWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORMWATER_VALUE
	 * @generated
	 * @ordered
	 */
	STORMWATER(11, "STORMWATER", "STORMWATER"),

	/**
	 * The '<em><b>EARTHING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHING_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHING(12, "EARTHING", "EARTHING"),

	/**
	 * The '<em><b>VENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENT_VALUE
	 * @generated
	 * @ordered
	 */
	VENT(13, "VENT", "VENT"),

	/**
	 * The '<em><b>WATERSUPPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERSUPPLY_VALUE
	 * @generated
	 * @ordered
	 */
	WATERSUPPLY(14, "WATERSUPPLY", "WATERSUPPLY"),

	/**
	 * The '<em><b>POWERGENERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWERGENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	POWERGENERATION(15, "POWERGENERATION", "POWERGENERATION"),

	/**
	 * The '<em><b>OPERATIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONAL(16, "OPERATIONAL", "OPERATIONAL"),

	/**
	 * The '<em><b>HEATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATING_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING(17, "HEATING", "HEATING"),

	/**
	 * The '<em><b>MUNICIPALSOLIDWASTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUNICIPALSOLIDWASTE_VALUE
	 * @generated
	 * @ordered
	 */
	MUNICIPALSOLIDWASTE(18, "MUNICIPALSOLIDWASTE", "MUNICIPALSOLIDWASTE"),

	/**
	 * The '<em><b>ELECTROACOUSTIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTROACOUSTIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTROACOUSTIC(19, "ELECTROACOUSTIC", "ELECTROACOUSTIC"),

	/**
	 * The '<em><b>CHILLEDWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILLEDWATER_VALUE
	 * @generated
	 * @ordered
	 */
	CHILLEDWATER(20, "CHILLEDWATER", "CHILLEDWATER"),

	/**
	 * The '<em><b>VACUUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACUUM_VALUE
	 * @generated
	 * @ordered
	 */
	VACUUM(21, "VACUUM", "VACUUM"),

	/**
	 * The '<em><b>SEWAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEWAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEWAGE(22, "SEWAGE", "SEWAGE"),

	/**
	 * The '<em><b>GAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAS(23, "GAS", "GAS"),

	/**
	 * The '<em><b>FIREPROTECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREPROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FIREPROTECTION(24, "FIREPROTECTION", "FIREPROTECTION"),

	/**
	 * The '<em><b>FUEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUEL_VALUE
	 * @generated
	 * @ordered
	 */
	FUEL(25, "FUEL", "FUEL"),

	/**
	 * The '<em><b>HAZARDOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAZARDOUS_VALUE
	 * @generated
	 * @ordered
	 */
	HAZARDOUS(26, "HAZARDOUS", "HAZARDOUS"),

	/**
	 * The '<em><b>ELECTRICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL(27, "ELECTRICAL", "ELECTRICAL"),

	/**
	 * The '<em><b>LIGHTNINGPROTECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTNINGPROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTNINGPROTECTION(28, "LIGHTNINGPROTECTION", "LIGHTNINGPROTECTION"),

	/**
	 * The '<em><b>TELEPHONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	TELEPHONE(29, "TELEPHONE", "TELEPHONE"),

	/**
	 * The '<em><b>SIGNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL(30, "SIGNAL", "SIGNAL"),

	/**
	 * The '<em><b>DRAINAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAINAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DRAINAGE(31, "DRAINAGE", "DRAINAGE"),

	/**
	 * The '<em><b>VENTILATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENTILATION_VALUE
	 * @generated
	 * @ordered
	 */
	VENTILATION(32, "VENTILATION", "VENTILATION"),

	/**
	 * The '<em><b>COMMUNICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(33, "COMMUNICATION", "COMMUNICATION"),

	/**
	 * The '<em><b>COMPRESSEDAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSEDAIR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSEDAIR(34, "COMPRESSEDAIR", "COMPRESSEDAIR"),

	/**
	 * The '<em><b>AUDIOVISUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOVISUAL_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIOVISUAL(35, "AUDIOVISUAL", "AUDIOVISUAL"),

	/**
	 * The '<em><b>CONDENSERWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDENSERWATER_VALUE
	 * @generated
	 * @ordered
	 */
	CONDENSERWATER(36, "CONDENSERWATER", "CONDENSERWATER"),

	/**
	 * The '<em><b>DISPOSAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPOSAL_VALUE
	 * @generated
	 * @ordered
	 */
	DISPOSAL(37, "DISPOSAL", "DISPOSAL"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(38, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>SECURITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(39, "SECURITY", "SECURITY"),

	/**
	 * The '<em><b>RAINWATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAINWATER_VALUE
	 * @generated
	 * @ordered
	 */
	RAINWATER(40, "RAINWATER", "RAINWATER"),

	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(41, "DATA", "DATA"),

	/**
	 * The '<em><b>AIRCONDITIONING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRCONDITIONING_VALUE
	 * @generated
	 * @ordered
	 */
	AIRCONDITIONING(42, "AIRCONDITIONING", "AIRCONDITIONING"),

	/**
	 * The '<em><b>TV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TV_VALUE
	 * @generated
	 * @ordered
	 */
	TV(43, "TV", "TV"),

	/**
	 * The '<em><b>LIGHTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTING_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTING(44, "LIGHTING", "LIGHTING");

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
	 * The '<em><b>DOMESTICCOLDWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOMESTICCOLDWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMESTICCOLDWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOMESTICCOLDWATER_VALUE = 1;

	/**
	 * The '<em><b>DOMESTICHOTWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOMESTICHOTWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMESTICHOTWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOMESTICHOTWATER_VALUE = 2;

	/**
	 * The '<em><b>CHEMICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHEMICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_VALUE = 3;

	/**
	 * The '<em><b>EXHAUST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXHAUST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXHAUST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXHAUST_VALUE = 4;

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
	 * The '<em><b>WASTEWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WASTEWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WASTEWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WASTEWATER_VALUE = 6;

	/**
	 * The '<em><b>CONTROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTROL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_VALUE = 7;

	/**
	 * The '<em><b>CONVEYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONVEYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONVEYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONVEYING_VALUE = 8;

	/**
	 * The '<em><b>REFRIGERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRIGERATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRIGERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRIGERATION_VALUE = 9;

	/**
	 * The '<em><b>OIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OIL_VALUE = 10;

	/**
	 * The '<em><b>STORMWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STORMWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORMWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORMWATER_VALUE = 11;

	/**
	 * The '<em><b>EARTHING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EARTHING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARTHING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTHING_VALUE = 12;

	/**
	 * The '<em><b>VENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENT_VALUE = 13;

	/**
	 * The '<em><b>WATERSUPPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WATERSUPPLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERSUPPLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATERSUPPLY_VALUE = 14;

	/**
	 * The '<em><b>POWERGENERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POWERGENERATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWERGENERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POWERGENERATION_VALUE = 15;

	/**
	 * The '<em><b>OPERATIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_VALUE = 16;

	/**
	 * The '<em><b>HEATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEATING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEATING_VALUE = 17;

	/**
	 * The '<em><b>MUNICIPALSOLIDWASTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MUNICIPALSOLIDWASTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUNICIPALSOLIDWASTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUNICIPALSOLIDWASTE_VALUE = 18;

	/**
	 * The '<em><b>ELECTROACOUSTIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTROACOUSTIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTROACOUSTIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTROACOUSTIC_VALUE = 19;

	/**
	 * The '<em><b>CHILLEDWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHILLEDWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHILLEDWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHILLEDWATER_VALUE = 20;

	/**
	 * The '<em><b>VACUUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VACUUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VACUUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VACUUM_VALUE = 21;

	/**
	 * The '<em><b>SEWAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEWAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEWAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEWAGE_VALUE = 22;

	/**
	 * The '<em><b>GAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAS_VALUE = 23;

	/**
	 * The '<em><b>FIREPROTECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIREPROTECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIREPROTECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIREPROTECTION_VALUE = 24;

	/**
	 * The '<em><b>FUEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_VALUE = 25;

	/**
	 * The '<em><b>HAZARDOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HAZARDOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAZARDOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HAZARDOUS_VALUE = 26;

	/**
	 * The '<em><b>ELECTRICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_VALUE = 27;

	/**
	 * The '<em><b>LIGHTNINGPROTECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHTNINGPROTECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHTNINGPROTECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTNINGPROTECTION_VALUE = 28;

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
	public static final int TELEPHONE_VALUE = 29;

	/**
	 * The '<em><b>SIGNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_VALUE = 30;

	/**
	 * The '<em><b>DRAINAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAINAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAINAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAINAGE_VALUE = 31;

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
	public static final int VENTILATION_VALUE = 32;

	/**
	 * The '<em><b>COMMUNICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMUNICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 33;

	/**
	 * The '<em><b>COMPRESSEDAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSEDAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSEDAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSEDAIR_VALUE = 34;

	/**
	 * The '<em><b>AUDIOVISUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUDIOVISUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUDIOVISUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUDIOVISUAL_VALUE = 35;

	/**
	 * The '<em><b>CONDENSERWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONDENSERWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDENSERWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDENSERWATER_VALUE = 36;

	/**
	 * The '<em><b>DISPOSAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISPOSAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPOSAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISPOSAL_VALUE = 37;

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
	public static final int USERDEFINED_VALUE = 38;

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
	public static final int SECURITY_VALUE = 39;

	/**
	 * The '<em><b>RAINWATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAINWATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAINWATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAINWATER_VALUE = 40;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 41;

	/**
	 * The '<em><b>AIRCONDITIONING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIRCONDITIONING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIRCONDITIONING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIRCONDITIONING_VALUE = 42;

	/**
	 * The '<em><b>TV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TV_VALUE = 43;

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
	public static final int LIGHTING_VALUE = 44;

	/**
	 * An array of all the '<em><b>Ifc Distribution System Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcDistributionSystemEnum[] VALUES_ARRAY = new IfcDistributionSystemEnum[] { NULL, DOMESTICCOLDWATER, DOMESTICHOTWATER, CHEMICAL, EXHAUST, NOTDEFINED,
			WASTEWATER, CONTROL, CONVEYING, REFRIGERATION, OIL, STORMWATER, EARTHING, VENT, WATERSUPPLY, POWERGENERATION, OPERATIONAL, HEATING, MUNICIPALSOLIDWASTE,
			ELECTROACOUSTIC, CHILLEDWATER, VACUUM, SEWAGE, GAS, FIREPROTECTION, FUEL, HAZARDOUS, ELECTRICAL, LIGHTNINGPROTECTION, TELEPHONE, SIGNAL, DRAINAGE, VENTILATION,
			COMMUNICATION, COMPRESSEDAIR, AUDIOVISUAL, CONDENSERWATER, DISPOSAL, USERDEFINED, SECURITY, RAINWATER, DATA, AIRCONDITIONING, TV, LIGHTING, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Distribution System Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcDistributionSystemEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Distribution System Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDistributionSystemEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDistributionSystemEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Distribution System Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDistributionSystemEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDistributionSystemEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Distribution System Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDistributionSystemEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case DOMESTICCOLDWATER_VALUE:
			return DOMESTICCOLDWATER;
		case DOMESTICHOTWATER_VALUE:
			return DOMESTICHOTWATER;
		case CHEMICAL_VALUE:
			return CHEMICAL;
		case EXHAUST_VALUE:
			return EXHAUST;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case WASTEWATER_VALUE:
			return WASTEWATER;
		case CONTROL_VALUE:
			return CONTROL;
		case CONVEYING_VALUE:
			return CONVEYING;
		case REFRIGERATION_VALUE:
			return REFRIGERATION;
		case OIL_VALUE:
			return OIL;
		case STORMWATER_VALUE:
			return STORMWATER;
		case EARTHING_VALUE:
			return EARTHING;
		case VENT_VALUE:
			return VENT;
		case WATERSUPPLY_VALUE:
			return WATERSUPPLY;
		case POWERGENERATION_VALUE:
			return POWERGENERATION;
		case OPERATIONAL_VALUE:
			return OPERATIONAL;
		case HEATING_VALUE:
			return HEATING;
		case MUNICIPALSOLIDWASTE_VALUE:
			return MUNICIPALSOLIDWASTE;
		case ELECTROACOUSTIC_VALUE:
			return ELECTROACOUSTIC;
		case CHILLEDWATER_VALUE:
			return CHILLEDWATER;
		case VACUUM_VALUE:
			return VACUUM;
		case SEWAGE_VALUE:
			return SEWAGE;
		case GAS_VALUE:
			return GAS;
		case FIREPROTECTION_VALUE:
			return FIREPROTECTION;
		case FUEL_VALUE:
			return FUEL;
		case HAZARDOUS_VALUE:
			return HAZARDOUS;
		case ELECTRICAL_VALUE:
			return ELECTRICAL;
		case LIGHTNINGPROTECTION_VALUE:
			return LIGHTNINGPROTECTION;
		case TELEPHONE_VALUE:
			return TELEPHONE;
		case SIGNAL_VALUE:
			return SIGNAL;
		case DRAINAGE_VALUE:
			return DRAINAGE;
		case VENTILATION_VALUE:
			return VENTILATION;
		case COMMUNICATION_VALUE:
			return COMMUNICATION;
		case COMPRESSEDAIR_VALUE:
			return COMPRESSEDAIR;
		case AUDIOVISUAL_VALUE:
			return AUDIOVISUAL;
		case CONDENSERWATER_VALUE:
			return CONDENSERWATER;
		case DISPOSAL_VALUE:
			return DISPOSAL;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case SECURITY_VALUE:
			return SECURITY;
		case RAINWATER_VALUE:
			return RAINWATER;
		case DATA_VALUE:
			return DATA;
		case AIRCONDITIONING_VALUE:
			return AIRCONDITIONING;
		case TV_VALUE:
			return TV;
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
	private IfcDistributionSystemEnum(int value, String name, String literal) {
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

} //IfcDistributionSystemEnum
