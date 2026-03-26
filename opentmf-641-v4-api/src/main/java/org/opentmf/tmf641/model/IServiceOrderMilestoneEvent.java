package org.opentmf.tmf641.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceOrderMilestoneEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IServiceOrderMilestoneEventPayload getEvent();
}
