package org.opentmf.common.model;


/**
 * Describes the contact medium characteristics that could be used to contact a
 * party (an individual or an organization).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 *   <li>TMF-632: Party Management API</li>
 *   <li>TMF-646: Appointment Management API</li>
 *   <li>TMF-648: Quote Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-663: Shopping Cart Management API</li>
 *   <li>TMF-666: Account Management API</li>
 *   <li>TMF-668: Partnership Type</li>
 *   <li>TMF-669: Party Role Management API</li>
 *   <li>TMF-699: Sales Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-704: Test Case Management API</li>
 *   <li>TMF-705: Test Environment Management API</li>
 *   <li>TMF-706: Test Data Management API</li>
 *   <li>TMF-709: Test Scenario Management API</li>
 *   <li>TMF-710: General Test Artifact Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMediumCharacteristic extends IEntity {

  /**
   * The city.
   */
  String getCity();

  /**
   * The type of contact, for example: phone number such as mobile, fixed home,
   * fixed office. postal address such as shipping installation….
   */
  String getContactType();

  /**
   * The country.
   */
  String getCountry();

  /**
   * Full email address in standard format.
   */
  String getEmailAddress();

  /**
   * The fax number of the contact.
   */
  String getFaxNumber();

  /**
   * The primary phone number of the contact.
   */
  String getPhoneNumber();

  /**
   * Postcode.
   */
  String getPostCode();

  /**
   * Identifier as a member of a social network.
   */
  String getSocialNetworkId();

  /**
   * State or province.
   */
  String getStateOrProvince();

  /**
   * Describes the street.
   */
  String getStreet1();

  /**
   * Complementary street description.
   */
  String getStreet2();
}
