package org.opentmf.tmf710.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed general test artifact resource.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-710: General Test Artifact Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeneralTestArtifact extends IManagedArtifact {

  /**
   * General test artifact definition.
   */
  IGeneralTestArtifactDefinition getGeneralArtifactDefinition();
}
