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
 * A representation of the model object '<em><b>Ifc Rel Associates Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcRelAssociatesConstraint#getRelatingConstraint <em>Relating Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssociatesConstraint()
 * @model
 * @generated
 */
public interface IfcRelAssociatesConstraint extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' attribute.
	 * @see #isSetIntent()
	 * @see #unsetIntent()
	 * @see #setIntent(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssociatesConstraint_Intent()
	 * @model unsettable="true"
	 * @generated
	 */
	String getIntent();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' attribute.
	 * @see #isSetIntent()
	 * @see #unsetIntent()
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntent()
	 * @see #getIntent()
	 * @see #setIntent(String)
	 * @generated
	 */
	void unsetIntent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intent</em>' attribute is set.
	 * @see #unsetIntent()
	 * @see #getIntent()
	 * @see #setIntent(String)
	 * @generated
	 */
	boolean isSetIntent();

	/**
	 * Returns the value of the '<em><b>Relating Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Constraint</em>' reference.
	 * @see #setRelatingConstraint(IfcConstraint)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcRelAssociatesConstraint_RelatingConstraint()
	 * @model
	 * @generated
	 */
	IfcConstraint getRelatingConstraint();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcRelAssociatesConstraint#getRelatingConstraint <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Constraint</em>' reference.
	 * @see #getRelatingConstraint()
	 * @generated
	 */
	void setRelatingConstraint(IfcConstraint value);

} // IfcRelAssociatesConstraint
