package org.opentmf.tmf908.model;

import org.opentmf.common.model.INamedEntity;

/**
 * Representation of a SubAddress 
 * <br/>It is used for addressing within a property in an urban area (country
 * properties are often defined differently). It may refer to a building, a
 * building cluster, or a floor of a multistory building.
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
public interface ISubAddress extends INamedEntity {

  /**
   * Allows for buildings that have well-known names.
   */
  String getBuildingName();

  /**
   * Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2.
   */
  String getLevelNumber();

  /**
   * Describes level types within a building.
   */
  String getLevelType();

  /**
   * Private streets internal to a property (e.g. a university) may have internal
   * names that are not recorded by the land title office.
   */
  String getPrivateStreetName();

  /**
   * Private streets numbers internal to a private street.
   */
  String getPrivateStreetNumber();

  /**
   * The type of subaddress : it can be a subunit or a private street.
   */
  String getSubAddressType();

  /**
   * The discriminator of the subunit, often just a simple number e.g. FLAT 5, may
   * also be a range.
   */
  String getSubUnitNumber();

  /**
   * The type of subunit, such as BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT,
   * WHARF.
   */
  String getSubUnitType();
}
