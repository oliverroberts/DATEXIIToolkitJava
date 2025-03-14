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
 * <p>Java class for PlacesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aroundBendsInTheRoad"/>
 *     &lt;enumeration value="atCustomsPosts"/>
 *     &lt;enumeration value="atHighAltitudes"/>
 *     &lt;enumeration value="atTollPlazas"/>
 *     &lt;enumeration value="inBuiltUpAreas"/>
 *     &lt;enumeration value="inContraflowSections"/>
 *     &lt;enumeration value="inForestedAreas"/>
 *     &lt;enumeration value="inGalleries"/>
 *     &lt;enumeration value="inLowLyingAreas"/>
 *     &lt;enumeration value="inRoadworksAreas"/>
 *     &lt;enumeration value="inRuralAreas"/>
 *     &lt;enumeration value="inShadedAreas"/>
 *     &lt;enumeration value="inTheCityCentre"/>
 *     &lt;enumeration value="inTheInnerCityAreas"/>
 *     &lt;enumeration value="inTunnels"/>
 *     &lt;enumeration value="onBridges"/>
 *     &lt;enumeration value="onDownHillSections"/>
 *     &lt;enumeration value="onDualCarriagewaySections"/>
 *     &lt;enumeration value="onElevatedSections"/>
 *     &lt;enumeration value="onEnteringOrLeavingTunnels"/>
 *     &lt;enumeration value="onEnteringTheCountry"/>
 *     &lt;enumeration value="onFlyovers"/>
 *     &lt;enumeration value="onLeavingTheCountry"/>
 *     &lt;enumeration value="onMotorways"/>
 *     &lt;enumeration value="onNonMotorways"/>
 *     &lt;enumeration value="onPasses"/>
 *     &lt;enumeration value="onRoundabouts"/>
 *     &lt;enumeration value="onSingleCarriagewaySections"/>
 *     &lt;enumeration value="onSlipRoads"/>
 *     &lt;enumeration value="onUndergroundSections"/>
 *     &lt;enumeration value="onUnderpasses"/>
 *     &lt;enumeration value="onUpHillSections"/>
 *     &lt;enumeration value="overTheCrestOfHills"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlacesEnum")
@XmlEnum
public enum PlacesEnum {


    /**
     * Around bends in the road.
     * 
     */
    @XmlEnumValue("aroundBendsInTheRoad")
    AROUND_BENDS_IN_THE_ROAD("aroundBendsInTheRoad"),

    /**
     * At customs posts.
     * 
     */
    @XmlEnumValue("atCustomsPosts")
    AT_CUSTOMS_POSTS("atCustomsPosts"),

    /**
     * At high altitudes.
     * 
     */
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),

    /**
     * At toll plazas.
     * 
     */
    @XmlEnumValue("atTollPlazas")
    AT_TOLL_PLAZAS("atTollPlazas"),

    /**
     * In built up areas, i.e. villages, towns and cities.
     * 
     */
    @XmlEnumValue("inBuiltUpAreas")
    IN_BUILT_UP_AREAS("inBuiltUpAreas"),

    /**
     * In sections of the road where contraflow is in operation.
     * 
     */
    @XmlEnumValue("inContraflowSections")
    IN_CONTRAFLOW_SECTIONS("inContraflowSections"),

    /**
     * On sections of the road where it runs through or adjacent to forested areas.
     * 
     */
    @XmlEnumValue("inForestedAreas")
    IN_FORESTED_AREAS("inForestedAreas"),

    /**
     * In galleries.
     * 
     */
    @XmlEnumValue("inGalleries")
    IN_GALLERIES("inGalleries"),

    /**
     * In low lying areas.
     * 
     */
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),

    /**
     * In roadworks areas.
     * 
     */
    @XmlEnumValue("inRoadworksAreas")
    IN_ROADWORKS_AREAS("inRoadworksAreas"),

    /**
     * In rural areas, i.e. outside villages, towns and cities.
     * 
     */
    @XmlEnumValue("inRuralAreas")
    IN_RURAL_AREAS("inRuralAreas"),

    /**
     * In shaded areas.
     * 
     */
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),

    /**
     * In the city centre.
     * 
     */
    @XmlEnumValue("inTheCityCentre")
    IN_THE_CITY_CENTRE("inTheCityCentre"),

    /**
     * In the inner city areas.
     * 
     */
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),

    /**
     * In tunnels.
     * 
     */
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),

    /**
     * On bridges.
     * 
     */
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),

    /**
     * On down hill sections of the road.
     * 
     */
    @XmlEnumValue("onDownHillSections")
    ON_DOWN_HILL_SECTIONS("onDownHillSections"),

    /**
     * On dual carriageway sections of the road.
     * 
     */
    @XmlEnumValue("onDualCarriagewaySections")
    ON_DUAL_CARRIAGEWAY_SECTIONS("onDualCarriagewaySections"),

    /**
     * On elevated sections of the road.
     * 
     */
    @XmlEnumValue("onElevatedSections")
    ON_ELEVATED_SECTIONS("onElevatedSections"),

    /**
     * On entering or leaving tunnels.
     * 
     */
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),

    /**
     * On entry into the country.
     * 
     */
    @XmlEnumValue("onEnteringTheCountry")
    ON_ENTERING_THE_COUNTRY("onEnteringTheCountry"),

    /**
     * On flyover sections of the road, i.e. sections of the road which pass over another road.
     * 
     */
    @XmlEnumValue("onFlyovers")
    ON_FLYOVERS("onFlyovers"),

    /**
     * On leaving the country.
     * 
     */
    @XmlEnumValue("onLeavingTheCountry")
    ON_LEAVING_THE_COUNTRY("onLeavingTheCountry"),

    /**
     * On motorways.
     * 
     */
    @XmlEnumValue("onMotorways")
    ON_MOTORWAYS("onMotorways"),

    /**
     * On non motorways.
     * 
     */
    @XmlEnumValue("onNonMotorways")
    ON_NON_MOTORWAYS("onNonMotorways"),

    /**
     * On mountain passes.
     * 
     */
    @XmlEnumValue("onPasses")
    ON_PASSES("onPasses"),

    /**
     * On roundabouts.
     * 
     */
    @XmlEnumValue("onRoundabouts")
    ON_ROUNDABOUTS("onRoundabouts"),

    /**
     * On single carriageway sections of the road.
     * 
     */
    @XmlEnumValue("onSingleCarriagewaySections")
    ON_SINGLE_CARRIAGEWAY_SECTIONS("onSingleCarriagewaySections"),

    /**
     * On slip roads.
     * 
     */
    @XmlEnumValue("onSlipRoads")
    ON_SLIP_ROADS("onSlipRoads"),

    /**
     * On underground sections of the road.
     * 
     */
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),

    /**
     * On underpasses, i.e. sections of the road which pass under another road.
     * 
     */
    @XmlEnumValue("onUnderpasses")
    ON_UNDERPASSES("onUnderpasses"),

    /**
     * On hill sections of the road.
     * 
     */
    @XmlEnumValue("onUpHillSections")
    ON_UP_HILL_SECTIONS("onUpHillSections"),

    /**
     * Over the crest of hills.
     * 
     */
    @XmlEnumValue("overTheCrestOfHills")
    OVER_THE_CREST_OF_HILLS("overTheCrestOfHills"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PlacesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacesEnum fromValue(String v) {
        for (PlacesEnum c: PlacesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
