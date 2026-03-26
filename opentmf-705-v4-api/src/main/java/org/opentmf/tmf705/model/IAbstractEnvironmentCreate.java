package org.opentmf.tmf705.model;


/**
 * A managed abstract environment resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> abstractEnvironmentDefinition, description, version<br/>
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
public interface IAbstractEnvironmentCreate extends IAbstractEnvironmentUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
