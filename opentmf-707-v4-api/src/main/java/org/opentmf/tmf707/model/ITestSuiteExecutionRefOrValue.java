package org.opentmf.tmf707.model;

import org.opentmf.general.model.ITestExecution;
import org.opentmf.general.model.ITestSuiteRef;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentProvisioningExecution<br/>
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
public interface ITestSuiteExecutionRefOrValue extends ITestExecution {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Name of the related entity.
   */
  String getName();

  /**
   * A reference to a managed test suite resource.
   */
  ITestSuiteRef getTestSuite();
}
