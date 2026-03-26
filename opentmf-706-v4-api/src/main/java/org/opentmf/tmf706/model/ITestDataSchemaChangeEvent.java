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
public interface ITestDataSchemaChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestDataSchemaChangeEventPayload getEvent();
}
