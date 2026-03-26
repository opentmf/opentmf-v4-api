package org.opentmf.tmf709.model;

/**
 * The event data structure.
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
public interface ITestScenarioChangeEventPayload {

  /**
   * A managed test scenario resource.
   */
  ITestScenario getTestScenario();
}
