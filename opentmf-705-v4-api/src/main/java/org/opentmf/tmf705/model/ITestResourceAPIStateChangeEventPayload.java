package org.opentmf.tmf705.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-705: Test Environment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestResourceAPIStateChangeEventPayload {

  /**
   * A managed test resource API resource.
   */
  ITestResourceAPI getTestResourceAPI();
}
