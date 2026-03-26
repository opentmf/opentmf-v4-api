package org.opentmf.tmf621.model;

/**
 * The event data structure.
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
public interface ITroubleTicketAttributeValueChangeEventPayload {

  /**
   * A trouble ticket is a record of an issue that is created, tracked, and
   * managed by a trouble ticket management system.
   */
  ITroubleTicket getTroubleTicket();
}
