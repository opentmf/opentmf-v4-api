package org.opentmf.tmf701.model;

import java.net.URI;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-701: Process Flow Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITaskFlow extends ITaskFlowCreate {

  /**
   * TaskFlow completion method.
   */
  String getCompletionMethod();

  /**
   * Reference of the taskFlow.
   */
  URI getHref();

  /**
   * Identifier of the taskFlow.
   */
  String getId();

  /**
   * Indicate mandatory TaskFlow.
   */
  Boolean getIsMandatory();

  /**
   * TaskFlow priority.
   */
  Integer getPriority();

  /**
   * Valid values for the lifecycle state of the taskFlow
   * <br/><p>Recommended values: new, active, hold, cancelled, completed.
   */
  String getState();
}
