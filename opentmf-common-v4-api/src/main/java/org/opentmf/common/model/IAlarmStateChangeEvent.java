package org.opentmf.common.model;

/**
 * The notification data structure.
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
public interface IAlarmStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IAlarmStateChangeEventPayload getEvent();
}
