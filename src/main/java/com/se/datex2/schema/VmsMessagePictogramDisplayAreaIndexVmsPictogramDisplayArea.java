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
 * <p>Java class for _VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsPictogramDisplayArea" type="{http://datex2.eu/schema/2/2_0}VmsPictogramDisplayArea"/>
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
@XmlType(name = "_VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea", propOrder = {
    "vmsPictogramDisplayArea"
})
public class VmsMessagePictogramDisplayAreaIndexVmsPictogramDisplayArea {

    @XmlElement(required = true)
    protected VmsPictogramDisplayArea vmsPictogramDisplayArea;
    @XmlAttribute(name = "pictogramDisplayAreaIndex", required = true)
    protected int pictogramDisplayAreaIndex;

    /**
     * Gets the value of the vmsPictogramDisplayArea property.
     * 
     * @return
     *     possible object is
     *     {@link VmsPictogramDisplayArea }
     *     
     */
    public VmsPictogramDisplayArea getVmsPictogramDisplayArea() {
        return vmsPictogramDisplayArea;
    }

    /**
     * Sets the value of the vmsPictogramDisplayArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsPictogramDisplayArea }
     *     
     */
    public void setVmsPictogramDisplayArea(VmsPictogramDisplayArea value) {
        this.vmsPictogramDisplayArea = value;
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
