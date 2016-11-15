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
 * A representation of the model object '<em><b>Ifc Texture Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcTextureCoordinate#getMaps <em>Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTextureCoordinate()
 * @model
 * @generated
 */
public interface IfcTextureCoordinate extends IfcPresentationItem {
	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc4.IfcSurfaceTexture}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc4.IfcSurfaceTexture#getIsMappedBy <em>Is Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference list.
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTextureCoordinate_Maps()
	 * @see org.bimserver.models.ifc4.IfcSurfaceTexture#getIsMappedBy
	 * @model opposite="IsMappedBy"
	 * @generated
	 */
	EList<IfcSurfaceTexture> getMaps();

} // IfcTextureCoordinate
