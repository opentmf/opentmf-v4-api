package org.opentmf.tmf707.model;

/**
 * The event data structure.
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
public interface ITestCaseResultChangeEventPayload {

  /**
   * A managed test case result resource.
   */
  ITestCaseResult getTestCaseResult();
}
