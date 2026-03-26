package org.opentmf.tmf670.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-670: Payment Method Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPaymentMethodDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IPaymentMethodDeleteEventPayload getEvent();
}
