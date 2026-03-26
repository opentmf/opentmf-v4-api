package org.opentmf.tmf704.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-704: Test Case Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface INonFunctionalTestModelStateChangeEventPayload {

  /**
   * A managed non-functional test model resource.
   */
  INonFunctionalTestModel getNonFunctionalTestModel();
}
