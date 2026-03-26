package org.opentmf.tmf921.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIntentReportDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IIntentReportDeleteEventPayload getEvent();
}
