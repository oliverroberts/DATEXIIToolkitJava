//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReroutingManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReroutingManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="doNotFollowDiversionSigns"/>
 *     &lt;enumeration value="doNotUseEntry"/>
 *     &lt;enumeration value="doNotUseExit"/>
 *     &lt;enumeration value="doNotUseIntersectionOrJunction"/>
 *     &lt;enumeration value="followDiversionSigns"/>
 *     &lt;enumeration value="followLocalDiversion"/>
 *     &lt;enumeration value="followSpecialMarkers"/>
 *     &lt;enumeration value="useEntry"/>
 *     &lt;enumeration value="useExit"/>
 *     &lt;enumeration value="useIntersectionOrJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReroutingManagementTypeEnum")
@XmlEnum
public enum ReroutingManagementTypeEnum {


    /**
     * Do not follow diversion signs.
     * 
     */
    @XmlEnumValue("doNotFollowDiversionSigns")
    DO_NOT_FOLLOW_DIVERSION_SIGNS("doNotFollowDiversionSigns"),

    /**
     * Rerouted traffic is not to use the specified entry onto the identified road to commence the alternative route.
     * 
     */
    @XmlEnumValue("doNotUseEntry")
    DO_NOT_USE_ENTRY("doNotUseEntry"),

    /**
     * Rerouted traffic is not to use the specified exit from the identified road to commence the alternative route.
     * 
     */
    @XmlEnumValue("doNotUseExit")
    DO_NOT_USE_EXIT("doNotUseExit"),

    /**
     * Rerouted traffic is not to use the specified intersection or junction.
     * 
     */
    @XmlEnumValue("doNotUseIntersectionOrJunction")
    DO_NOT_USE_INTERSECTION_OR_JUNCTION("doNotUseIntersectionOrJunction"),

    /**
     * Rerouted traffic is to follow the diversion signs.
     * 
     */
    @XmlEnumValue("followDiversionSigns")
    FOLLOW_DIVERSION_SIGNS("followDiversionSigns"),

    /**
     * Rerouted traffic is to follow local diversion.
     * 
     */
    @XmlEnumValue("followLocalDiversion")
    FOLLOW_LOCAL_DIVERSION("followLocalDiversion"),

    /**
     * Rerouted traffic is to follow the special diversion markers.
     * 
     */
    @XmlEnumValue("followSpecialMarkers")
    FOLLOW_SPECIAL_MARKERS("followSpecialMarkers"),

    /**
     * Rerouted traffic is to use the specified entry onto the identified road to commence the alternative route.
     * 
     */
    @XmlEnumValue("useEntry")
    USE_ENTRY("useEntry"),

    /**
     * Rerouted traffic is to use the specified exit from the identified road to commence the alternative route.
     * 
     */
    @XmlEnumValue("useExit")
    USE_EXIT("useExit"),

    /**
     * Rerouted traffic is to use the specified intersection or junction to commence the alternative route.
     * 
     */
    @XmlEnumValue("useIntersectionOrJunction")
    USE_INTERSECTION_OR_JUNCTION("useIntersectionOrJunction");
    private final String value;

    ReroutingManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReroutingManagementTypeEnum fromValue(String v) {
        for (ReroutingManagementTypeEnum c: ReroutingManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
