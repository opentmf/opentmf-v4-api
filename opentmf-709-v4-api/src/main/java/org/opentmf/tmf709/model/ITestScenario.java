package org.opentmf.tmf709.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed test scenario resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testScenarioDefinition<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-709: Test Scenario Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestScenario extends IManagedArtifact {

  /**
   * Test scenario definition.
   */
  ITestScenarioDefinition getTestScenarioDefinition();
}
