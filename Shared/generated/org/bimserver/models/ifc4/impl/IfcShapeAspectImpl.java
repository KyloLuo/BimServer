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

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcProductRepresentationSelect;
import org.bimserver.models.ifc4.IfcShapeAspect;
import org.bimserver.models.ifc4.IfcShapeModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcShapeAspectImpl#getShapeRepresentations <em>Shape Representations</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcShapeAspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcShapeAspectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcShapeAspectImpl#isProductDefinitional <em>Product Definitional</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcShapeAspectImpl#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShapeAspectImpl extends IdEObjectImpl implements IfcShapeAspect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShapeAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_SHAPE_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcShapeModel> getShapeRepresentations() {
		return (EList<IfcShapeModel>) eGet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(Ifc4Package.Literals.IFC_SHAPE_ASPECT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String) eGet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(Ifc4Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProductDefinitional() {
		return (Boolean) eGet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDefinitional(boolean newProductDefinitional) {
		eSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL, newProductDefinitional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentationSelect getPartOfProductDefinitionShape() {
		return (IfcProductRepresentationSelect) eGet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfProductDefinitionShape(IfcProductRepresentationSelect newPartOfProductDefinitionShape) {
		eSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, newPartOfProductDefinitionShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartOfProductDefinitionShape() {
		eUnset(Ifc4Package.Literals.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartOfProductDefinitionShape() {
		return eIsSet(Ifc4Package.Literals.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE);
	}

} //IfcShapeAspectImpl
