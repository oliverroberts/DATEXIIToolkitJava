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
 * <p>Java class for RoadsideServiceDisruptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadsideServiceDisruptionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="barClosed"/>
 *     &lt;enumeration value="dieselShortage"/>
 *     &lt;enumeration value="fuelShortage"/>
 *     &lt;enumeration value="lpgShortage"/>
 *     &lt;enumeration value="methaneShortage"/>
 *     &lt;enumeration value="noDieselForHeavyVehicles"/>
 *     &lt;enumeration value="noDieselForLightVehicles"/>
 *     &lt;enumeration value="noPublicTelephones"/>
 *     &lt;enumeration value="noToiletFacilities"/>
 *     &lt;enumeration value="noVehicleRepairFacilities"/>
 *     &lt;enumeration value="petrolShortage"/>
 *     &lt;enumeration value="restAreaBusy"/>
 *     &lt;enumeration value="restAreaClosed"/>
 *     &lt;enumeration value="restAreaOvercrowdedDriveToAnotherRestArea"/>
 *     &lt;enumeration value="serviceAreaBusy"/>
 *     &lt;enumeration value="serviceAreaClosed"/>
 *     &lt;enumeration value="serviceAreaFuelStationClosed"/>
 *     &lt;enumeration value="serviceAreaOvercrowdedDriveToAnotherServiceArea"/>
 *     &lt;enumeration value="serviceAreaRestaurantClosed"/>
 *     &lt;enumeration value="someCommercialServicesClosed"/>
 *     &lt;enumeration value="waterShortage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadsideServiceDisruptionTypeEnum")
@XmlEnum
public enum RoadsideServiceDisruptionTypeEnum {


    /**
     * Bar closed.
     * 
     */
    @XmlEnumValue("barClosed")
    BAR_CLOSED("barClosed"),

    /**
     * There is a shortage of diesel at the specified location.
     * 
     */
    @XmlEnumValue("dieselShortage")
    DIESEL_SHORTAGE("dieselShortage"),

    /**
     * There is a shortage of fuel (of one or more types) at the specified location.
     * 
     */
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),

    /**
     * There is a shortage of liquid petroleum gas at the specified location.
     * 
     */
    @XmlEnumValue("lpgShortage")
    LPG_SHORTAGE("lpgShortage"),

    /**
     * There is a shortage of methane at the specified location.
     * 
     */
    @XmlEnumValue("methaneShortage")
    METHANE_SHORTAGE("methaneShortage"),

    /**
     * There is no diesel available for heavy goods vehicles at the specified location.
     * 
     */
    @XmlEnumValue("noDieselForHeavyVehicles")
    NO_DIESEL_FOR_HEAVY_VEHICLES("noDieselForHeavyVehicles"),

    /**
     * There is no diesel available for light vehicles at the specified location.
     * 
     */
    @XmlEnumValue("noDieselForLightVehicles")
    NO_DIESEL_FOR_LIGHT_VEHICLES("noDieselForLightVehicles"),

    /**
     * There are no available public telephones at the specified location.
     * 
     */
    @XmlEnumValue("noPublicTelephones")
    NO_PUBLIC_TELEPHONES("noPublicTelephones"),

    /**
     * There are no available public toilet facilities at the specified location.
     * 
     */
    @XmlEnumValue("noToiletFacilities")
    NO_TOILET_FACILITIES("noToiletFacilities"),

    /**
     * There are no available vehicle repair facilities at the specified location.
     * 
     */
    @XmlEnumValue("noVehicleRepairFacilities")
    NO_VEHICLE_REPAIR_FACILITIES("noVehicleRepairFacilities"),

    /**
     * There is a shortage of petrol at the specified location.
     * 
     */
    @XmlEnumValue("petrolShortage")
    PETROL_SHORTAGE("petrolShortage"),

    /**
     * The rest area at the specified location is busy.
     * 
     */
    @XmlEnumValue("restAreaBusy")
    REST_AREA_BUSY("restAreaBusy"),

    /**
     * The rest area at the specified location is closed.
     * 
     */
    @XmlEnumValue("restAreaClosed")
    REST_AREA_CLOSED("restAreaClosed"),

    /**
     * The rest area at the specified location is close to capacity and motorists are advised to seek an alternative.
     * 
     */
    @XmlEnumValue("restAreaOvercrowdedDriveToAnotherRestArea")
    REST_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_REST_AREA("restAreaOvercrowdedDriveToAnotherRestArea"),

    /**
     * The service area at the specified location is close to capacity.
     * 
     */
    @XmlEnumValue("serviceAreaBusy")
    SERVICE_AREA_BUSY("serviceAreaBusy"),

    /**
     * The service area at the specified location is closed.
     * 
     */
    @XmlEnumValue("serviceAreaClosed")
    SERVICE_AREA_CLOSED("serviceAreaClosed"),

    /**
     * The fuel station at the specified service area is closed.
     * 
     */
    @XmlEnumValue("serviceAreaFuelStationClosed")
    SERVICE_AREA_FUEL_STATION_CLOSED("serviceAreaFuelStationClosed"),

    /**
     * The service area at the specified location is close to capacity and motorists are advised to seek an alternative.
     * 
     */
    @XmlEnumValue("serviceAreaOvercrowdedDriveToAnotherServiceArea")
    SERVICE_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_SERVICE_AREA("serviceAreaOvercrowdedDriveToAnotherServiceArea"),

    /**
     * The restaurant at the specified service area is closed.
     * 
     */
    @XmlEnumValue("serviceAreaRestaurantClosed")
    SERVICE_AREA_RESTAURANT_CLOSED("serviceAreaRestaurantClosed"),

    /**
     * Some commercial services are closed at the specified location.
     * 
     */
    @XmlEnumValue("someCommercialServicesClosed")
    SOME_COMMERCIAL_SERVICES_CLOSED("someCommercialServicesClosed"),

    /**
     * There is a shortage of water at the specified location.
     * 
     */
    @XmlEnumValue("waterShortage")
    WATER_SHORTAGE("waterShortage");
    private final String value;

    RoadsideServiceDisruptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideServiceDisruptionTypeEnum fromValue(String v) {
        for (RoadsideServiceDisruptionTypeEnum c: RoadsideServiceDisruptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
