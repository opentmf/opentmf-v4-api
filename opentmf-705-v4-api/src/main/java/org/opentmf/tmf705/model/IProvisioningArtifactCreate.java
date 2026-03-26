package org.opentmf.tmf705.model;


/**
 * A managed provisioning artifact resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, provisioningArtifactDefinition, version<br/>
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
public interface IProvisioningArtifactCreate extends IProvisioningArtifactUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
