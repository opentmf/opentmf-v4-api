package org.opentmf.tmf621.model;

import org.opentmf.common.model.INamedEntity;

/**
 * Represents a relationship between trouble Trouble Tickets.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-621: Trouble Ticket Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITroubleTicketRelationship extends INamedEntity {

  /**
   * Type of the Trouble Ticket relationship can be isChiled, dependent etc...
   */
  String getRelationshipType();
}
