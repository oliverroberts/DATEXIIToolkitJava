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
 * <p>Java class for AuthorityOperationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorityOperationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accidentInvestigationWork"/>
 *     &lt;enumeration value="bombSquadInAction"/>
 *     &lt;enumeration value="civilEmergency"/>
 *     &lt;enumeration value="customsOperation"/>
 *     &lt;enumeration value="juridicalReconstruction"/>
 *     &lt;enumeration value="policeCheckPoint"/>
 *     &lt;enumeration value="policeInvestigation"/>
 *     &lt;enumeration value="roadOperatorCheckPoint"/>
 *     &lt;enumeration value="survey"/>
 *     &lt;enumeration value="transportOfVip"/>
 *     &lt;enumeration value="undefinedAuthorityActivity"/>
 *     &lt;enumeration value="vehicleInspectionCheckPoint"/>
 *     &lt;enumeration value="vehicleWeighing"/>
 *     &lt;enumeration value="weighInMotion"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorityOperationTypeEnum")
@XmlEnum
public enum AuthorityOperationTypeEnum {


    /**
     * An operation involving authorised investigation work connected to an earlier reported accident.
     * 
     */
    @XmlEnumValue("accidentInvestigationWork")
    ACCIDENT_INVESTIGATION_WORK("accidentInvestigationWork"),

    /**
     * An operation where a bomb squad is in action to deal with suspected or actual explosive or incendiary devices which may cause disruption to traffic.
     * 
     */
    @XmlEnumValue("bombSquadInAction")
    BOMB_SQUAD_IN_ACTION("bombSquadInAction"),

    /**
     * A situation, perceived or actual, relating to a civil emergency which could disrupt traffic.  This includes large scale destruction, through events such as earthquakes, insurrection, and civil disobedience.
     * 
     */
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),

    /**
     * A permanent or temporary operation established by customs and excise authorities on or adjacent to the carriageway.
     * 
     */
    @XmlEnumValue("customsOperation")
    CUSTOMS_OPERATION("customsOperation"),

    /**
     * An operation involving the juridical reconstruction of events for the purposes of judicial or legal proceedings.
     * 
     */
    @XmlEnumValue("juridicalReconstruction")
    JURIDICAL_RECONSTRUCTION("juridicalReconstruction"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for use by police or other authorities.
     * 
     */
    @XmlEnumValue("policeCheckPoint")
    POLICE_CHECK_POINT("policeCheckPoint"),

    /**
     * A temporary operation established on or adjacent to the carriageway by the police associated with an ongoing investigation.
     * 
     */
    @XmlEnumValue("policeInvestigation")
    POLICE_INVESTIGATION("policeInvestigation"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for use by the road operator, such as for survey or inspection purposes, but not for traffic management purposes.
     * 
     */
    @XmlEnumValue("roadOperatorCheckPoint")
    ROAD_OPERATOR_CHECK_POINT("roadOperatorCheckPoint"),

    /**
     * A permanent or temporary operation established by authorities on or adjacent to the carriageway for the purpose of gathering statistics or other traffic related information.
     * 
     */
    @XmlEnumValue("survey")
    SURVEY("survey"),

    /**
     * An operation to transport one or more VIPs.
     * 
     */
    @XmlEnumValue("transportOfVip")
    TRANSPORT_OF_VIP("transportOfVip"),

    /**
     * An authority activity of undefined type.
     * 
     */
    @XmlEnumValue("undefinedAuthorityActivity")
    UNDEFINED_AUTHORITY_ACTIVITY("undefinedAuthorityActivity"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for inspection of vehicles by authorities (e.g. vehicle safety checks and tachograph checks).
     * 
     */
    @XmlEnumValue("vehicleInspectionCheckPoint")
    VEHICLE_INSPECTION_CHECK_POINT("vehicleInspectionCheckPoint"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for weighing of vehicles by authorities.
     * 
     */
    @XmlEnumValue("vehicleWeighing")
    VEHICLE_WEIGHING("vehicleWeighing"),

    /**
     * A permanent or temporary facility established by authorities on the carriageway for weighing vehicles while in motion.
     * 
     */
    @XmlEnumValue("weighInMotion")
    WEIGH_IN_MOTION("weighInMotion"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AuthorityOperationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorityOperationTypeEnum fromValue(String v) {
        for (AuthorityOperationTypeEnum c: AuthorityOperationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
