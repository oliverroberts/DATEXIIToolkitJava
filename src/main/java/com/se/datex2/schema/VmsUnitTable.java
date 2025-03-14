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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A versioned VMS Unit Table comprising a number of data records, each record defining the characteristics of a specific deployed variable message sign unit.
 * 
 * <p>Java class for VmsUnitTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsUnitTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsUnitTableIdentification" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="vmsUnitRecord" type="{http://datex2.eu/schema/2/2_0}VmsUnitRecord" maxOccurs="unbounded"/>
 *         &lt;element name="vmsUnitTableExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsUnitTable", propOrder = {
    "vmsUnitTableIdentification",
    "vmsUnitRecord",
    "vmsUnitTableExtension"
})
public class VmsUnitTable {

    protected String vmsUnitTableIdentification;
    @XmlElement(required = true)
    protected List<VmsUnitRecord> vmsUnitRecord;
    protected ExtensionType vmsUnitTableExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the vmsUnitTableIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsUnitTableIdentification() {
        return vmsUnitTableIdentification;
    }

    /**
     * Sets the value of the vmsUnitTableIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsUnitTableIdentification(String value) {
        this.vmsUnitTableIdentification = value;
    }

    /**
     * Gets the value of the vmsUnitRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsUnitRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsUnitRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsUnitRecord }
     * 
     * 
     */
    public List<VmsUnitRecord> getVmsUnitRecord() {
        if (vmsUnitRecord == null) {
            vmsUnitRecord = new ArrayList<VmsUnitRecord>();
        }
        return this.vmsUnitRecord;
    }

    /**
     * Gets the value of the vmsUnitTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsUnitTableExtension() {
        return vmsUnitTableExtension;
    }

    /**
     * Sets the value of the vmsUnitTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsUnitTableExtension(ExtensionType value) {
        this.vmsUnitTableExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
