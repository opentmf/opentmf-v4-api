package org.opentmf.tmf642.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IClearAlarmsStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IClearAlarmsStateChangeEventPayload getEvent();
}
