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
 * Provides information on message signs and the information currently displayed.
 * 
 * <p>Java class for SignSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="vmsSetting" type="{http://datex2.eu/schema/2/2_0}VmsSetting"/>
 *         &lt;element name="signSettingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignSetting", propOrder = {
    "vmsSetting",
    "signSettingExtension"
})
public class SignSetting
    extends OperatorAction
{

    @XmlElement(required = true)
    protected VmsSetting vmsSetting;
    protected ExtensionType signSettingExtension;

    /**
     * Gets the value of the vmsSetting property.
     * 
     * @return
     *     possible object is
     *     {@link VmsSetting }
     *     
     */
    public VmsSetting getVmsSetting() {
        return vmsSetting;
    }

    /**
     * Sets the value of the vmsSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsSetting }
     *     
     */
    public void setVmsSetting(VmsSetting value) {
        this.vmsSetting = value;
    }

    /**
     * Gets the value of the signSettingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Sets the value of the signSettingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSignSettingExtension(ExtensionType value) {
        this.signSettingExtension = value;
    }

}
