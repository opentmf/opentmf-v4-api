package org.opentmf.tmf622.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICancelProductOrderStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  ICancelProductOrderStateChangeEventPayload getEvent();
}
