package org.opentmf.general.model;

import java.util.List;

/**
 * The base for all Test Execution resources.
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentProvisioningExecution<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-707: Test Result Management API</li>
 *   <li>TMF-708: Test Execution Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestExecution extends IExecution {

  /**
   * List of: A reference to a managed test data instance resource.
   */
  List<? extends ITestDataInstanceRef> getTestDataInstances();

  /**
   * REST resource for test environment provisioning lifecycle.
   */
  ITestEnvironmentProvisioningExecution getTestEnvironmentProvisioningExecution();
}
