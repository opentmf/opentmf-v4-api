package org.opentmf.tmf706.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed test data instance resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testDataInstanceDefinition<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-706: Test Data Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestDataInstance extends IManagedArtifact {

  /**
   * Test data instance definition.
   */
  ITestDataInstanceDefinition getTestDataInstanceDefinition();
}
