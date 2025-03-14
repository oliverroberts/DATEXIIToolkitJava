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
 * <p>Java class for AreaOfInterestEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaOfInterestEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="continentWide"/>
 *     &lt;enumeration value="national"/>
 *     &lt;enumeration value="neighbouringCountries"/>
 *     &lt;enumeration value="notSpecified"/>
 *     &lt;enumeration value="regional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaOfInterestEnum")
@XmlEnum
public enum AreaOfInterestEnum {


    /**
     * Area of the whole European continent.
     * 
     */
    @XmlEnumValue("continentWide")
    CONTINENT_WIDE("continentWide"),

    /**
     * Whole area of the specific country.
     * 
     */
    @XmlEnumValue("national")
    NATIONAL("national"),

    /**
     * Area of countries which are neighbouring the one specified.
     * 
     */
    @XmlEnumValue("neighbouringCountries")
    NEIGHBOURING_COUNTRIES("neighbouringCountries"),

    /**
     * Non specified area.
     * 
     */
    @XmlEnumValue("notSpecified")
    NOT_SPECIFIED("notSpecified"),

    /**
     * Area of the local region.
     * 
     */
    @XmlEnumValue("regional")
    REGIONAL("regional");
    private final String value;

    AreaOfInterestEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfInterestEnum fromValue(String v) {
        for (AreaOfInterestEnum c: AreaOfInterestEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
