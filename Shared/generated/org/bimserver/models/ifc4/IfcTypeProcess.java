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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Type Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcTypeProcess#getIdentification <em>Identification</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTypeProcess#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTypeProcess#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTypeProcess#getOperatesOn <em>Operates On</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTypeProcess()
 * @model
 * @generated
 */
public interface IfcTypeProcess extends IfcTypeObject, IfcProcessSelect {
	/**
	 * Returns the value of the '<em><b>Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' attribute.
	 * @see #isSetIdentification()
	 * @see #unsetIdentification()
	 * @see #setIdentification(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTypeProcess_Identification()
	 * @model unsettable="true"
	 * @generated
	 */
	String getIdentification();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getIdentification <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' attribute.
	 * @see #isSetIdentification()
	 * @see #unsetIdentification()
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getIdentification <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentification()
	 * @see #getIdentification()
	 * @see #setIdentification(String)
	 * @generated
	 */
	void unsetIdentification();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getIdentification <em>Identification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identification</em>' attribute is set.
	 * @see #unsetIdentification()
	 * @see #getIdentification()
	 * @see #setIdentification(String)
	 * @generated
	 */
	boolean isSetIdentification();

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #isSetLongDescription()
	 * @see #unsetLongDescription()
	 * @see #setLongDescription(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTypeProcess_LongDescription()
	 * @model unsettable="true"
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #isSetLongDescription()
	 * @see #unsetLongDescription()
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongDescription()
	 * @see #getLongDescription()
	 * @see #setLongDescription(String)
	 * @generated
	 */
	void unsetLongDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getLongDescription <em>Long Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Long Description</em>' attribute is set.
	 * @see #unsetLongDescription()
	 * @see #getLongDescription()
	 * @see #setLongDescription(String)
	 * @generated
	 */
	boolean isSetLongDescription();

	/**
	 * Returns the value of the '<em><b>Process Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Type</em>' attribute.
	 * @see #isSetProcessType()
	 * @see #unsetProcessType()
	 * @see #setProcessType(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTypeProcess_ProcessType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getProcessType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getProcessType <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Type</em>' attribute.
	 * @see #isSetProcessType()
	 * @see #unsetProcessType()
	 * @see #getProcessType()
	 * @generated
	 */
	void setProcessType(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getProcessType <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessType()
	 * @see #getProcessType()
	 * @see #setProcessType(String)
	 * @generated
	 */
	void unsetProcessType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getProcessType <em>Process Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Type</em>' attribute is set.
	 * @see #unsetProcessType()
	 * @see #getProcessType()
	 * @see #setProcessType(String)
	 * @generated
	 */
	boolean isSetProcessType();

	/**
	 * Returns the value of the '<em><b>Operates On</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc4.IfcRelAssignsToProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operates On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates On</em>' reference list.
	 * @see #isSetOperatesOn()
	 * @see #unsetOperatesOn()
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTypeProcess_OperatesOn()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssignsToProcess> getOperatesOn();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getOperatesOn <em>Operates On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperatesOn()
	 * @see #getOperatesOn()
	 * @generated
	 */
	void unsetOperatesOn();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTypeProcess#getOperatesOn <em>Operates On</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operates On</em>' reference list is set.
	 * @see #unsetOperatesOn()
	 * @see #getOperatesOn()
	 * @generated
	 */
	boolean isSetOperatesOn();

} // IfcTypeProcess
