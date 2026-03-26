package org.opentmf.tmf621.model;

import java.net.URI;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and
 * managed by a trouble ticket management system.
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
public interface ITroubleTicket extends ITroubleTicketCreate {

  /**
   * Hyperlink, a reference to the trouble ticket entity.
   */
  URI getHref();

  /**
   * Unique identifier of the trouble ticket.
   */
  String getId();
}
