package org.opentmf.tmf709.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-709: Test Scenario Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestScenarioStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestScenarioStateChangeEventPayload getEvent();
}
