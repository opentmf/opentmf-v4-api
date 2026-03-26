package org.opentmf.tmf681.model;


/**
 * Receivers of the communication message.
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
public interface IReceiver extends ISender {

  /**
   * ID of the mobile app user.
   */
  String getAppUserId();

  /**
   * IP address of the receiver.
   */
  String getIp();
}
