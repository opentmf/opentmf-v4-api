package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IStatusChange;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and
 * managed by a trouble ticket management system.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360TroubleTicketVO extends INamedEntity {

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  /**
   * The date on which the trouble ticket was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * Description of the trouble or issue.
   */
  String getDescription();

  /**
   * The expected resolution date determined by the trouble ticket system.
   */
  OffsetDateTime getExpectedResolutionDate();

  /**
   * Additional identifier coming from an external system.
   */
  String getExternalId();

  /**
   * The date and time that the trouble ticked was last updated.
   */
  OffsetDateTime getLastUpdate();

  /**
   * The priority of the trouble ticket and how quickly the issue should be
   * resolved. Example: Critical, High, Medium, Low. The value is set by the
   * ticket management system considering the severity, ticket type etc...
   */
  String getPriority();

  /**
   * The resolution date requested by the user.
   */
  OffsetDateTime getRequestedResolutionDate();

  /**
   * The date and time the trouble ticket was resolved.
   */
  OffsetDateTime getResolutionDate();

  /**
   * The severity of the issue. Indicate the implication of the issue on the
   * expected functionality e.g. of a system, application, service etc.. 
   * <br/>Severity values can be for example : Critical, Major, Minor.
   */
  String getSeverity();

  /**
   * Possible values for the status of the trouble ticket
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, closed, resolved.
   */
  String getStatus();

  /**
   * The status change history that are associated to the ticket.Populated by the
   * server.
   */
  List<? extends IStatusChange> getStatusChanges();

  /**
   * The date and time the status changed.
   */
  OffsetDateTime getStatusChangeDate();

  /**
   * The reason for changing the status.
   */
  String getStatusChangeReason();

  /**
   * represent a business type of the trouble ticket e.g. incident, complain,
   * request.
   */
  String getTicketType();
}
