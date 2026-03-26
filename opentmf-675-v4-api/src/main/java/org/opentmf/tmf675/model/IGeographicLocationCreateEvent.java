package org.opentmf.tmf675.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-675: Geographic Location Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicLocationCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IGeographicLocationCreateEventPayload getEvent();
}
