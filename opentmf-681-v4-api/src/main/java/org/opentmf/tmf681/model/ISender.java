package org.opentmf.tmf681.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;

/**
 * Sender of the communication message.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-681: Communication Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISender extends IExtensible {

  /**
   * Sender address of email, if the communication type is email.
   */
  String getEmail();

  /**
   * ID of the sender.
   */
  String getId();

  /**
   * Name of the sender.
   */
  String getName();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getParty();

  /**
   * Phone number of the sender, if the communication type is SMS.
   */
  String getPhoneNumber();
}
