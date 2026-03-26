package org.opentmf.tmf707.model;

import org.opentmf.common.model.IEntity;

/**
 * A managed non-functional test result resource.
 *
 * <p><br/>
 * <strong>Required:</strong> nonFunctionalTestResultDefinition, testExecution<br/>
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
public interface INonFunctionalTestResult extends IEntity {

  /**
   * Non-functional test result definition.
   */
  INonFunctionalTestResultDefinition getNonFunctionalTestResultDefinition();

  INonFunctionalTestExecutionRefOrValue getTestExecution();
}
