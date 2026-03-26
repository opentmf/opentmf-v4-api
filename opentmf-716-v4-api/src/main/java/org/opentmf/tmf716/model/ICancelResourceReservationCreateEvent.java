package org.opentmf.tmf716.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
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
public interface ICancelResourceReservationCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ICancelResourceReservationCreateEventPayload getEvent();
}
