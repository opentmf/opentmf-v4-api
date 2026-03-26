package org.opentmf.tmf708.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-708: Test Execution Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestEnvironmentProvisioningExecutionCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ITestEnvironmentProvisioningExecutionCreateEventPayload getEvent();
}
