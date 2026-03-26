package org.opentmf.tmf708.model;

import org.opentmf.general.model.ITestSuiteExecution;

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
public interface ITestSuiteExecutionCreateEventPayload {

  /**
   * REST resource for the test suite execution lifecycle.
   */
  ITestSuiteExecution getTestSuiteExecution();
}
