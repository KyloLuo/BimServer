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
import org.bimserver.models.ifc4.IfcSizeSelect;
import org.bimserver.models.ifc4.IfcTextStyleFontModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTextStyleFontModelImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTextStyleFontModelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTextStyleFontModelImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTextStyleFontModelImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTextStyleFontModelImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleFontModelImpl extends IfcPreDefinedTextFontImpl implements IfcTextStyleFontModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleFontModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getFontFamily() {
		return (EList<String>) eGet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_FAMILY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return (String) eGet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		eSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE, newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyle() {
		eUnset(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyle() {
		return eIsSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontVariant() {
		return (String) eGet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontVariant(String newFontVariant) {
		eSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT, newFontVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontVariant() {
		eUnset(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontVariant() {
		return eIsSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return (String) eGet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		eSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT, newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeight() {
		eUnset(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeight() {
		return eIsSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_WEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getFontSize() {
		return (IfcSizeSelect) eGet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(IfcSizeSelect newFontSize) {
		eSet(Ifc4Package.Literals.IFC_TEXT_STYLE_FONT_MODEL__FONT_SIZE, newFontSize);
	}

} //IfcTextStyleFontModelImpl
