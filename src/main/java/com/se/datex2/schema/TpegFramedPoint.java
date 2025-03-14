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
 * A point on the road network which is framed between two other points on the same road.
 * 
 * <p>Java class for TpegFramedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegFramedPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegFramedPointLocationType" type="{http://datex2.eu/schema/2/2_0}TpegLoc01FramedPointLocationSubtypeEnum"/>
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/2/2_0}TpegNonJunctionPoint"/>
 *         &lt;element name="to" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/>
 *         &lt;element name="from" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/>
 *         &lt;element name="tpegFramedPointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegFramedPoint", propOrder = {
    "tpegFramedPointLocationType",
    "framedPoint",
    "to",
    "from",
    "tpegFramedPointExtension"
})
public class TpegFramedPoint
    extends TpegPointLocation
{

    @XmlElement(required = true)
    protected TpegLoc01FramedPointLocationSubtypeEnum tpegFramedPointLocationType;
    @XmlElement(required = true)
    protected TpegNonJunctionPoint framedPoint;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    protected ExtensionType tpegFramedPointExtension;

    /**
     * Gets the value of the tpegFramedPointLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01FramedPointLocationSubtypeEnum getTpegFramedPointLocationType() {
        return tpegFramedPointLocationType;
    }

    /**
     * Sets the value of the tpegFramedPointLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegFramedPointLocationType = value;
    }

    /**
     * Gets the value of the framedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public TpegNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Sets the value of the framedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public void setFramedPoint(TpegNonJunctionPoint value) {
        this.framedPoint = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the tpegFramedPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegFramedPointExtension() {
        return tpegFramedPointExtension;
    }

    /**
     * Sets the value of the tpegFramedPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegFramedPointExtension(ExtensionType value) {
        this.tpegFramedPointExtension = value;
    }

}
