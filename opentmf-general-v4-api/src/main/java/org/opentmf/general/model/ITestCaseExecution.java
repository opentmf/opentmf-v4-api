package org.opentmf.general.model;

/**
 * REST resource for the test case execution lifecycle.
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentProvisioningExecution<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-707: Test Result Management API</li>
 *   <li>TMF-708: Test Execution Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestCaseExecution extends ITestExecution {

  /**
   * A reference to a managed test case artifact.
   */
  ITestCaseRef getTestCase();
}
