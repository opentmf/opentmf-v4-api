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
public interface IOrganizationStateChangeEventPayload {

  /**
   * Organization represents a group of people identified by shared interests or
   * purpose. Examples include business, department and enterprise. Because of the
   * complex nature of many businesses, both organizations and organization units
   * are represented by the same data.
   */
  IOrganization getOrganization();
}
