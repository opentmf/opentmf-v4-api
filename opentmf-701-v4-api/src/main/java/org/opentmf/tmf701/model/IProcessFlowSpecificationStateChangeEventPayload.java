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
public interface IProcessFlowSpecificationStateChangeEventPayload {

  /**
   * ProcessFlowSpecification is a class that allow to describe a processFlow
   * design. A ProcessFlow instance as used in TMF701 will use a
   * ProcessFlowSpecification as reference.
   */
  IProcessFlowSpecification getProcessFlowSpecification();
}
