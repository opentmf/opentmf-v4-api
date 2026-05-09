package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.ICalendarEventRef;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.ITimePeriod;

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
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360AppointmentVO extends IEntity {

  /**
   * Reference of a CalendarEvent.
   */
  ICalendarEventRef getCalendarEvent();

  /**
   * Business category : intervention for example or to be more precise after
   * SalesIntervention, orderDeliveryIntervention,...
   */
  String getCategory();

  /**
   * Appointment creation date.
   */
  OffsetDateTime getCreationDate();

  /**
   * Short free text describing the appointment.
   */
  String getDescription();

  /**
   * External reference known by the customer.
   */
  String getExternalId();

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

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
