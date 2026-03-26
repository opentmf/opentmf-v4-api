package org.opentmf.tmf704.model;


/**
 * A managed test case resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, testCaseDefinition, version<br/>
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
public interface ITestCaseCreate extends ITestCaseUpdate {

  /**
   * The artifact version.
   */
  String getVersion();
}
