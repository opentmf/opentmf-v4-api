package org.opentmf.tmf705.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-705: Test Environment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestResourceAPIDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestResourceAPIDeleteEventPayload getEvent();
}
