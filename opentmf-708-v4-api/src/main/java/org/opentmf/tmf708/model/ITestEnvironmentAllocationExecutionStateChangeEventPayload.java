package org.opentmf.tmf708.model;

import org.opentmf.general.model.ITestEnvironmentAllocationExecution;

/**
 * The event data structure.
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
public interface ITestEnvironmentAllocationExecutionStateChangeEventPayload {

  /**
   * REST resource for test environment allocation lifecycle.
   */
  ITestEnvironmentAllocationExecution getTestEnvironmentAllocationExecution();
}
