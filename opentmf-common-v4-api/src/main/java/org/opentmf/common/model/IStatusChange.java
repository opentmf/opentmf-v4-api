package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Holds the status notification reasons and associated date the status changed,
 * populated by the server.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-621: Trouble Ticket Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IStatusChange extends IEntity {

  /**
   * The date and time the status changed.
   */
  OffsetDateTime getChangeDate();

  /**
   * The reason why the status changed.
   */
  String getChangeReason();

  /**
   * The status of the trouble ticket.
   */
  String getStatus();
}
