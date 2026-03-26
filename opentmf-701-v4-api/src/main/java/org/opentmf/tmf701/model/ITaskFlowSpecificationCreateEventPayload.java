package org.opentmf.tmf701.model;

/**
 * The event data structure.
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
public interface ITaskFlowSpecificationCreateEventPayload {

  /**
   * TaskFlowSpecification is a class that allow to describe a TaskFlow
   * specification design. A TaskFlow instance as used in TMF701 will use a
   * TaskFlowSpecification as reference.
   */
  ITaskFlowSpecification getTaskFlowSpecification();
}
