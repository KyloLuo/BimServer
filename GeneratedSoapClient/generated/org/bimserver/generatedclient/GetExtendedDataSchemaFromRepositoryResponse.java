
package org.bimserver.generatedclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExtendedDataSchemaFromRepositoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExtendedDataSchemaFromRepositoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{org.bimserver}sExtendedDataSchema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExtendedDataSchemaFromRepositoryResponse", propOrder = {
    "_return"
})
public class GetExtendedDataSchemaFromRepositoryResponse {

    @XmlElement(name = "return")
    protected SExtendedDataSchema _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SExtendedDataSchema }
     *     
     */
    public SExtendedDataSchema getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SExtendedDataSchema }
     *     
     */
    public void setReturn(SExtendedDataSchema value) {
        this._return = value;
    }

}
