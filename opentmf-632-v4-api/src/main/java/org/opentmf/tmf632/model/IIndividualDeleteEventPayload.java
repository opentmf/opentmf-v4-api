package org.opentmf.tmf632.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIndividualDeleteEventPayload {

  /**
   * Individual represents a single human being (a man, woman or child). The
   * individual can be a customer, an employee or any other person that the
   * organization needs to store information about.
   */
  IIndividual getIndividual();
}
