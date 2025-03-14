//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A single point on the road network defined by reference to a point in a pre-defined ALERT-C location table and which has an associated direction of traffic flow.
 * 
 * <p>Java class for AlertCMethod2Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2Point">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}AlertCPoint">
 *       &lt;sequence>
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2/2_0}AlertCDirection"/>
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/2/2_0}AlertCMethod2PrimaryPointLocation"/>
 *         &lt;element name="alertCMethod2PointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Point", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "alertCMethod2PointExtension"
})
public class AlertCMethod2Point
    extends AlertCPoint
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    protected ExtensionType alertCMethod2PointExtension;

    /**
     * Gets the value of the alertCDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirection }
     *     
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Sets the value of the alertCDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirection }
     *     
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    /**
     * Gets the value of the alertCMethod2PrimaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
        return alertCMethod2PrimaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod2PrimaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        this.alertCMethod2PrimaryPointLocation = value;
    }

    /**
     * Gets the value of the alertCMethod2PointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod2PointExtension() {
        return alertCMethod2PointExtension;
    }

    /**
     * Sets the value of the alertCMethod2PointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod2PointExtension(ExtensionType value) {
        this.alertCMethod2PointExtension = value;
    }

}
