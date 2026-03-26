package org.opentmf.tmf663.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-663: Shopping Cart Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShoppingCartCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IShoppingCartCreateEventPayload getEvent();
}
