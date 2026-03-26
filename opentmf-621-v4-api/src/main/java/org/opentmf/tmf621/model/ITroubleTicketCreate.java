package org.opentmf.tmf621.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IStatusChange;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and
 * managed by a trouble ticket management system
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, severity, ticketType<br/>
 * </p>
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
public interface ITroubleTicketCreate extends ITroubleTicketUpdate {

  /**
   * The date on which the trouble ticket was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * The date and time that the trouble ticked was last updated.
   */
  OffsetDateTime getLastUpdate();

  /**
   * The status change history that are associated to the ticket.Populated by the
   * server.
   */
  List<? extends IStatusChange> getStatusChanges();

  /**
   * The date and time the status changed.
   */
  OffsetDateTime getStatusChangeDate();
}
