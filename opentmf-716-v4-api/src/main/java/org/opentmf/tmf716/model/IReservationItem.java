package org.opentmf.tmf716.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedPartyRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * An identified part of the reservation. A reservation is decomposed into one
 * or more reservation items.
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
public interface IReservationItem extends IExtensible {

  /**
   * action to be performed on the entity
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getAction();

  /**
   * Specific ability of an entity measured in quantity and units of quantity over
   * an extended period.
   */
  ICapacity getAppliedCapacity();

  /**
   * Specific ability of an entity measured in quantity and units of quantity over
   * an extended period.
   */
  ICapacity getCapacityDemand();

  /**
   * A string. Identifier of the item.
   */
  String getId();

  Integer getQuantity();

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
