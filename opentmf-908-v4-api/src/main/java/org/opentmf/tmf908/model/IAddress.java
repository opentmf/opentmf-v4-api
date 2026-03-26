package org.opentmf.tmf908.model;

import org.opentmf.common.model.IExtensible;

/**
 * Structured textual way of describing how to find a Property in an urban area
 * (country properties are often
 * <br/>defined differently).
 * <br/>Note : Address corresponds to SID UrbanPropertyAddress.
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
public interface IAddress extends IExtensible {

  /**
   * City that the address is in.
   */
  String getCity();

  /**
   * Country that the address is in.
   */
  String getCountry();

  /**
   * "An area of defined or undefined boundaries within a local authority or other
   * legislatively defined area, usually rural or semi rural in nature."
   * [ANZLIC-STREET], or a suburb "a bounded locality within a city, town or shire
   * principally of urban character " [ANZLICSTREET].
   */
  String getLocality();

  /**
   * descriptor for a postal delivery area, used to speed and simplify the
   * delivery of mail (also known as zipcode).
   */
  String getPostcode();

  /**
   * the State or Province that the address is in.
   */
  String getStateOrProvince();

  /**
   * Name of the street or other street type.
   */
  String getStreetName();

  /**
   * Number identifying a specific property on a public street. It may be combined
   * with streetNrLast for ranged addresses.
   */
  String getStreetNr();

  /**
   * Last number in a range of street numbers allocated to a property.
   */
  String getStreetNrLast();

  /**
   * Last street number suffix for a ranged address.
   */
  String getStreetNrLastSuffix();

  /**
   * the first street number suffix.
   */
  String getStreetNrSuffix();

  /**
   * A modifier denoting a relative direction.
   */
  String getStreetSuffix();

  /**
   * alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace,
   * parade, place, tarn, way, wharf.
   */
  String getStreetType();

  /**
   * Representation of a SubAddress 
   * <br/>It is used for addressing within a property in an urban area (country
   * properties are often defined differently). It may refer to a building, a
   * building cluster, or a floor of a multistory building.
   */
  ISubAddress getSubAddress();
}
