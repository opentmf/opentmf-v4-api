package org.opentmf.tmf708.model;

import org.opentmf.general.model.ITestCaseExecution;

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
public interface ITestCaseExecutionStateChangeEventPayload {

  /**
   * REST resource for the test case execution lifecycle.
   */
  ITestCaseExecution getTestCaseExecution();
}
