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
 * A representation of the literals of the enumeration '<em><b>Ifc Derived Unit Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcDerivedUnitEnum()
 * @model
 * @generated
 */
public enum IfcDerivedUnitEnum implements Enumerator {
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
	 * The '<em><b>MOMENTOFINERTIAUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOMENTOFINERTIAUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MOMENTOFINERTIAUNIT(1, "MOMENTOFINERTIAUNIT", "MOMENTOFINERTIAUNIT"),

	/**
	 * The '<em><b>MOLECULARWEIGHTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOLECULARWEIGHTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MOLECULARWEIGHTUNIT(2, "MOLECULARWEIGHTUNIT", "MOLECULARWEIGHTUNIT"),

	/**
	 * The '<em><b>SECTIONMODULUSUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTIONMODULUSUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SECTIONMODULUSUNIT(3, "SECTIONMODULUSUNIT", "SECTIONMODULUSUNIT"),

	/**
	 * The '<em><b>HEATFLUXDENSITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATFLUXDENSITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEATFLUXDENSITYUNIT(4, "HEATFLUXDENSITYUNIT", "HEATFLUXDENSITYUNIT"),

	/**
	 * The '<em><b>ROTATIONALFREQUENCYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTATIONALFREQUENCYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ROTATIONALFREQUENCYUNIT(5, "ROTATIONALFREQUENCYUNIT", "ROTATIONALFREQUENCYUNIT"),

	/**
	 * The '<em><b>THERMALTRANSMITTANCEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMALTRANSMITTANCEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMALTRANSMITTANCEUNIT(6, "THERMALTRANSMITTANCEUNIT", "THERMALTRANSMITTANCEUNIT"),

	/**
	 * The '<em><b>KINEMATICVISCOSITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINEMATICVISCOSITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	KINEMATICVISCOSITYUNIT(7, "KINEMATICVISCOSITYUNIT", "KINEMATICVISCOSITYUNIT"),

	/**
	 * The '<em><b>VOLUMETRICFLOWRATEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUMETRICFLOWRATEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	VOLUMETRICFLOWRATEUNIT(8, "VOLUMETRICFLOWRATEUNIT", "VOLUMETRICFLOWRATEUNIT"),

	/**
	 * The '<em><b>SPECIFICHEATCAPACITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFICHEATCAPACITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICHEATCAPACITYUNIT(9, "SPECIFICHEATCAPACITYUNIT", "SPECIFICHEATCAPACITYUNIT"),

	/**
	 * The '<em><b>HEATINGVALUEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATINGVALUEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEATINGVALUEUNIT(10, "HEATINGVALUEUNIT", "HEATINGVALUEUNIT"),

	/**
	 * The '<em><b>SOUNDPRESSURELEVELUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUNDPRESSURELEVELUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SOUNDPRESSURELEVELUNIT(11, "SOUNDPRESSURELEVELUNIT", "SOUNDPRESSURELEVELUNIT"),

	/**
	 * The '<em><b>TORQUEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TORQUEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	TORQUEUNIT(12, "TORQUEUNIT", "TORQUEUNIT"),

	/**
	 * The '<em><b>THERMALRESISTANCEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMALRESISTANCEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMALRESISTANCEUNIT(13, "THERMALRESISTANCEUNIT", "THERMALRESISTANCEUNIT"),

	/**
	 * The '<em><b>SHEARMODULUSUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEARMODULUSUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SHEARMODULUSUNIT(14, "SHEARMODULUSUNIT", "SHEARMODULUSUNIT"),

	/**
	 * The '<em><b>MODULUSOFSUBGRADEREACTIONUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFSUBGRADEREACTIONUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MODULUSOFSUBGRADEREACTIONUNIT(15, "MODULUSOFSUBGRADEREACTIONUNIT", "MODULUSOFSUBGRADEREACTIONUNIT"),

	/**
	 * The '<em><b>DYNAMICVISCOSITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMICVISCOSITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMICVISCOSITYUNIT(16, "DYNAMICVISCOSITYUNIT", "DYNAMICVISCOSITYUNIT"),

	/**
	 * The '<em><b>ROTATIONALSTIFFNESSUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTATIONALSTIFFNESSUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ROTATIONALSTIFFNESSUNIT(17, "ROTATIONALSTIFFNESSUNIT", "ROTATIONALSTIFFNESSUNIT"),

	/**
	 * The '<em><b>AREADENSITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREADENSITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	AREADENSITYUNIT(18, "AREADENSITYUNIT", "AREADENSITYUNIT"),

	/**
	 * The '<em><b>MASSDENSITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASSDENSITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MASSDENSITYUNIT(19, "MASSDENSITYUNIT", "MASSDENSITYUNIT"),

	/**
	 * The '<em><b>LINEARSTIFFNESSUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEARSTIFFNESSUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	LINEARSTIFFNESSUNIT(20, "LINEARSTIFFNESSUNIT", "LINEARSTIFFNESSUNIT"),

	/**
	 * The '<em><b>VAPORPERMEABILITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAPORPERMEABILITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	VAPORPERMEABILITYUNIT(21, "VAPORPERMEABILITYUNIT", "VAPORPERMEABILITYUNIT"),

	/**
	 * The '<em><b>TEMPERATUREGRADIENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATUREGRADIENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATUREGRADIENTUNIT(22, "TEMPERATUREGRADIENTUNIT", "TEMPERATUREGRADIENTUNIT"),

	/**
	 * The '<em><b>WARPINGMOMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARPINGMOMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	WARPINGMOMENTUNIT(23, "WARPINGMOMENTUNIT", "WARPINGMOMENTUNIT"),

	/**
	 * The '<em><b>ANGULARVELOCITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANGULARVELOCITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ANGULARVELOCITYUNIT(24, "ANGULARVELOCITYUNIT", "ANGULARVELOCITYUNIT"),

	/**
	 * The '<em><b>CURVATUREUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVATUREUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	CURVATUREUNIT(25, "CURVATUREUNIT", "CURVATUREUNIT"),

	/**
	 * The '<em><b>ROTATIONALMASSUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTATIONALMASSUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ROTATIONALMASSUNIT(26, "ROTATIONALMASSUNIT", "ROTATIONALMASSUNIT"),

	/**
	 * The '<em><b>THERMALADMITTANCEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMALADMITTANCEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMALADMITTANCEUNIT(27, "THERMALADMITTANCEUNIT", "THERMALADMITTANCEUNIT"),

	/**
	 * The '<em><b>MASSFLOWRATEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASSFLOWRATEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MASSFLOWRATEUNIT(28, "MASSFLOWRATEUNIT", "MASSFLOWRATEUNIT"),

	/**
	 * The '<em><b>SOUNDPOWERUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUNDPOWERUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SOUNDPOWERUNIT(29, "SOUNDPOWERUNIT", "SOUNDPOWERUNIT"),

	/**
	 * The '<em><b>COMPOUNDPLANEANGLEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOUNDPLANEANGLEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOUNDPLANEANGLEUNIT(30, "COMPOUNDPLANEANGLEUNIT", "COMPOUNDPLANEANGLEUNIT"),

	/**
	 * The '<em><b>ISOTHERMALMOISTURECAPACITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISOTHERMALMOISTURECAPACITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ISOTHERMALMOISTURECAPACITYUNIT(31, "ISOTHERMALMOISTURECAPACITYUNIT", "ISOTHERMALMOISTURECAPACITYUNIT"),

	/**
	 * The '<em><b>IONCONCENTRATIONUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IONCONCENTRATIONUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	IONCONCENTRATIONUNIT(32, "IONCONCENTRATIONUNIT", "IONCONCENTRATIONUNIT"),

	/**
	 * The '<em><b>ACCELERATIONUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELERATIONUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELERATIONUNIT(33, "ACCELERATIONUNIT", "ACCELERATIONUNIT"),

	/**
	 * The '<em><b>MODULUSOFROTATIONALSUBGRADEREACTIONUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFROTATIONALSUBGRADEREACTIONUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MODULUSOFROTATIONALSUBGRADEREACTIONUNIT(34, "MODULUSOFROTATIONALSUBGRADEREACTIONUNIT", "MODULUSOFROTATIONALSUBGRADEREACTIONUNIT"),

	/**
	 * The '<em><b>PLANARFORCEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANARFORCEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	PLANARFORCEUNIT(35, "PLANARFORCEUNIT", "PLANARFORCEUNIT"),

	/**
	 * The '<em><b>MOISTUREDIFFUSIVITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOISTUREDIFFUSIVITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MOISTUREDIFFUSIVITYUNIT(36, "MOISTUREDIFFUSIVITYUNIT", "MOISTUREDIFFUSIVITYUNIT"),

	/**
	 * The '<em><b>SECTIONAREAINTEGRALUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTIONAREAINTEGRALUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SECTIONAREAINTEGRALUNIT(37, "SECTIONAREAINTEGRALUNIT", "SECTIONAREAINTEGRALUNIT"),

	/**
	 * The '<em><b>MODULUSOFELASTICITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFELASTICITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MODULUSOFELASTICITYUNIT(38, "MODULUSOFELASTICITYUNIT", "MODULUSOFELASTICITYUNIT"),

	/**
	 * The '<em><b>LINEARVELOCITYUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEARVELOCITYUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	LINEARVELOCITYUNIT(39, "LINEARVELOCITYUNIT", "LINEARVELOCITYUNIT"),

	/**
	 * The '<em><b>MASSPERLENGTHUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASSPERLENGTHUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MASSPERLENGTHUNIT(40, "MASSPERLENGTHUNIT", "MASSPERLENGTHUNIT"),

	/**
	 * The '<em><b>INTEGERCOUNTRATEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGERCOUNTRATEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGERCOUNTRATEUNIT(41, "INTEGERCOUNTRATEUNIT", "INTEGERCOUNTRATEUNIT"),

	/**
	 * The '<em><b>LINEARMOMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEARMOMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	LINEARMOMENTUNIT(42, "LINEARMOMENTUNIT", "LINEARMOMENTUNIT"),

	/**
	 * The '<em><b>SOUNDPRESSUREUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUNDPRESSUREUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SOUNDPRESSUREUNIT(43, "SOUNDPRESSUREUNIT", "SOUNDPRESSUREUNIT"),

	/**
	 * The '<em><b>LINEARFORCEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEARFORCEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	LINEARFORCEUNIT(44, "LINEARFORCEUNIT", "LINEARFORCEUNIT"),

	/**
	 * The '<em><b>LUMINOUSINTENSITYDISTRIBUTIONUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUMINOUSINTENSITYDISTRIBUTIONUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	LUMINOUSINTENSITYDISTRIBUTIONUNIT(45, "LUMINOUSINTENSITYDISTRIBUTIONUNIT", "LUMINOUSINTENSITYDISTRIBUTIONUNIT"),

	/**
	 * The '<em><b>SOUNDPOWERLEVELUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUNDPOWERLEVELUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SOUNDPOWERLEVELUNIT(46, "SOUNDPOWERLEVELUNIT", "SOUNDPOWERLEVELUNIT"),

	/**
	 * The '<em><b>THERMALEXPANSIONCOEFFICIENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMALEXPANSIONCOEFFICIENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMALEXPANSIONCOEFFICIENTUNIT(47, "THERMALEXPANSIONCOEFFICIENTUNIT", "THERMALEXPANSIONCOEFFICIENTUNIT"),

	/**
	 * The '<em><b>PHUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	PHUNIT(48, "PHUNIT", "PHUNIT"),

	/**
	 * The '<em><b>MODULUSOFLINEARSUBGRADEREACTIONUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFLINEARSUBGRADEREACTIONUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	MODULUSOFLINEARSUBGRADEREACTIONUNIT(49, "MODULUSOFLINEARSUBGRADEREACTIONUNIT", "MODULUSOFLINEARSUBGRADEREACTIONUNIT"),

	/**
	 * The '<em><b>WARPINGCONSTANTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARPINGCONSTANTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	WARPINGCONSTANTUNIT(50, "WARPINGCONSTANTUNIT", "WARPINGCONSTANTUNIT"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(51, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>TEMPERATURERATEOFCHANGEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURERATEOFCHANGEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURERATEOFCHANGEUNIT(52, "TEMPERATURERATEOFCHANGEUNIT", "TEMPERATURERATEOFCHANGEUNIT"),

	/**
	 * The '<em><b>THERMALCONDUCTANCEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMALCONDUCTANCEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMALCONDUCTANCEUNIT(53, "THERMALCONDUCTANCEUNIT", "THERMALCONDUCTANCEUNIT");

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
	 * The '<em><b>MOMENTOFINERTIAUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOMENTOFINERTIAUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOMENTOFINERTIAUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOMENTOFINERTIAUNIT_VALUE = 1;

	/**
	 * The '<em><b>MOLECULARWEIGHTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOLECULARWEIGHTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOLECULARWEIGHTUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULARWEIGHTUNIT_VALUE = 2;

	/**
	 * The '<em><b>SECTIONMODULUSUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECTIONMODULUSUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECTIONMODULUSUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONMODULUSUNIT_VALUE = 3;

	/**
	 * The '<em><b>HEATFLUXDENSITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEATFLUXDENSITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEATFLUXDENSITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEATFLUXDENSITYUNIT_VALUE = 4;

	/**
	 * The '<em><b>ROTATIONALFREQUENCYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTATIONALFREQUENCYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTATIONALFREQUENCYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTATIONALFREQUENCYUNIT_VALUE = 5;

	/**
	 * The '<em><b>THERMALTRANSMITTANCEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMALTRANSMITTANCEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMALTRANSMITTANCEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMALTRANSMITTANCEUNIT_VALUE = 6;

	/**
	 * The '<em><b>KINEMATICVISCOSITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KINEMATICVISCOSITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KINEMATICVISCOSITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KINEMATICVISCOSITYUNIT_VALUE = 7;

	/**
	 * The '<em><b>VOLUMETRICFLOWRATEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLUMETRICFLOWRATEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLUMETRICFLOWRATEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLUMETRICFLOWRATEUNIT_VALUE = 8;

	/**
	 * The '<em><b>SPECIFICHEATCAPACITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPECIFICHEATCAPACITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIFICHEATCAPACITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICHEATCAPACITYUNIT_VALUE = 9;

	/**
	 * The '<em><b>HEATINGVALUEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEATINGVALUEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEATINGVALUEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEATINGVALUEUNIT_VALUE = 10;

	/**
	 * The '<em><b>SOUNDPRESSURELEVELUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUNDPRESSURELEVELUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUNDPRESSURELEVELUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUNDPRESSURELEVELUNIT_VALUE = 11;

	/**
	 * The '<em><b>TORQUEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TORQUEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TORQUEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TORQUEUNIT_VALUE = 12;

	/**
	 * The '<em><b>THERMALRESISTANCEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMALRESISTANCEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMALRESISTANCEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMALRESISTANCEUNIT_VALUE = 13;

	/**
	 * The '<em><b>SHEARMODULUSUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEARMODULUSUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEARMODULUSUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEARMODULUSUNIT_VALUE = 14;

	/**
	 * The '<em><b>MODULUSOFSUBGRADEREACTIONUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULUSOFSUBGRADEREACTIONUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFSUBGRADEREACTIONUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULUSOFSUBGRADEREACTIONUNIT_VALUE = 15;

	/**
	 * The '<em><b>DYNAMICVISCOSITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DYNAMICVISCOSITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMICVISCOSITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMICVISCOSITYUNIT_VALUE = 16;

	/**
	 * The '<em><b>ROTATIONALSTIFFNESSUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTATIONALSTIFFNESSUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTATIONALSTIFFNESSUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTATIONALSTIFFNESSUNIT_VALUE = 17;

	/**
	 * The '<em><b>AREADENSITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AREADENSITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREADENSITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AREADENSITYUNIT_VALUE = 18;

	/**
	 * The '<em><b>MASSDENSITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASSDENSITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASSDENSITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASSDENSITYUNIT_VALUE = 19;

	/**
	 * The '<em><b>LINEARSTIFFNESSUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARSTIFFNESSUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEARSTIFFNESSUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEARSTIFFNESSUNIT_VALUE = 20;

	/**
	 * The '<em><b>VAPORPERMEABILITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAPORPERMEABILITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAPORPERMEABILITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAPORPERMEABILITYUNIT_VALUE = 21;

	/**
	 * The '<em><b>TEMPERATUREGRADIENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPERATUREGRADIENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATUREGRADIENTUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATUREGRADIENTUNIT_VALUE = 22;

	/**
	 * The '<em><b>WARPINGMOMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARPINGMOMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARPINGMOMENTUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARPINGMOMENTUNIT_VALUE = 23;

	/**
	 * The '<em><b>ANGULARVELOCITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANGULARVELOCITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANGULARVELOCITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANGULARVELOCITYUNIT_VALUE = 24;

	/**
	 * The '<em><b>CURVATUREUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURVATUREUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURVATUREUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURVATUREUNIT_VALUE = 25;

	/**
	 * The '<em><b>ROTATIONALMASSUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTATIONALMASSUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTATIONALMASSUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTATIONALMASSUNIT_VALUE = 26;

	/**
	 * The '<em><b>THERMALADMITTANCEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMALADMITTANCEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMALADMITTANCEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMALADMITTANCEUNIT_VALUE = 27;

	/**
	 * The '<em><b>MASSFLOWRATEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASSFLOWRATEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASSFLOWRATEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASSFLOWRATEUNIT_VALUE = 28;

	/**
	 * The '<em><b>SOUNDPOWERUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUNDPOWERUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUNDPOWERUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUNDPOWERUNIT_VALUE = 29;

	/**
	 * The '<em><b>COMPOUNDPLANEANGLEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPOUNDPLANEANGLEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOUNDPLANEANGLEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPOUNDPLANEANGLEUNIT_VALUE = 30;

	/**
	 * The '<em><b>ISOTHERMALMOISTURECAPACITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISOTHERMALMOISTURECAPACITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISOTHERMALMOISTURECAPACITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISOTHERMALMOISTURECAPACITYUNIT_VALUE = 31;

	/**
	 * The '<em><b>IONCONCENTRATIONUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IONCONCENTRATIONUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IONCONCENTRATIONUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IONCONCENTRATIONUNIT_VALUE = 32;

	/**
	 * The '<em><b>ACCELERATIONUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCELERATIONUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCELERATIONUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCELERATIONUNIT_VALUE = 33;

	/**
	 * The '<em><b>MODULUSOFROTATIONALSUBGRADEREACTIONUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULUSOFROTATIONALSUBGRADEREACTIONUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFROTATIONALSUBGRADEREACTIONUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULUSOFROTATIONALSUBGRADEREACTIONUNIT_VALUE = 34;

	/**
	 * The '<em><b>PLANARFORCEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLANARFORCEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLANARFORCEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLANARFORCEUNIT_VALUE = 35;

	/**
	 * The '<em><b>MOISTUREDIFFUSIVITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOISTUREDIFFUSIVITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOISTUREDIFFUSIVITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOISTUREDIFFUSIVITYUNIT_VALUE = 36;

	/**
	 * The '<em><b>SECTIONAREAINTEGRALUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECTIONAREAINTEGRALUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECTIONAREAINTEGRALUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONAREAINTEGRALUNIT_VALUE = 37;

	/**
	 * The '<em><b>MODULUSOFELASTICITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULUSOFELASTICITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFELASTICITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULUSOFELASTICITYUNIT_VALUE = 38;

	/**
	 * The '<em><b>LINEARVELOCITYUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARVELOCITYUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEARVELOCITYUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEARVELOCITYUNIT_VALUE = 39;

	/**
	 * The '<em><b>MASSPERLENGTHUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASSPERLENGTHUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASSPERLENGTHUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASSPERLENGTHUNIT_VALUE = 40;

	/**
	 * The '<em><b>INTEGERCOUNTRATEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGERCOUNTRATEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGERCOUNTRATEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGERCOUNTRATEUNIT_VALUE = 41;

	/**
	 * The '<em><b>LINEARMOMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARMOMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEARMOMENTUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEARMOMENTUNIT_VALUE = 42;

	/**
	 * The '<em><b>SOUNDPRESSUREUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUNDPRESSUREUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUNDPRESSUREUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUNDPRESSUREUNIT_VALUE = 43;

	/**
	 * The '<em><b>LINEARFORCEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEARFORCEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEARFORCEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEARFORCEUNIT_VALUE = 44;

	/**
	 * The '<em><b>LUMINOUSINTENSITYDISTRIBUTIONUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LUMINOUSINTENSITYDISTRIBUTIONUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LUMINOUSINTENSITYDISTRIBUTIONUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUMINOUSINTENSITYDISTRIBUTIONUNIT_VALUE = 45;

	/**
	 * The '<em><b>SOUNDPOWERLEVELUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUNDPOWERLEVELUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUNDPOWERLEVELUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUNDPOWERLEVELUNIT_VALUE = 46;

	/**
	 * The '<em><b>THERMALEXPANSIONCOEFFICIENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMALEXPANSIONCOEFFICIENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMALEXPANSIONCOEFFICIENTUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMALEXPANSIONCOEFFICIENTUNIT_VALUE = 47;

	/**
	 * The '<em><b>PHUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHUNIT_VALUE = 48;

	/**
	 * The '<em><b>MODULUSOFLINEARSUBGRADEREACTIONUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULUSOFLINEARSUBGRADEREACTIONUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULUSOFLINEARSUBGRADEREACTIONUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULUSOFLINEARSUBGRADEREACTIONUNIT_VALUE = 49;

	/**
	 * The '<em><b>WARPINGCONSTANTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARPINGCONSTANTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARPINGCONSTANTUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARPINGCONSTANTUNIT_VALUE = 50;

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
	public static final int USERDEFINED_VALUE = 51;

	/**
	 * The '<em><b>TEMPERATURERATEOFCHANGEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPERATURERATEOFCHANGEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURERATEOFCHANGEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURERATEOFCHANGEUNIT_VALUE = 52;

	/**
	 * The '<em><b>THERMALCONDUCTANCEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMALCONDUCTANCEUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMALCONDUCTANCEUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMALCONDUCTANCEUNIT_VALUE = 53;

	/**
	 * An array of all the '<em><b>Ifc Derived Unit Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcDerivedUnitEnum[] VALUES_ARRAY = new IfcDerivedUnitEnum[] { NULL, MOMENTOFINERTIAUNIT, MOLECULARWEIGHTUNIT, SECTIONMODULUSUNIT, HEATFLUXDENSITYUNIT,
			ROTATIONALFREQUENCYUNIT, THERMALTRANSMITTANCEUNIT, KINEMATICVISCOSITYUNIT, VOLUMETRICFLOWRATEUNIT, SPECIFICHEATCAPACITYUNIT, HEATINGVALUEUNIT, SOUNDPRESSURELEVELUNIT,
			TORQUEUNIT, THERMALRESISTANCEUNIT, SHEARMODULUSUNIT, MODULUSOFSUBGRADEREACTIONUNIT, DYNAMICVISCOSITYUNIT, ROTATIONALSTIFFNESSUNIT, AREADENSITYUNIT, MASSDENSITYUNIT,
			LINEARSTIFFNESSUNIT, VAPORPERMEABILITYUNIT, TEMPERATUREGRADIENTUNIT, WARPINGMOMENTUNIT, ANGULARVELOCITYUNIT, CURVATUREUNIT, ROTATIONALMASSUNIT, THERMALADMITTANCEUNIT,
			MASSFLOWRATEUNIT, SOUNDPOWERUNIT, COMPOUNDPLANEANGLEUNIT, ISOTHERMALMOISTURECAPACITYUNIT, IONCONCENTRATIONUNIT, ACCELERATIONUNIT,
			MODULUSOFROTATIONALSUBGRADEREACTIONUNIT, PLANARFORCEUNIT, MOISTUREDIFFUSIVITYUNIT, SECTIONAREAINTEGRALUNIT, MODULUSOFELASTICITYUNIT, LINEARVELOCITYUNIT,
			MASSPERLENGTHUNIT, INTEGERCOUNTRATEUNIT, LINEARMOMENTUNIT, SOUNDPRESSUREUNIT, LINEARFORCEUNIT, LUMINOUSINTENSITYDISTRIBUTIONUNIT, SOUNDPOWERLEVELUNIT,
			THERMALEXPANSIONCOEFFICIENTUNIT, PHUNIT, MODULUSOFLINEARSUBGRADEREACTIONUNIT, WARPINGCONSTANTUNIT, USERDEFINED, TEMPERATURERATEOFCHANGEUNIT, THERMALCONDUCTANCEUNIT, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Derived Unit Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcDerivedUnitEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Derived Unit Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDerivedUnitEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDerivedUnitEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Derived Unit Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDerivedUnitEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDerivedUnitEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Derived Unit Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDerivedUnitEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case MOMENTOFINERTIAUNIT_VALUE:
			return MOMENTOFINERTIAUNIT;
		case MOLECULARWEIGHTUNIT_VALUE:
			return MOLECULARWEIGHTUNIT;
		case SECTIONMODULUSUNIT_VALUE:
			return SECTIONMODULUSUNIT;
		case HEATFLUXDENSITYUNIT_VALUE:
			return HEATFLUXDENSITYUNIT;
		case ROTATIONALFREQUENCYUNIT_VALUE:
			return ROTATIONALFREQUENCYUNIT;
		case THERMALTRANSMITTANCEUNIT_VALUE:
			return THERMALTRANSMITTANCEUNIT;
		case KINEMATICVISCOSITYUNIT_VALUE:
			return KINEMATICVISCOSITYUNIT;
		case VOLUMETRICFLOWRATEUNIT_VALUE:
			return VOLUMETRICFLOWRATEUNIT;
		case SPECIFICHEATCAPACITYUNIT_VALUE:
			return SPECIFICHEATCAPACITYUNIT;
		case HEATINGVALUEUNIT_VALUE:
			return HEATINGVALUEUNIT;
		case SOUNDPRESSURELEVELUNIT_VALUE:
			return SOUNDPRESSURELEVELUNIT;
		case TORQUEUNIT_VALUE:
			return TORQUEUNIT;
		case THERMALRESISTANCEUNIT_VALUE:
			return THERMALRESISTANCEUNIT;
		case SHEARMODULUSUNIT_VALUE:
			return SHEARMODULUSUNIT;
		case MODULUSOFSUBGRADEREACTIONUNIT_VALUE:
			return MODULUSOFSUBGRADEREACTIONUNIT;
		case DYNAMICVISCOSITYUNIT_VALUE:
			return DYNAMICVISCOSITYUNIT;
		case ROTATIONALSTIFFNESSUNIT_VALUE:
			return ROTATIONALSTIFFNESSUNIT;
		case AREADENSITYUNIT_VALUE:
			return AREADENSITYUNIT;
		case MASSDENSITYUNIT_VALUE:
			return MASSDENSITYUNIT;
		case LINEARSTIFFNESSUNIT_VALUE:
			return LINEARSTIFFNESSUNIT;
		case VAPORPERMEABILITYUNIT_VALUE:
			return VAPORPERMEABILITYUNIT;
		case TEMPERATUREGRADIENTUNIT_VALUE:
			return TEMPERATUREGRADIENTUNIT;
		case WARPINGMOMENTUNIT_VALUE:
			return WARPINGMOMENTUNIT;
		case ANGULARVELOCITYUNIT_VALUE:
			return ANGULARVELOCITYUNIT;
		case CURVATUREUNIT_VALUE:
			return CURVATUREUNIT;
		case ROTATIONALMASSUNIT_VALUE:
			return ROTATIONALMASSUNIT;
		case THERMALADMITTANCEUNIT_VALUE:
			return THERMALADMITTANCEUNIT;
		case MASSFLOWRATEUNIT_VALUE:
			return MASSFLOWRATEUNIT;
		case SOUNDPOWERUNIT_VALUE:
			return SOUNDPOWERUNIT;
		case COMPOUNDPLANEANGLEUNIT_VALUE:
			return COMPOUNDPLANEANGLEUNIT;
		case ISOTHERMALMOISTURECAPACITYUNIT_VALUE:
			return ISOTHERMALMOISTURECAPACITYUNIT;
		case IONCONCENTRATIONUNIT_VALUE:
			return IONCONCENTRATIONUNIT;
		case ACCELERATIONUNIT_VALUE:
			return ACCELERATIONUNIT;
		case MODULUSOFROTATIONALSUBGRADEREACTIONUNIT_VALUE:
			return MODULUSOFROTATIONALSUBGRADEREACTIONUNIT;
		case PLANARFORCEUNIT_VALUE:
			return PLANARFORCEUNIT;
		case MOISTUREDIFFUSIVITYUNIT_VALUE:
			return MOISTUREDIFFUSIVITYUNIT;
		case SECTIONAREAINTEGRALUNIT_VALUE:
			return SECTIONAREAINTEGRALUNIT;
		case MODULUSOFELASTICITYUNIT_VALUE:
			return MODULUSOFELASTICITYUNIT;
		case LINEARVELOCITYUNIT_VALUE:
			return LINEARVELOCITYUNIT;
		case MASSPERLENGTHUNIT_VALUE:
			return MASSPERLENGTHUNIT;
		case INTEGERCOUNTRATEUNIT_VALUE:
			return INTEGERCOUNTRATEUNIT;
		case LINEARMOMENTUNIT_VALUE:
			return LINEARMOMENTUNIT;
		case SOUNDPRESSUREUNIT_VALUE:
			return SOUNDPRESSUREUNIT;
		case LINEARFORCEUNIT_VALUE:
			return LINEARFORCEUNIT;
		case LUMINOUSINTENSITYDISTRIBUTIONUNIT_VALUE:
			return LUMINOUSINTENSITYDISTRIBUTIONUNIT;
		case SOUNDPOWERLEVELUNIT_VALUE:
			return SOUNDPOWERLEVELUNIT;
		case THERMALEXPANSIONCOEFFICIENTUNIT_VALUE:
			return THERMALEXPANSIONCOEFFICIENTUNIT;
		case PHUNIT_VALUE:
			return PHUNIT;
		case MODULUSOFLINEARSUBGRADEREACTIONUNIT_VALUE:
			return MODULUSOFLINEARSUBGRADEREACTIONUNIT;
		case WARPINGCONSTANTUNIT_VALUE:
			return WARPINGCONSTANTUNIT;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case TEMPERATURERATEOFCHANGEUNIT_VALUE:
			return TEMPERATURERATEOFCHANGEUNIT;
		case THERMALCONDUCTANCEUNIT_VALUE:
			return THERMALCONDUCTANCEUNIT;
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
	private IfcDerivedUnitEnum(int value, String name, String literal) {
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

} //IfcDerivedUnitEnum
