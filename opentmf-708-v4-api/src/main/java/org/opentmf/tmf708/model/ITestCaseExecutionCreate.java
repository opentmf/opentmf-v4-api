package org.opentmf.tmf708.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.general.model.IGeneralTestArtifactRef;
import org.opentmf.general.model.ITestCaseRef;
import org.opentmf.general.model.ITestDataInstanceRef;
import org.opentmf.general.model.ITestEnvironmentProvisioningExecution;

/**
 * REST resource for the test case execution lifecycle
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
public interface ITestCaseExecutionCreate extends IExtensible {

  /**
   * Data correlation ID passed in by the API consumer.
   */
  String getDataCorrelationId();

  /**
   * List of: A reference to a managed general test artifact resource.
   */
  List<? extends IGeneralTestArtifactRef> getGeneralTestArtifacts();

  /**
   * Possible values for the state of the execution
   * <br/><p>Recommended values: acknowledged, rejected, pending, inProgress,
   * cancelled, completed, failed.
   */
  String getState();

  /**
   * A reference to a managed test case artifact.
   */
  ITestCaseRef getTestCase();

  /**
   * List of: A reference to a managed test data instance resource.
   */
  List<? extends ITestDataInstanceRef> getTestDataInstances();

  /**
   * REST resource for test environment provisioning lifecycle.
   */
  ITestEnvironmentProvisioningExecution getTestEnvironmentProvisioningExecution();
}
