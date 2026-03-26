package org.opentmf.tmf704.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-704: Test Case Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestSuiteDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestSuiteDeleteEventPayload getEvent();
}
