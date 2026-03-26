package org.opentmf.tmf720.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Indicates the contact medium that could be used to contact the party.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, id<br/>
 * </p>
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
public interface IDigitalIdentityContactMedium extends IExtensible {

  /**
   * Type of the contact medium to qualifiy it like pro email / personal email.
   * This is not used to define the contact medium used.
   */
  String getContactType();

  /**
   * Identifier for this contact medium.
   */
  String getId();

  /**
   * If true, indicates that is the preferred contact medium.
   */
  Boolean getPreferred();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
