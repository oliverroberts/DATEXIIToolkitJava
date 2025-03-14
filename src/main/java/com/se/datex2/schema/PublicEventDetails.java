//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional details of a Public Event.
 * 
 * <p>Java class for PublicEventDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicEventDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicEventName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="situationParent" type="{http://datex2.eu/schema/2/2_0}SituationParent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicEventDetails", propOrder = {
    "publicEventName",
    "situationParent"
})
public class PublicEventDetails {

    protected String publicEventName;
    protected SituationParent situationParent;

    /**
     * Gets the value of the publicEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicEventName() {
        return publicEventName;
    }

    /**
     * Sets the value of the publicEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicEventName(String value) {
        this.publicEventName = value;
    }

    /**
     * Gets the value of the situationParent property.
     * 
     * @return
     *     possible object is
     *     {@link SituationParent }
     *     
     */
    public SituationParent getSituationParent() {
        return situationParent;
    }

    /**
     * Sets the value of the situationParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationParent }
     *     
     */
    public void setSituationParent(SituationParent value) {
        this.situationParent = value;
    }

}
