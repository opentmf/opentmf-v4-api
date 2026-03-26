package org.opentmf.tmf710.model;

/**
 * The event data structure.
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
public interface IGeneralTestArtifactCreateEventPayload {

  /**
   * A managed general test artifact resource.
   */
  IGeneralTestArtifact getGeneralTestArtifact();
}
