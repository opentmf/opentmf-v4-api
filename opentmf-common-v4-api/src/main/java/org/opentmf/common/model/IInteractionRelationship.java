package org.opentmf.common.model;


/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-683: Party Interaction Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IInteractionRelationship extends IEntity {

  /**
   * Type of the interaction relationship.
   */
  String getRelationshipType();
}
