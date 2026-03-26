package org.opentmf.tmf716.model;

import org.opentmf.common.model.IEntity;

/**
 * A Cancel Reservation is a type of task which can be used to place a request
 * to cancel a reservation.
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
public interface ICancelReservation extends IEntity {

  /**
   * Reason why the reservation is cancelled.
   */
  String getCancellationReason();

  /**
   * Date when the reservation is cancelled.
   */
  String getEffectiveCancellationDate();

  /**
   * Date when the submitter wants the reservation to be cancelled.
   */
  String getRequestedCancellationDate();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
