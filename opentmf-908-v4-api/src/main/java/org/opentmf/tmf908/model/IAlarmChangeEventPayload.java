package org.opentmf.tmf908.model;

import org.opentmf.common.model.IAlarm;

/**
 * The event data structure.
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
public interface IAlarmChangeEventPayload {

  /**
   * This resource represents an alarm supporting the information model defined in
   * ITU-T X.733.
   */
  IAlarm getAlarm();
}
