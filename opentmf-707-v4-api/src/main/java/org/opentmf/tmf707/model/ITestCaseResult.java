package org.opentmf.tmf707.model;

import org.opentmf.common.model.IEntity;

/**
 * A managed test case result resource.
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
public interface ITestCaseResult extends IEntity {

  /**
   * Test case result definition.
   */
  ITestCaseResultDefinition getTestCaseResultDefinition();

  ITestCaseExecutionRefOrValue getTestExecution();
}
