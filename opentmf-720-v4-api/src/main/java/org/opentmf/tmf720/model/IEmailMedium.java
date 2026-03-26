package org.opentmf.tmf720.model;


/**
 * Describes an email that could be used to contact a party (an individual or an
 * organization).
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
public interface IEmailMedium extends IDigitalIdentityContactMedium {

  /**
   * Full email address in standard format.
   */
  String getEmailAddress();
}
