package org.opentmf.tmf704.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed test suite resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testSuiteDefinition<br/>
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
public interface ITestSuite extends IManagedArtifact {

  /**
   * Test suite definition.
   */
  ITestSuiteDefinition getTestSuiteDefinition();
}
