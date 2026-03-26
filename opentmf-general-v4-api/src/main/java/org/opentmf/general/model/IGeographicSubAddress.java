package org.opentmf.general.model;

import org.opentmf.common.model.INamedEntity;

/**
 * Representation of a GeographicSubAddress 
 * <br/>It is used for addressing within a property in an urban area (country
 * properties are often defined differently). It may refer to a building, a
 * building cluster, or a floor of a multistory building.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-673: Geographic Address Management API</li>
 *   <li>TMF-691: Federated ID Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicSubAddress extends INamedEntity {

  /**
   * allows for buildings that have well-known names.
   */
  String getBuildingName();

  /**
   * used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2.
   */
  String getLevelNumber();

  /**
   * describes level types within a building.
   */
  String getLevelType();

  /**
   * private streets internal to a property (e.g. a university) may have internal
   * names that are not recorded by the land title office.
   */
  String getPrivateStreetName();

  /**
   * private streets numbers internal to a private street.
   */
  String getPrivateStreetNumber();

  /**
   * Type of subAddress : it can be a subunit or a private street.
   */
  String getSubAddressType();

  /**
   * the discriminator used for the subunit
   * <br/>often just a simple number e.g. FLAT 5, may also be a range.
   */
  String getSubUnitNumber();

  /**
   * the type of subunit
   * <br/>e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
   */
  String getSubUnitType();
}
