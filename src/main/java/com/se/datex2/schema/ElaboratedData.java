//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An instance of data which is derived/computed from one or more measurements over a period of time. It may be a current value or a forecast value predicted from historical measurements.
 * 
 * <p>Java class for ElaboratedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forecast" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="source" type="{http://datex2.eu/schema/2/2_0}Source" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://datex2.eu/schema/2/2_0}Validity" minOccurs="0"/>
 *         &lt;element name="elaboratedDataFault" type="{http://datex2.eu/schema/2/2_0}ElaboratedDataFault" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basicData" type="{http://datex2.eu/schema/2/2_0}BasicData" minOccurs="0"/>
 *         &lt;element name="elaboratedDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedData", propOrder = {
    "forecast",
    "source",
    "validity",
    "elaboratedDataFault",
    "basicData",
    "elaboratedDataExtension"
})
public class ElaboratedData {

    protected Boolean forecast;
    protected Source source;
    protected Validity validity;
    protected List<ElaboratedDataFault> elaboratedDataFault;
    protected BasicData basicData;
    protected ExtensionType elaboratedDataExtension;

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecast(Boolean value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Gets the value of the elaboratedDataFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elaboratedDataFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElaboratedDataFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElaboratedDataFault }
     * 
     * 
     */
    public List<ElaboratedDataFault> getElaboratedDataFault() {
        if (elaboratedDataFault == null) {
            elaboratedDataFault = new ArrayList<ElaboratedDataFault>();
        }
        return this.elaboratedDataFault;
    }

    /**
     * Gets the value of the basicData property.
     * 
     * @return
     *     possible object is
     *     {@link BasicData }
     *     
     */
    public BasicData getBasicData() {
        return basicData;
    }

    /**
     * Sets the value of the basicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData }
     *     
     */
    public void setBasicData(BasicData value) {
        this.basicData = value;
    }

    /**
     * Gets the value of the elaboratedDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataExtension() {
        return elaboratedDataExtension;
    }

    /**
     * Sets the value of the elaboratedDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataExtension(ExtensionType value) {
        this.elaboratedDataExtension = value;
    }

}
