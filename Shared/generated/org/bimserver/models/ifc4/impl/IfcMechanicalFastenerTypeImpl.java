/**
 * Copyright (C) 2009-2014 BIMserver.org
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
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcMechanicalFastenerType;
import org.bimserver.models.ifc4.IfcMechanicalFastenerTypeEnum;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Fastener Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMechanicalFastenerTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMechanicalFastenerTypeImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMechanicalFastenerTypeImpl#getNominalDiameterAsString <em>Nominal Diameter As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMechanicalFastenerTypeImpl#getNominalLength <em>Nominal Length</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcMechanicalFastenerTypeImpl#getNominalLengthAsString <em>Nominal Length As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalFastenerTypeImpl extends IfcElementComponentTypeImpl implements IfcMechanicalFastenerType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalFastenerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalFastenerTypeEnum getPredefinedType() {
		return (IfcMechanicalFastenerTypeEnum) eGet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcMechanicalFastenerTypeEnum newPredefinedType) {
		eSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__PREDEFINED_TYPE, newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalDiameter() {
		return (Double) eGet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(double newNominalDiameter) {
		eSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER, newNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameter() {
		eUnset(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameter() {
		return eIsSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalDiameterAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameterAsString(String newNominalDiameterAsString) {
		eSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER_AS_STRING, newNominalDiameterAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameterAsString() {
		eUnset(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameterAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_DIAMETER_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalLength() {
		return (Double) eGet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLength(double newNominalLength) {
		eSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH, newNominalLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalLength() {
		eUnset(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalLength() {
		return eIsSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalLengthAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLengthAsString(String newNominalLengthAsString) {
		eSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH_AS_STRING, newNominalLengthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalLengthAsString() {
		eUnset(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalLengthAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_MECHANICAL_FASTENER_TYPE__NOMINAL_LENGTH_AS_STRING);
	}

} //IfcMechanicalFastenerTypeImpl
