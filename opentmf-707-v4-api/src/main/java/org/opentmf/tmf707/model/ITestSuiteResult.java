package org.opentmf.tmf707.model;

import org.opentmf.common.model.IEntity;

/**
 * A managed test case result resource.
 *
 * <p><br/>
 * <strong>Required:</strong> testExecution, testSuiteResultDefinition<br/>
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
public interface ITestSuiteResult extends IEntity {

  ITestSuiteExecutionRefOrValue getTestExecution();

  /**
   * Test suite result definition.
   */
  ITestSuiteResultDefinition getTestSuiteResultDefinition();
}
