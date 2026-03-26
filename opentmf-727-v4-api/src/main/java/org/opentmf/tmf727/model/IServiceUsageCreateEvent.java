package org.opentmf.tmf727.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-727: Service Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceUsageCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IServiceUsageCreateEventPayload getEvent();
}
