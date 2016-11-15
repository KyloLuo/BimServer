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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Profile Set Usage Tapering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcMaterialProfileSetUsageTapering#getForProfileEndSet <em>For Profile End Set</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcMaterialProfileSetUsageTapering#getCardinalEndPoint <em>Cardinal End Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcMaterialProfileSetUsageTapering()
 * @model
 * @generated
 */
public interface IfcMaterialProfileSetUsageTapering extends IfcMaterialProfileSetUsage {
	/**
	 * Returns the value of the '<em><b>For Profile End Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Profile End Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Profile End Set</em>' reference.
	 * @see #setForProfileEndSet(IfcMaterialProfileSet)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcMaterialProfileSetUsageTapering_ForProfileEndSet()
	 * @model
	 * @generated
	 */
	IfcMaterialProfileSet getForProfileEndSet();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcMaterialProfileSetUsageTapering#getForProfileEndSet <em>For Profile End Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Profile End Set</em>' reference.
	 * @see #getForProfileEndSet()
	 * @generated
	 */
	void setForProfileEndSet(IfcMaterialProfileSet value);

	/**
	 * Returns the value of the '<em><b>Cardinal End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinal End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinal End Point</em>' attribute.
	 * @see #isSetCardinalEndPoint()
	 * @see #unsetCardinalEndPoint()
	 * @see #setCardinalEndPoint(int)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcMaterialProfileSetUsageTapering_CardinalEndPoint()
	 * @model unsettable="true"
	 * @generated
	 */
	int getCardinalEndPoint();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcMaterialProfileSetUsageTapering#getCardinalEndPoint <em>Cardinal End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinal End Point</em>' attribute.
	 * @see #isSetCardinalEndPoint()
	 * @see #unsetCardinalEndPoint()
	 * @see #getCardinalEndPoint()
	 * @generated
	 */
	void setCardinalEndPoint(int value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcMaterialProfileSetUsageTapering#getCardinalEndPoint <em>Cardinal End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCardinalEndPoint()
	 * @see #getCardinalEndPoint()
	 * @see #setCardinalEndPoint(int)
	 * @generated
	 */
	void unsetCardinalEndPoint();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcMaterialProfileSetUsageTapering#getCardinalEndPoint <em>Cardinal End Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cardinal End Point</em>' attribute is set.
	 * @see #unsetCardinalEndPoint()
	 * @see #getCardinalEndPoint()
	 * @see #setCardinalEndPoint(int)
	 * @generated
	 */
	boolean isSetCardinalEndPoint();

} // IfcMaterialProfileSetUsageTapering
