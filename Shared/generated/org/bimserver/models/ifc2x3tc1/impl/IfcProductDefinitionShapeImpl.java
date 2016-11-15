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
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcProduct;
import org.bimserver.models.ifc2x3tc1.IfcProductDefinitionShape;
import org.bimserver.models.ifc2x3tc1.IfcShapeAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Product Definition Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcProductDefinitionShapeImpl#getShapeOfProduct <em>Shape Of Product</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcProductDefinitionShapeImpl#getHasShapeAspects <em>Has Shape Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProductDefinitionShapeImpl extends IfcProductRepresentationImpl implements IfcProductDefinitionShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductDefinitionShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProduct> getShapeOfProduct() {
		return (EList<IfcProduct>) eGet(Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShapeOfProduct() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShapeOfProduct() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE__SHAPE_OF_PRODUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcShapeAspect> getHasShapeAspects() {
		return (EList<IfcShapeAspect>) eGet(Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasShapeAspects() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasShapeAspects() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_PRODUCT_DEFINITION_SHAPE__HAS_SHAPE_ASPECTS);
	}

} //IfcProductDefinitionShapeImpl
