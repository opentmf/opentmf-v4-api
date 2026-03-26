package org.opentmf.tmf706.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-706: Test Data Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestDataInstanceDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestDataInstanceDeleteEventPayload getEvent();
}
