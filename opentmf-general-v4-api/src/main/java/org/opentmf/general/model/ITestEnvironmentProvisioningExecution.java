package org.opentmf.general.model;

import java.net.URI;

/**
 * REST resource for test environment provisioning lifecycle.
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentAllocationExecution<br/>
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
public interface ITestEnvironmentProvisioningExecution extends ITestEnvironmentProvisioningExecutionCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
