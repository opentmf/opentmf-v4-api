package org.opentmf.tmf705.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed test resource API resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testResourceAPIDefinition<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-705: Test Environment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestResourceAPI extends IManagedArtifact {

  /**
   * Test resource API definition.
   */
  ITestResourceAPIDefinition getTestResourceAPIDefinition();
}
