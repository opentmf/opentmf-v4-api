package org.opentmf.tmf706.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-706: Test Data Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestDataInstanceChangeEventPayload {

  /**
   * A managed test data instance resource.
   */
  ITestDataInstance getTestDataInstance();
}
