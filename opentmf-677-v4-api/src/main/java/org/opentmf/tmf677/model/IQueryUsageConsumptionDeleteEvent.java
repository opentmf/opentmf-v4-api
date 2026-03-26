package org.opentmf.tmf677.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQueryUsageConsumptionDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IQueryUsageConsumptionDeleteEventPayload getEvent();
}
