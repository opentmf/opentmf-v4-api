package org.opentmf.tmf707.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-707: Test Result Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestCaseResultDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestCaseResultDeleteEventPayload getEvent();
}
