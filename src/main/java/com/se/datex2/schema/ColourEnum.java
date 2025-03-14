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
 * <p>Java class for ColourEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColourEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amber"/>
 *     &lt;enumeration value="blue"/>
 *     &lt;enumeration value="green"/>
 *     &lt;enumeration value="red"/>
 *     &lt;enumeration value="white"/>
 *     &lt;enumeration value="whiteYellow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColourEnum")
@XmlEnum
public enum ColourEnum {


    /**
     * The colour amber.
     * 
     */
    @XmlEnumValue("amber")
    AMBER("amber"),

    /**
     * The colour blue.
     * 
     */
    @XmlEnumValue("blue")
    BLUE("blue"),

    /**
     * The colour green.
     * 
     */
    @XmlEnumValue("green")
    GREEN("green"),

    /**
     * The colour red.
     * 
     */
    @XmlEnumValue("red")
    RED("red"),

    /**
     * The colour white.
     * 
     */
    @XmlEnumValue("white")
    WHITE("white"),

    /**
     * The colour white-yellow.
     * 
     */
    @XmlEnumValue("whiteYellow")
    WHITE_YELLOW("whiteYellow");
    private final String value;

    ColourEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColourEnum fromValue(String v) {
        for (ColourEnum c: ColourEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
