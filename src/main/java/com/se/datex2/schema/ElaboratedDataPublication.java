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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A publication containing one or more elaborated data sets.
 * 
 * <p>Java class for ElaboratedDataPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedDataPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="forecastDefault" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="periodDefault" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="timeDefault" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation"/>
 *         &lt;element name="referenceSettings" type="{http://datex2.eu/schema/2/2_0}ReferenceSettings" minOccurs="0"/>
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2/2_0}ElaboratedData" maxOccurs="unbounded"/>
 *         &lt;element name="elaboratedDataPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedDataPublication", propOrder = {
    "forecastDefault",
    "periodDefault",
    "timeDefault",
    "headerInformation",
    "referenceSettings",
    "elaboratedData",
    "elaboratedDataPublicationExtension"
})
public class ElaboratedDataPublication
    extends PayloadPublication
{

    protected Boolean forecastDefault;
    protected Float periodDefault;
    protected XMLGregorianCalendar timeDefault;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    protected ReferenceSettings referenceSettings;
    @XmlElement(required = true)
    protected List<ElaboratedData> elaboratedData;
    protected ExtensionType elaboratedDataPublicationExtension;

    /**
     * Gets the value of the forecastDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastDefault() {
        return forecastDefault;
    }

    /**
     * Sets the value of the forecastDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastDefault(Boolean value) {
        this.forecastDefault = value;
    }

    /**
     * Gets the value of the periodDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriodDefault() {
        return periodDefault;
    }

    /**
     * Sets the value of the periodDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriodDefault(Float value) {
        this.periodDefault = value;
    }

    /**
     * Gets the value of the timeDefault property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDefault() {
        return timeDefault;
    }

    /**
     * Sets the value of the timeDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDefault(XMLGregorianCalendar value) {
        this.timeDefault = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the referenceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSettings }
     *     
     */
    public ReferenceSettings getReferenceSettings() {
        return referenceSettings;
    }

    /**
     * Sets the value of the referenceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSettings }
     *     
     */
    public void setReferenceSettings(ReferenceSettings value) {
        this.referenceSettings = value;
    }

    /**
     * Gets the value of the elaboratedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elaboratedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElaboratedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElaboratedData }
     * 
     * 
     */
    public List<ElaboratedData> getElaboratedData() {
        if (elaboratedData == null) {
            elaboratedData = new ArrayList<ElaboratedData>();
        }
        return this.elaboratedData;
    }

    /**
     * Gets the value of the elaboratedDataPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataPublicationExtension() {
        return elaboratedDataPublicationExtension;
    }

    /**
     * Sets the value of the elaboratedDataPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataPublicationExtension(ExtensionType value) {
        this.elaboratedDataPublicationExtension = value;
    }

}
