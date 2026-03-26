package org.opentmf.tmf908.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
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
public interface IIotDeviceCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IIotDeviceCreateEventPayload getEvent();
}
