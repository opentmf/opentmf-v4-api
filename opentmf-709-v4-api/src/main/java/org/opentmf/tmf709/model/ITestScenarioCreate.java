package org.opentmf.tmf709.model;


/**
 * A managed test scenario resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, testScenarioDefinition, version<br/>
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
public interface ITestScenarioCreate extends ITestScenarioUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
