package org.opentmf.tmf646.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * An Appointment is an arrangement to do something or meet someone at a
 * particular time, at a place (for face to face appointment) or in a contact
 * medium (for phone appointment).
 *
 * <p><br/>
 * <strong>Required:</strong> validFor<br/>
 * </p>
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
public interface IAppointment extends IAppointmentUpdate {

  /**
   * Appointment creation date.
   */
  OffsetDateTime getCreationDate();

  /**
   * Unique URI used to access to the appointment resource.
   */
  URI getHref();

  /**
   * Unique identifier of the appointment.
   */
  String getId();
}
