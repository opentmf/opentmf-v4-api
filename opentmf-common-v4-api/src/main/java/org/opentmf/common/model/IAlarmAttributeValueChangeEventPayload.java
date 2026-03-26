package org.opentmf.common.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAlarmAttributeValueChangeEventPayload {

  /**
   * This resource represents an alarm supporting the information model defined in
   * ITU-T X.733.
   */
  IAlarm getAlarm();
}
