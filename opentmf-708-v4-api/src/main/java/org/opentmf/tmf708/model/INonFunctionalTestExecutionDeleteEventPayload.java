package org.opentmf.tmf708.model;

import org.opentmf.general.model.INonFunctionalTestExecution;

/**
 * The event data structure.
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
public interface INonFunctionalTestExecutionDeleteEventPayload {

  /**
   * REST resource for the non-functional test execution lifecycle.
   */
  INonFunctionalTestExecution getNonFunctionalTestExecution();
}
