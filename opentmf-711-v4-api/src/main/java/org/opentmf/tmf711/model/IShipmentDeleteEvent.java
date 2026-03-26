package org.opentmf.tmf711.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-711: Shipment Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShipmentDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IShipmentDeleteEventPayload getEvent();
}
