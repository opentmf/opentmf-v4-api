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
public interface IAppointmentAttributeValueChangeEventPayload {

  /**
   * An Appointment is an arrangement to do something or meet someone at a
   * particular time, at a place (for face to face appointment) or in a contact
   * medium (for phone appointment).
   */
  IAppointment getAppointment();
}
