package org.opentmf.tmf629.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomerStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  ICustomerStateChangeEventPayload getEvent();
}
