package org.opentmf.tmf708.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.general.model.IGeneralTestArtifactRef;
import org.opentmf.general.model.IProvisioningArtifactRef;
import org.opentmf.general.model.ITestEnvironmentAllocationExecution;

/**
 * REST resource for test environment provisioning lifecycle
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentAllocationExecution<br/>
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
public interface ITestEnvironmentProvisioningExecutionCreate extends IExtensible {

  /**
   * Data correlation ID passed in by the API consumer.
   */
  String getDataCorrelationId();

  /**
   * List of: A reference to a managed general test artifact resource.
   */
  List<? extends IGeneralTestArtifactRef> getGeneralTestArtifacts();

  /**
   * List of: A reference to a managed provisioning artifact resource.
   */
  List<? extends IProvisioningArtifactRef> getProvisioningArtifacts();

  /**
   * Possible values for the state of the execution
   * <br/><p>Recommended values: acknowledged, rejected, pending, inProgress,
   * cancelled, completed, failed.
   */
  String getState();

  /**
   * REST resource for test environment allocation lifecycle.
   */
  ITestEnvironmentAllocationExecution getTestEnvironmentAllocationExecution();
}
