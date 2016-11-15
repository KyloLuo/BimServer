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
import org.bimserver.models.ifc4.IfcStairFlight;
import org.bimserver.models.ifc4.IfcStairFlightTypeEnum;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Stair Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getNumberOfRiser <em>Number Of Riser</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getNumberOfTreads <em>Number Of Treads</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getRiserHeight <em>Riser Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getRiserHeightAsString <em>Riser Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getTreadLength <em>Tread Length</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getTreadLengthAsString <em>Tread Length As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcStairFlightImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStairFlightImpl extends IfcBuildingElementImpl implements IfcStairFlight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStairFlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_STAIR_FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRiser() {
		return (Integer) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_RISER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRiser(int newNumberOfRiser) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_RISER, newNumberOfRiser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfRiser() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_RISER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfRiser() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_RISER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfTreads() {
		return (Integer) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTreads(int newNumberOfTreads) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS, newNumberOfTreads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfTreads() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfTreads() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRiserHeight() {
		return (Double) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiserHeight(double newRiserHeight) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT, newRiserHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRiserHeight() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRiserHeight() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRiserHeightAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiserHeightAsString(String newRiserHeightAsString) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING, newRiserHeightAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRiserHeightAsString() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRiserHeightAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTreadLength() {
		return (Double) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreadLength(double newTreadLength) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH, newTreadLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreadLength() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreadLength() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTreadLengthAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreadLengthAsString(String newTreadLengthAsString) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING, newTreadLengthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreadLengthAsString() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreadLengthAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlightTypeEnum getPredefinedType() {
		return (IfcStairFlightTypeEnum) eGet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcStairFlightTypeEnum newPredefinedType) {
		eSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__PREDEFINED_TYPE, newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(Ifc4Package.Literals.IFC_STAIR_FLIGHT__PREDEFINED_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(Ifc4Package.Literals.IFC_STAIR_FLIGHT__PREDEFINED_TYPE);
	}

} //IfcStairFlightImpl
