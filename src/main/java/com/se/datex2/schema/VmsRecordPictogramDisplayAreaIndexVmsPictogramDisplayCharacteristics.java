//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsPictogramDisplayCharacteristics" type="{http://datex2.eu/schema/2/2_0}VmsPictogramDisplayCharacteristics"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pictogramDisplayAreaIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics", propOrder = {
    "vmsPictogramDisplayCharacteristics"
})
public class VmsRecordPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics {

    @XmlElement(required = true)
    protected VmsPictogramDisplayCharacteristics vmsPictogramDisplayCharacteristics;
    @XmlAttribute(name = "pictogramDisplayAreaIndex", required = true)
    protected int pictogramDisplayAreaIndex;

    /**
     * Gets the value of the vmsPictogramDisplayCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VmsPictogramDisplayCharacteristics }
     *     
     */
    public VmsPictogramDisplayCharacteristics getVmsPictogramDisplayCharacteristics() {
        return vmsPictogramDisplayCharacteristics;
    }

    /**
     * Sets the value of the vmsPictogramDisplayCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsPictogramDisplayCharacteristics }
     *     
     */
    public void setVmsPictogramDisplayCharacteristics(VmsPictogramDisplayCharacteristics value) {
        this.vmsPictogramDisplayCharacteristics = value;
    }

    /**
     * Gets the value of the pictogramDisplayAreaIndex property.
     * 
     */
    public int getPictogramDisplayAreaIndex() {
        return pictogramDisplayAreaIndex;
    }

    /**
     * Sets the value of the pictogramDisplayAreaIndex property.
     * 
     */
    public void setPictogramDisplayAreaIndex(int value) {
        this.pictogramDisplayAreaIndex = value;
    }

}
