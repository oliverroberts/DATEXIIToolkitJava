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


/**
 * Status of a VMS unit which may control one or more variable message signs on a single gantry or on different gantries.
 * 
 * <p>Java class for VmsUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}VmsSetting">
 *       &lt;sequence>
 *         &lt;element name="vmsUnitTableReference" type="{http://datex2.eu/schema/2/2_0}_VmsUnitTableVersionedReference"/>
 *         &lt;element name="vmsUnitReference" type="{http://datex2.eu/schema/2/2_0}_VmsUnitRecordVersionedReference"/>
 *         &lt;element name="vms" type="{http://datex2.eu/schema/2/2_0}_VmsUnitVmsIndexVms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsUnitFault" type="{http://datex2.eu/schema/2/2_0}VmsUnitFault" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsUnitExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsUnit", propOrder = {
    "vmsUnitTableReference",
    "vmsUnitReference",
    "vms",
    "vmsUnitFault",
    "vmsUnitExtension"
})
public class VmsUnit
    extends VmsSetting
{

    @XmlElement(required = true)
    protected VmsUnitTableVersionedReference vmsUnitTableReference;
    @XmlElement(required = true)
    protected VmsUnitRecordVersionedReference vmsUnitReference;
    protected List<VmsUnitVmsIndexVms> vms;
    protected List<VmsUnitFault> vmsUnitFault;
    protected ExtensionType vmsUnitExtension;

    /**
     * Gets the value of the vmsUnitTableReference property.
     * 
     * @return
     *     possible object is
     *     {@link VmsUnitTableVersionedReference }
     *     
     */
    public VmsUnitTableVersionedReference getVmsUnitTableReference() {
        return vmsUnitTableReference;
    }

    /**
     * Sets the value of the vmsUnitTableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsUnitTableVersionedReference }
     *     
     */
    public void setVmsUnitTableReference(VmsUnitTableVersionedReference value) {
        this.vmsUnitTableReference = value;
    }

    /**
     * Gets the value of the vmsUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link VmsUnitRecordVersionedReference }
     *     
     */
    public VmsUnitRecordVersionedReference getVmsUnitReference() {
        return vmsUnitReference;
    }

    /**
     * Sets the value of the vmsUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsUnitRecordVersionedReference }
     *     
     */
    public void setVmsUnitReference(VmsUnitRecordVersionedReference value) {
        this.vmsUnitReference = value;
    }

    /**
     * Gets the value of the vms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsUnitVmsIndexVms }
     * 
     * 
     */
    public List<VmsUnitVmsIndexVms> getVms() {
        if (vms == null) {
            vms = new ArrayList<VmsUnitVmsIndexVms>();
        }
        return this.vms;
    }

    /**
     * Gets the value of the vmsUnitFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsUnitFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsUnitFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsUnitFault }
     * 
     * 
     */
    public List<VmsUnitFault> getVmsUnitFault() {
        if (vmsUnitFault == null) {
            vmsUnitFault = new ArrayList<VmsUnitFault>();
        }
        return this.vmsUnitFault;
    }

    /**
     * Gets the value of the vmsUnitExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsUnitExtension() {
        return vmsUnitExtension;
    }

    /**
     * Sets the value of the vmsUnitExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsUnitExtension(ExtensionType value) {
        this.vmsUnitExtension = value;
    }

}
