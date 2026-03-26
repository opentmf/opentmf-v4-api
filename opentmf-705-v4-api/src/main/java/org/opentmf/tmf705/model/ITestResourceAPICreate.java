package org.opentmf.tmf705.model;


/**
 * A managed test resource API resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, testResourceAPIDefinition, version<br/>
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
public interface ITestResourceAPICreate extends ITestResourceAPIUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
