package org.opentmf.tmf703.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-703: Entity Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IEntityCreateEventPayload getEvent();
}
