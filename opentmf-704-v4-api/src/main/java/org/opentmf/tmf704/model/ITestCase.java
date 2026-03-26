package org.opentmf.tmf704.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed test case resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testCaseDefinition<br/>
 * </p>
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
public interface ITestCase extends IManagedArtifact {

  /**
   * Test case definition.
   */
  ITestCaseDefinition getTestCaseDefinition();
}
