package org.opentmf.tmf704.model;


/**
 * A managed non-functional test model resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, nonFunctionalTestModelDefinition, version<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-704: Test Case Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface INonFunctionalTestModelCreate extends INonFunctionalTestModelUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
