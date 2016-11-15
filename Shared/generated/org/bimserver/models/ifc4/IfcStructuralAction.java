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
 * A representation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcStructuralAction()
 * @model
 * @generated
 */
public interface IfcStructuralAction extends IfcStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Destabilizing Load</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destabilizing Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destabilizing Load</em>' attribute.
	 * @see org.bimserver.models.ifc4.Tristate
	 * @see #isSetDestabilizingLoad()
	 * @see #unsetDestabilizingLoad()
	 * @see #setDestabilizingLoad(Tristate)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcStructuralAction_DestabilizingLoad()
	 * @model unsettable="true"
	 * @generated
	 */
	Tristate getDestabilizingLoad();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destabilizing Load</em>' attribute.
	 * @see org.bimserver.models.ifc4.Tristate
	 * @see #isSetDestabilizingLoad()
	 * @see #unsetDestabilizingLoad()
	 * @see #getDestabilizingLoad()
	 * @generated
	 */
	void setDestabilizingLoad(Tristate value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestabilizingLoad()
	 * @see #getDestabilizingLoad()
	 * @see #setDestabilizingLoad(Tristate)
	 * @generated
	 */
	void unsetDestabilizingLoad();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destabilizing Load</em>' attribute is set.
	 * @see #unsetDestabilizingLoad()
	 * @see #getDestabilizingLoad()
	 * @see #setDestabilizingLoad(Tristate)
	 * @generated
	 */
	boolean isSetDestabilizingLoad();

} // IfcStructuralAction
