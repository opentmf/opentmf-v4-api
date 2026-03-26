package org.opentmf.tmf646.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * This task resource is used to retrieve available time slots. One of this
 * available time slot is after used to create or reschedule an appointment.
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
public interface ISearchTimeSlot extends ISearchTimeSlotUpdate {

  /**
   * Reference to access the search time slot resource.
   */
  URI getHref();

  /**
   * Unique identifier of the search time slot request.
   */
  String getId();

  /**
   * Date when the search time slot is performed.
   */
  OffsetDateTime getSearchDate();

  /**
   * Result of the search time slot (success or fail for example).
   */
  String getSearchResult();
}
