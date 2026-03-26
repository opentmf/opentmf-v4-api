package org.opentmf.tmf654.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITopupBalanceCancelEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITopupBalanceCancelEventPayload getEvent();
}
