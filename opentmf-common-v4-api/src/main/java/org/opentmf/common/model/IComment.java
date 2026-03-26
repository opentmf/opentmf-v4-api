package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Indicates the comments entered on the alarm.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IComment extends IExtensible {

  /**
   * Indicates the text of the comment.
   */
  String getComment();

  /**
   * Indicates the system identifier on which the client set the comment.
   */
  String getSystemId();

  /**
   * Indicates the time commenting the alarm.
   */
  OffsetDateTime getTime();

  /**
   * Indicates the user commenting the alarm.
   */
  String getUserId();
}
