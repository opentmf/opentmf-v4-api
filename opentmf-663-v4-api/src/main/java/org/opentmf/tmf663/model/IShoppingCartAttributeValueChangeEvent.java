package org.opentmf.tmf663.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

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
public interface IShoppingCartAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IShoppingCartAttributeValueChangeEventPayload getEvent();
}
