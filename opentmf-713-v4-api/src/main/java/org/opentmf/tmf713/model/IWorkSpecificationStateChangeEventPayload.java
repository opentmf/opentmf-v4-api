package org.opentmf.tmf713.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkSpecificationStateChangeEventPayload {

  /**
   * Definition of the nature of a Work Unit. For example, could be wiring,
   * equipment installation, etc.
   */
  IWorkSpecification getWorkSpecification();
}
