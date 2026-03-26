package org.opentmf.tmf637.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-637: Product Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IProductStateChangeEventPayload getEvent();
}
