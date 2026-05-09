package org.opentmf.general.model;

import java.net.URI;

/**
 * REST resource for test environment allocation lifecycle.
 *
 * <p><br/>
 * <strong>Required:</strong> resourceManagerUrl<br/>
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
public interface ITestEnvironmentAllocationExecution extends ITestEnvironmentAllocationExecutionCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
