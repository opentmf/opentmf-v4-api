package org.opentmf.tmf646.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-646: Appointment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISearchTimeSlotStateChangeEventPayload {

  /**
   * This task resource is used to retrieve available time slots. One of this
   * available time slot is after used to create or reschedule an appointment.
   */
  ISearchTimeSlot getSearchTimeSlot();
}
