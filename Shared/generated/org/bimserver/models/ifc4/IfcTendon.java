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
 * A representation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameterAsString <em>Nominal Diameter As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getTensionForceAsString <em>Tension Force As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getPreStressAsString <em>Pre Stress As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficientAsString <em>Friction Coefficient As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlipAsString <em>Anchorage Slip As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadiusAsString <em>Min Curvature Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon()
 * @model
 * @generated
 */
public interface IfcTendon extends IfcReinforcingElement {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4.IfcTendonTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcTendonTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_PredefinedType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTendonTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4.IfcTendonTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcTendonTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

	/**
	 * Returns the value of the '<em><b>Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #setNominalDiameter(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_NominalDiameter()
	 * @model unsettable="true"
	 * @generated
	 */
	double getNominalDiameter();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @generated
	 */
	void setNominalDiameter(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(double)
	 * @generated
	 */
	void unsetNominalDiameter();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter</em>' attribute is set.
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(double)
	 * @generated
	 */
	boolean isSetNominalDiameter();

	/**
	 * Returns the value of the '<em><b>Nominal Diameter As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter As String</em>' attribute.
	 * @see #isSetNominalDiameterAsString()
	 * @see #unsetNominalDiameterAsString()
	 * @see #setNominalDiameterAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_NominalDiameterAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getNominalDiameterAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameterAsString <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter As String</em>' attribute.
	 * @see #isSetNominalDiameterAsString()
	 * @see #unsetNominalDiameterAsString()
	 * @see #getNominalDiameterAsString()
	 * @generated
	 */
	void setNominalDiameterAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameterAsString <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameterAsString()
	 * @see #getNominalDiameterAsString()
	 * @see #setNominalDiameterAsString(String)
	 * @generated
	 */
	void unsetNominalDiameterAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getNominalDiameterAsString <em>Nominal Diameter As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter As String</em>' attribute is set.
	 * @see #unsetNominalDiameterAsString()
	 * @see #getNominalDiameterAsString()
	 * @see #setNominalDiameterAsString(String)
	 * @generated
	 */
	boolean isSetNominalDiameterAsString();

	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #setCrossSectionArea(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_CrossSectionArea()
	 * @model unsettable="true"
	 * @generated
	 */
	double getCrossSectionArea();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(double)
	 * @generated
	 */
	void unsetCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cross Section Area</em>' attribute is set.
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(double)
	 * @generated
	 */
	boolean isSetCrossSectionArea();

	/**
	 * Returns the value of the '<em><b>Cross Section Area As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area As String</em>' attribute.
	 * @see #isSetCrossSectionAreaAsString()
	 * @see #unsetCrossSectionAreaAsString()
	 * @see #setCrossSectionAreaAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_CrossSectionAreaAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCrossSectionAreaAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area As String</em>' attribute.
	 * @see #isSetCrossSectionAreaAsString()
	 * @see #unsetCrossSectionAreaAsString()
	 * @see #getCrossSectionAreaAsString()
	 * @generated
	 */
	void setCrossSectionAreaAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossSectionAreaAsString()
	 * @see #getCrossSectionAreaAsString()
	 * @see #setCrossSectionAreaAsString(String)
	 * @generated
	 */
	void unsetCrossSectionAreaAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cross Section Area As String</em>' attribute is set.
	 * @see #unsetCrossSectionAreaAsString()
	 * @see #getCrossSectionAreaAsString()
	 * @see #setCrossSectionAreaAsString(String)
	 * @generated
	 */
	boolean isSetCrossSectionAreaAsString();

	/**
	 * Returns the value of the '<em><b>Tension Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Force</em>' attribute.
	 * @see #isSetTensionForce()
	 * @see #unsetTensionForce()
	 * @see #setTensionForce(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_TensionForce()
	 * @model unsettable="true"
	 * @generated
	 */
	double getTensionForce();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getTensionForce <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Force</em>' attribute.
	 * @see #isSetTensionForce()
	 * @see #unsetTensionForce()
	 * @see #getTensionForce()
	 * @generated
	 */
	void setTensionForce(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getTensionForce <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionForce()
	 * @see #getTensionForce()
	 * @see #setTensionForce(double)
	 * @generated
	 */
	void unsetTensionForce();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getTensionForce <em>Tension Force</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Force</em>' attribute is set.
	 * @see #unsetTensionForce()
	 * @see #getTensionForce()
	 * @see #setTensionForce(double)
	 * @generated
	 */
	boolean isSetTensionForce();

	/**
	 * Returns the value of the '<em><b>Tension Force As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Force As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Force As String</em>' attribute.
	 * @see #isSetTensionForceAsString()
	 * @see #unsetTensionForceAsString()
	 * @see #setTensionForceAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_TensionForceAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTensionForceAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getTensionForceAsString <em>Tension Force As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Force As String</em>' attribute.
	 * @see #isSetTensionForceAsString()
	 * @see #unsetTensionForceAsString()
	 * @see #getTensionForceAsString()
	 * @generated
	 */
	void setTensionForceAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getTensionForceAsString <em>Tension Force As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionForceAsString()
	 * @see #getTensionForceAsString()
	 * @see #setTensionForceAsString(String)
	 * @generated
	 */
	void unsetTensionForceAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getTensionForceAsString <em>Tension Force As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Force As String</em>' attribute is set.
	 * @see #unsetTensionForceAsString()
	 * @see #getTensionForceAsString()
	 * @see #setTensionForceAsString(String)
	 * @generated
	 */
	boolean isSetTensionForceAsString();

	/**
	 * Returns the value of the '<em><b>Pre Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Stress</em>' attribute.
	 * @see #isSetPreStress()
	 * @see #unsetPreStress()
	 * @see #setPreStress(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_PreStress()
	 * @model unsettable="true"
	 * @generated
	 */
	double getPreStress();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPreStress <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Stress</em>' attribute.
	 * @see #isSetPreStress()
	 * @see #unsetPreStress()
	 * @see #getPreStress()
	 * @generated
	 */
	void setPreStress(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPreStress <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreStress()
	 * @see #getPreStress()
	 * @see #setPreStress(double)
	 * @generated
	 */
	void unsetPreStress();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPreStress <em>Pre Stress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Stress</em>' attribute is set.
	 * @see #unsetPreStress()
	 * @see #getPreStress()
	 * @see #setPreStress(double)
	 * @generated
	 */
	boolean isSetPreStress();

	/**
	 * Returns the value of the '<em><b>Pre Stress As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Stress As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Stress As String</em>' attribute.
	 * @see #isSetPreStressAsString()
	 * @see #unsetPreStressAsString()
	 * @see #setPreStressAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_PreStressAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPreStressAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPreStressAsString <em>Pre Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Stress As String</em>' attribute.
	 * @see #isSetPreStressAsString()
	 * @see #unsetPreStressAsString()
	 * @see #getPreStressAsString()
	 * @generated
	 */
	void setPreStressAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPreStressAsString <em>Pre Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreStressAsString()
	 * @see #getPreStressAsString()
	 * @see #setPreStressAsString(String)
	 * @generated
	 */
	void unsetPreStressAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getPreStressAsString <em>Pre Stress As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Stress As String</em>' attribute is set.
	 * @see #unsetPreStressAsString()
	 * @see #getPreStressAsString()
	 * @see #setPreStressAsString(String)
	 * @generated
	 */
	boolean isSetPreStressAsString();

	/**
	 * Returns the value of the '<em><b>Friction Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction Coefficient</em>' attribute.
	 * @see #isSetFrictionCoefficient()
	 * @see #unsetFrictionCoefficient()
	 * @see #setFrictionCoefficient(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_FrictionCoefficient()
	 * @model unsettable="true"
	 * @generated
	 */
	double getFrictionCoefficient();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction Coefficient</em>' attribute.
	 * @see #isSetFrictionCoefficient()
	 * @see #unsetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @generated
	 */
	void setFrictionCoefficient(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @see #setFrictionCoefficient(double)
	 * @generated
	 */
	void unsetFrictionCoefficient();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Friction Coefficient</em>' attribute is set.
	 * @see #unsetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @see #setFrictionCoefficient(double)
	 * @generated
	 */
	boolean isSetFrictionCoefficient();

	/**
	 * Returns the value of the '<em><b>Friction Coefficient As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction Coefficient As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction Coefficient As String</em>' attribute.
	 * @see #isSetFrictionCoefficientAsString()
	 * @see #unsetFrictionCoefficientAsString()
	 * @see #setFrictionCoefficientAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_FrictionCoefficientAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFrictionCoefficientAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficientAsString <em>Friction Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction Coefficient As String</em>' attribute.
	 * @see #isSetFrictionCoefficientAsString()
	 * @see #unsetFrictionCoefficientAsString()
	 * @see #getFrictionCoefficientAsString()
	 * @generated
	 */
	void setFrictionCoefficientAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficientAsString <em>Friction Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrictionCoefficientAsString()
	 * @see #getFrictionCoefficientAsString()
	 * @see #setFrictionCoefficientAsString(String)
	 * @generated
	 */
	void unsetFrictionCoefficientAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getFrictionCoefficientAsString <em>Friction Coefficient As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Friction Coefficient As String</em>' attribute is set.
	 * @see #unsetFrictionCoefficientAsString()
	 * @see #getFrictionCoefficientAsString()
	 * @see #setFrictionCoefficientAsString(String)
	 * @generated
	 */
	boolean isSetFrictionCoefficientAsString();

	/**
	 * Returns the value of the '<em><b>Anchorage Slip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchorage Slip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchorage Slip</em>' attribute.
	 * @see #isSetAnchorageSlip()
	 * @see #unsetAnchorageSlip()
	 * @see #setAnchorageSlip(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_AnchorageSlip()
	 * @model unsettable="true"
	 * @generated
	 */
	double getAnchorageSlip();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchorage Slip</em>' attribute.
	 * @see #isSetAnchorageSlip()
	 * @see #unsetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @generated
	 */
	void setAnchorageSlip(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @see #setAnchorageSlip(double)
	 * @generated
	 */
	void unsetAnchorageSlip();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchorage Slip</em>' attribute is set.
	 * @see #unsetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @see #setAnchorageSlip(double)
	 * @generated
	 */
	boolean isSetAnchorageSlip();

	/**
	 * Returns the value of the '<em><b>Anchorage Slip As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchorage Slip As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchorage Slip As String</em>' attribute.
	 * @see #isSetAnchorageSlipAsString()
	 * @see #unsetAnchorageSlipAsString()
	 * @see #setAnchorageSlipAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_AnchorageSlipAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getAnchorageSlipAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlipAsString <em>Anchorage Slip As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchorage Slip As String</em>' attribute.
	 * @see #isSetAnchorageSlipAsString()
	 * @see #unsetAnchorageSlipAsString()
	 * @see #getAnchorageSlipAsString()
	 * @generated
	 */
	void setAnchorageSlipAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlipAsString <em>Anchorage Slip As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorageSlipAsString()
	 * @see #getAnchorageSlipAsString()
	 * @see #setAnchorageSlipAsString(String)
	 * @generated
	 */
	void unsetAnchorageSlipAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getAnchorageSlipAsString <em>Anchorage Slip As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchorage Slip As String</em>' attribute is set.
	 * @see #unsetAnchorageSlipAsString()
	 * @see #getAnchorageSlipAsString()
	 * @see #setAnchorageSlipAsString(String)
	 * @generated
	 */
	boolean isSetAnchorageSlipAsString();

	/**
	 * Returns the value of the '<em><b>Min Curvature Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Curvature Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Curvature Radius</em>' attribute.
	 * @see #isSetMinCurvatureRadius()
	 * @see #unsetMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(double)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_MinCurvatureRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	double getMinCurvatureRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Curvature Radius</em>' attribute.
	 * @see #isSetMinCurvatureRadius()
	 * @see #unsetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @generated
	 */
	void setMinCurvatureRadius(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(double)
	 * @generated
	 */
	void unsetMinCurvatureRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Curvature Radius</em>' attribute is set.
	 * @see #unsetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(double)
	 * @generated
	 */
	boolean isSetMinCurvatureRadius();

	/**
	 * Returns the value of the '<em><b>Min Curvature Radius As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Curvature Radius As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Curvature Radius As String</em>' attribute.
	 * @see #isSetMinCurvatureRadiusAsString()
	 * @see #unsetMinCurvatureRadiusAsString()
	 * @see #setMinCurvatureRadiusAsString(String)
	 * @see org.bimserver.models.ifc4.Ifc4Package#getIfcTendon_MinCurvatureRadiusAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMinCurvatureRadiusAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadiusAsString <em>Min Curvature Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Curvature Radius As String</em>' attribute.
	 * @see #isSetMinCurvatureRadiusAsString()
	 * @see #unsetMinCurvatureRadiusAsString()
	 * @see #getMinCurvatureRadiusAsString()
	 * @generated
	 */
	void setMinCurvatureRadiusAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadiusAsString <em>Min Curvature Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinCurvatureRadiusAsString()
	 * @see #getMinCurvatureRadiusAsString()
	 * @see #setMinCurvatureRadiusAsString(String)
	 * @generated
	 */
	void unsetMinCurvatureRadiusAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4.IfcTendon#getMinCurvatureRadiusAsString <em>Min Curvature Radius As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Curvature Radius As String</em>' attribute is set.
	 * @see #unsetMinCurvatureRadiusAsString()
	 * @see #getMinCurvatureRadiusAsString()
	 * @see #setMinCurvatureRadiusAsString(String)
	 * @generated
	 */
	boolean isSetMinCurvatureRadiusAsString();

} // IfcTendon
