package org.opentmf.tmf716.model;

import org.opentmf.common.model.IExtensible;

/**
 * Skipped properties: id,href,state,effectiveCancellationDate.
 *
 * <p><br/>
 * <strong>Required:</strong> resourceReservation<br/>
 * </p>
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
public interface ICancelResourceReservationCreate extends IExtensible {

  /**
   * Reason why the reservation is cancelled.
   */
  String getCancellationReason();

  /**
   * Date when the submitter wants the reservation to be cancelled.
   */
  String getRequestedCancellationDate();

  IResourceReservationRef getResourceReservation();
}
