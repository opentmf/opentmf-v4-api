package org.opentmf.tmf646.model;

import java.time.OffsetDateTime;

/**
 * An Appointment is an arrangement to do something or meet someone at a
 * particular time, at a place (for face to face appointment) or in a contact
 * medium (for phone appointment).
 * <br/>Skipped properties: id,href,creationDate.
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
public interface IAppointmentUpdate extends IAppointmentCreate {

  /**
   * Date of last appointment update.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Valid values for the lifecycle state of the appointment
   * <br/><p>Recommended values: initialized, confirmed, cancelled, completed,
   * failed.
   */
  String getStatus();
}
