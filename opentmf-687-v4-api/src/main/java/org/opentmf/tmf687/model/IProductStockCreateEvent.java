package org.opentmf.tmf687.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-687: Stock Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductStockCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IProductStockCreateEventPayload getEvent();
}
