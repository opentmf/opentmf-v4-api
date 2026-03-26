package org.opentmf.tmf706.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed test data schema resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testDataSchemaDefinition<br/>
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
public interface ITestDataSchema extends IManagedArtifact {

  /**
   * Test data schema definition.
   */
  ITestDataSchemaDefinition getTestDataSchemaDefinition();
}
