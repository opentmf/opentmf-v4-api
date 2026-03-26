package org.opentmf.tmf700.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShippingOrderStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IShippingOrderStateChangeEventPayload getEvent();
}
