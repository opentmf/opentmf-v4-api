package org.opentmf.general.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * REST resource for the test suite execution lifecycle
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentProvisioningExecution<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-708: Test Execution Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestSuiteExecutionCreate extends IExtensible {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Data correlation ID passed in by the API consumer.
   */
  String getDataCorrelationId();

  /**
   * List of: A reference to a managed general test artifact resource.
   */
  List<? extends IGeneralTestArtifactRef> getGeneralTestArtifacts();

  /**
   * Name of the related entity.
   */
  String getName();

  /**
   * Possible values for the state of the execution
   * <br/><p>Recommended values: acknowledged, rejected, pending, inProgress,
   * cancelled, completed, failed.
   */
  String getState();

  /**
   * List of: A reference to a managed test data instance resource.
   */
  List<? extends ITestDataInstanceRef> getTestDataInstances();

  /**
   * REST resource for test environment provisioning lifecycle.
   */
  ITestEnvironmentProvisioningExecution getTestEnvironmentProvisioningExecution();

  /**
   * A reference to a managed test suite resource.
   */
  ITestSuiteRef getTestSuite();
}
