package org.opentmf.tmf915.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAiContractStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IAiContractStateChangeEventPayload getEvent();
}
