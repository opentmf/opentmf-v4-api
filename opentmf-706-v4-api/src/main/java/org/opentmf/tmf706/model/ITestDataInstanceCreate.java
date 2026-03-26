package org.opentmf.tmf706.model;


/**
 * A managed test data instance resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, testDataInstanceDefinition, version<br/>
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
public interface ITestDataInstanceCreate extends ITestDataInstanceUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
