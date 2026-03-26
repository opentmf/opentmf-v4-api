package org.opentmf.tmf621.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and
 * managed by a trouble ticket management system
 * <br/>Skipped properties:
 * id,href,creationDate,lastUpdate,statusChange,statusChangeDate.
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
public interface ITroubleTicketUpdate extends IExtensible {

  /**
   * File(s) attached to the trouble ticket. e.g. pictur of broken device, scaning
   * of a bill or charge.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

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
   * Name of the trouble ticket, typically a short description provided by the
   * user that create the ticket.
   */
  String getName();

  /**
   * The note(s) that are associated to the ticket.
   */
  List<? extends INote> getNotes();

  /**
   * The priority of the trouble ticket and how quickly the issue should be
   * resolved. Example: Critical, High, Medium, Low. The value is set by the
   * ticket management system considering the severity, ticket type etc...
   */
  String getPriority();

  /**
   * An entity that is related to the ticket such as a bill, a product, etc. The
   * entity against which the ticket is associated.
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * The related party(ies) that are associated to the ticket.
   */
  List<? extends IRelatedParty> getRelatedParties();

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
   * The reason for changing the status.
   */
  String getStatusChangeReason();

  /**
   * represent a business type of the trouble ticket e.g. incident, complain,
   * request.
   */
  String getTicketType();

  /**
   * A list of trouble ticket relationships (TroubleTicketRelationship [*]).
   * Represents a relationship between trouble tickets.
   */
  List<? extends ITroubleTicketRelationship> getTroubleTicketRelationships();
}
