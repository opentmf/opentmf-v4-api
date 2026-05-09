package org.opentmf.tmf908.model;

import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IConfiguration;
import org.opentmf.common.model.IGeographicLocation;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IPlace;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceCharacteristic;
import org.opentmf.common.model.IResourceRelationship;
import org.opentmf.common.model.IRule;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> category, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDevice extends IGSMACommons {

  /**
   * Structured textual way of describing how to find a Property in an urban area
   * (country properties are often
   * <br/>defined differently).
   * <br/>Note : Address corresponds to SID UrbanPropertyAddress.
   */
  IAddress getAddress();

  String getAreaServed();

  BigDecimal getBatteryLevel();

  /**
   * Category of the concrete resource. e.g. Gold, Silver for MSISDN concrete
   * resource.
   */
  String getCategory();

  List<? extends IResourceCharacteristic> getCharacteristics();

  /**
   * #TODO.
   */
  IConfiguration getConfiguration();

  OffsetDateTime getDateFirstUsed();

  OffsetDateTime getDateInstalled();

  OffsetDateTime getDateLastCalibration();

  OffsetDateTime getDateLastValueReported();

  OffsetDateTime getDateManufactured();

  String getDeviceState();

  /**
   * NGSI Entity type.
   */
  String getDeviceType();

  /**
   * A date time( DateTime). The date till the resource is effective.
   */
  OffsetDateTime getEndDate();

  String getFirmwareVersion();

  String getHardwareVersion();

  /**
   * The URI for the object itself.
   */
  URI getHref();

  /**
   * Identifier of an instance of the resource. Required to be unique within the
   * resource type. Used in URIs as the identifier for specific instances of a
   * type.
   */
  String getId();

  /**
   * The life cycle state of the resource.
   */
  String getLifecycleState();

  /**
   * A GeographicLocation is a pure-virtual super-class to the GeoJSON-aligned
   * geometries of Point (addresses and locations), MultiPoint, LineString
   * (streets, highways and boundaries), MultiLineString and Polygon (countries,
   * provinces, tracts of land). Use the {@literal @}type attribute to specify which of these
   * is being specified by the geometry attribute.
   */
  IGeographicLocation getLocation();

  /**
   * List of: #TODO.
   */
  List<? extends IMacAddressType> getMacAddresses();

  /**
   * This is a string attribute that defines the date of manufacture of this item
   * in the fixed format "dd/mm/yyyy". This is an optional attribute.
   */
  OffsetDateTime getManufactureDate();

  String getMnc();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  String getOsVersion();

  /**
   * List of: Party role reference. A party role represents the part played by a
   * party in a given context.
   */
  List<? extends IPartyRoleRef> getPartyRoles();

  /**
   * Place reference. Place defines the places where the products are sold or
   * delivered.
   */
  IPlace getPlace();

  /**
   * This defines the current power status of the hardware item. Values include:
   * <br/>
   * <br/> 0: Unknown
   * <br/> 1: Not Applicable
   * <br/> 2: No Power Applied
   * <br/> 3: Full Power Applied
   * <br/> 4: Power Save - Normal
   * <br/> 5: Power Save - Degraded
   * <br/> 6: Power Save - Standby
   * <br/> 7: Power Save - Critical
   * <br/> 8: Power Save - Low Power Mode
   * <br/> 9: Power Save - Unknown
   * <br/> 10: Power Cycle
   * <br/> 11: Power Warning
   * <br/> 12: Power Off.
   */
  String getPowerState();

  String getProvider();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of: Linked resources to the one instantiate, such as [bundled] if the
   * resource is a bundle and you want to describe the bundled resources inside
   * this bundle; [reliesOn] if the resource needs another already owned resource
   * to rely on (e.g. an option on an already owned mobile access resource)
   * [targets] or [isTargeted] (depending on the way of expressing the link) for
   * any other kind of links that may be useful.
   */
  List<? extends IResourceRelationship> getResourceRelationships();

  List<? extends IRule> getRules();

  String getSerialNumber();

  String getSoftwareVersion();

  /**
   * A date time( DateTime). The date from which the resource is effective.
   */
  OffsetDateTime getStartDate();

  String getValue();

  /**
   * A field that identifies the specific version of an instance of a resource.
   */
  String getVersion();

  /**
   * This is a string that identifies the version of this object. This is an
   * optional attribute.
   */
  String getVersionNumber();
}
