package org.opentmf.tmf705.model;


/**
 * A managed concrete environment resource metamodel resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> concreteEnvironmentMetaModelDefinition, description, version<br/>
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
public interface IConcreteEnvironmentMetaModelCreate extends IConcreteEnvironmentMetaModelUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
