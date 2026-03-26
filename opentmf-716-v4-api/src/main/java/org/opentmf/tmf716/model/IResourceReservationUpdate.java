package org.opentmf.tmf716.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedPartyRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceReservationUpdate extends IExtensible {

  /**
   * Date when the reservation is cancelled.
   */
  String getCancellationDate();

  /**
   * Reason why the reservation is cancelled.
   */
  String getCancellationReason();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  /**
   * Date when the reservation was completed.
   */
  String getCompletionDate();

  /**
   * Date when the reservation was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * A string. free-text description of the reservation.
   */
  String getDescription();

  /**
   * Expected completion date amended by the provider.
   */
  String getExpectedCompletionDate();

  /**
   * List of: A reference to an entity, where the type of the entity is not known
   * in advance.
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * List of: RelatedParty reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedPartyRef> getRelatedParties();

  /**
   * Requested completion date from the requester perspective.
   */
  String getRequestedCompletionDate();

  /**
   * Reservation fulfillment start date wished by the requester. This is used
   * when, for any reason, requester cannot allow the reservation to begin before
   * a specific date.
   */
  String getRequestedStartDate();

  List<? extends IResourceReservationItem> getReservationItems();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getReservationPeriod();

  /**
   * Recommended values: acknowledged, rejected, pending, held, inProgress,
   * cancelled, completed, failed, partial, assessingCancellation,
   * pendingCancellation.
   */
  String getState();

  /**
   * The date and time the state changed.
   */
  OffsetDateTime getStateChangeDate();

  /**
   * The reason for changing the state.
   */
  String getStateChangeReason();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
