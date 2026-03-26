package org.opentmf.tmf704.model;

/**
 * The event data structure.
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
public interface ITestCaseStateChangeEventPayload {

  /**
   * A managed test case resource.
   */
  ITestCase getTestCase();
}
