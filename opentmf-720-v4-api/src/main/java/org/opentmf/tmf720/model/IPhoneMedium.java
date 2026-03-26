package org.opentmf.tmf720.model;


/**
 * Describes a phone number that could be used to contact a party (an individual
 * or an organization).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-720: Digital Identity Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPhoneMedium extends IDigitalIdentityContactMedium {

  /**
   * The phone number of the contact.
   */
  String getPhoneNumber();
}
