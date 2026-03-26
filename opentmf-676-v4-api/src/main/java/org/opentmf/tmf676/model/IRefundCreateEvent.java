package org.opentmf.tmf676.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-676: Payment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRefundCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IRefundCreateEventPayload getEvent();
}
