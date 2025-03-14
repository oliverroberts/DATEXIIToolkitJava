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
 * Rerouting management action that is issued by the network/road operator.
 * 
 * <p>Java class for ReroutingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReroutingManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="reroutingManagementType" type="{http://datex2.eu/schema/2/2_0}ReroutingManagementTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="reroutingItineraryDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="signedRerouting" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="entry" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="exit" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="roadOrJunctionNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="alternativeRoute" type="{http://datex2.eu/schema/2/2_0}Itinerary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reroutingManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReroutingManagement", propOrder = {
    "reroutingManagementType",
    "reroutingItineraryDescription",
    "signedRerouting",
    "entry",
    "exit",
    "roadOrJunctionNumber",
    "alternativeRoute",
    "reroutingManagementExtension"
})
public class ReroutingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected List<ReroutingManagementTypeEnum> reroutingManagementType;
    protected MultilingualString reroutingItineraryDescription;
    protected Boolean signedRerouting;
    protected String entry;
    protected String exit;
    protected String roadOrJunctionNumber;
    protected List<Itinerary> alternativeRoute;
    protected ExtensionType reroutingManagementExtension;

    /**
     * Gets the value of the reroutingManagementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reroutingManagementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReroutingManagementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReroutingManagementTypeEnum }
     * 
     * 
     */
    public List<ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<ReroutingManagementTypeEnum>();
        }
        return this.reroutingManagementType;
    }

    /**
     * Gets the value of the reroutingItineraryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReroutingItineraryDescription() {
        return reroutingItineraryDescription;
    }

    /**
     * Sets the value of the reroutingItineraryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReroutingItineraryDescription(MultilingualString value) {
        this.reroutingItineraryDescription = value;
    }

    /**
     * Gets the value of the signedRerouting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignedRerouting() {
        return signedRerouting;
    }

    /**
     * Sets the value of the signedRerouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignedRerouting(Boolean value) {
        this.signedRerouting = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntry(String value) {
        this.entry = value;
    }

    /**
     * Gets the value of the exit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExit() {
        return exit;
    }

    /**
     * Sets the value of the exit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExit(String value) {
        this.exit = value;
    }

    /**
     * Gets the value of the roadOrJunctionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadOrJunctionNumber() {
        return roadOrJunctionNumber;
    }

    /**
     * Sets the value of the roadOrJunctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadOrJunctionNumber(String value) {
        this.roadOrJunctionNumber = value;
    }

    /**
     * Gets the value of the alternativeRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary }
     * 
     * 
     */
    public List<Itinerary> getAlternativeRoute() {
        if (alternativeRoute == null) {
            alternativeRoute = new ArrayList<Itinerary>();
        }
        return this.alternativeRoute;
    }

    /**
     * Gets the value of the reroutingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReroutingManagementExtension() {
        return reroutingManagementExtension;
    }

    /**
     * Sets the value of the reroutingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReroutingManagementExtension(ExtensionType value) {
        this.reroutingManagementExtension = value;
    }

}
