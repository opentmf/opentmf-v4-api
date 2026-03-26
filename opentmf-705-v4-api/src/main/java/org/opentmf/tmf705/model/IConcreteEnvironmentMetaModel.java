package org.opentmf.tmf705.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed concrete environment resource metamodel resource.
 *
 * <p><br/>
 * <strong>Required:</strong> concreteEnvironmentMetaModelDefinition<br/>
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
public interface IConcreteEnvironmentMetaModel extends IManagedArtifact {

  /**
   * Test environment metamodel definition.
   */
  IConcreteEnvironmentMetaModelDefinition getConcreteEnvironmentMetaModelDefinition();
}
