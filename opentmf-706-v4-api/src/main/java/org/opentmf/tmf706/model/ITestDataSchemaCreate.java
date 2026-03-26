package org.opentmf.tmf706.model;


/**
 * A managed test data schema resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, testDataSchemaDefinition, version<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-706: Test Data Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestDataSchemaCreate extends ITestDataSchemaUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
