package org.opentmf.tmf635.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IUsageDeleteEventPayload getEvent();
}
