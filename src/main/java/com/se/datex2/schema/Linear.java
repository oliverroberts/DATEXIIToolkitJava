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
 * A linear section along a single road with optional directionality defined between two points on the same road. 
 * 
 * <p>Java class for Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2/2_0}TpegLinearLocation" minOccurs="0"/>
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2/2_0}AlertCLinear" minOccurs="0"/>
 *         &lt;element name="linearWithinLinearElement" type="{http://datex2.eu/schema/2/2_0}LinearWithinLinearElement" minOccurs="0"/>
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "linearWithinLinearElement",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
{

    protected TpegLinearLocation tpegLinearLocation;
    protected AlertCLinear alertCLinear;
    protected LinearWithinLinearElement linearWithinLinearElement;
    protected ExtensionType linearExtension;

    /**
     * Gets the value of the tpegLinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Sets the value of the tpegLinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Gets the value of the alertCLinear property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Sets the value of the alertCLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Gets the value of the linearWithinLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearWithinLinearElement }
     *     
     */
    public LinearWithinLinearElement getLinearWithinLinearElement() {
        return linearWithinLinearElement;
    }

    /**
     * Sets the value of the linearWithinLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearWithinLinearElement }
     *     
     */
    public void setLinearWithinLinearElement(LinearWithinLinearElement value) {
        this.linearWithinLinearElement = value;
    }

    /**
     * Gets the value of the linearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Sets the value of the linearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

}
