package org.opentmf.tmf705.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed abstract environment resource.
 *
 * <p><br/>
 * <strong>Required:</strong> abstractEnvironmentDefinition<br/>
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
public interface IAbstractEnvironment extends IManagedArtifact {

  /**
   * Abstract environment definition.
   */
  IAbstractEnvironmentDefinition getAbstractEnvironmentDefinition();
}
