package org.opentmf.tmf710.model;


/**
 * A managed general test artifact resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, version<br/>
 * </p>
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
public interface IGeneralTestArtifactCreate extends IGeneralTestArtifactUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
