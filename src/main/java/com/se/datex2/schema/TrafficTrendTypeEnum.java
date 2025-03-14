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
 * <p>Java class for TrafficTrendTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficTrendTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="trafficBuildingUp"/>
 *     &lt;enumeration value="trafficEasing"/>
 *     &lt;enumeration value="trafficStable"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficTrendTypeEnum")
@XmlEnum
public enum TrafficTrendTypeEnum {


    /**
     * Traffic conditions are changing from free-flow to heavy or slow service levels.  Queues may also be expected.
     * 
     */
    @XmlEnumValue("trafficBuildingUp")
    TRAFFIC_BUILDING_UP("trafficBuildingUp"),

    /**
     * Traffic conditions are changing from heavy or slow service levels to free-flow.
     * 
     */
    @XmlEnumValue("trafficEasing")
    TRAFFIC_EASING("trafficEasing"),

    /**
     * Traffic conditions are currently stable.
     * 
     */
    @XmlEnumValue("trafficStable")
    TRAFFIC_STABLE("trafficStable"),

    /**
     * The trend of traffic conditions is currently unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTrendTypeEnum fromValue(String v) {
        for (TrafficTrendTypeEnum c: TrafficTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
