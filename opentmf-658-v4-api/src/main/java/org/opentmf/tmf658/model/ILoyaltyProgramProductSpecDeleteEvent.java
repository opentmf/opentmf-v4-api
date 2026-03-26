package org.opentmf.tmf658.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyProgramProductSpecDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ILoyaltyProgramProductSpecDeleteEventPayload getEvent();
}
