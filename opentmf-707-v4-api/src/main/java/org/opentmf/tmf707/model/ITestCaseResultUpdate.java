package org.opentmf.tmf707.model;

import org.opentmf.common.model.IExtensible;

/**
 * A managed test case result resource
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> testCaseResultDefinition, testExecution<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-707: Test Result Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestCaseResultUpdate extends IExtensible {

  /**
   * Test case result definition.
   */
  ITestCaseResultDefinition getTestCaseResultDefinition();

  ITestCaseExecutionRefOrValue getTestExecution();
}
