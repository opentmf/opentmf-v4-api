package org.opentmf.tmf704.model;


/**
 * A managed test suite resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, testSuiteDefinition, version<br/>
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
public interface ITestSuiteCreate extends ITestSuiteUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
