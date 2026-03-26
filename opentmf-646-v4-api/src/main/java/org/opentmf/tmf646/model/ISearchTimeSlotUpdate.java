package org.opentmf.tmf646.model;

import java.util.List;
import org.opentmf.common.model.ITimeSlot;

/**
 * This task resource is used to retrieve available time slots. One of this
 * available time slot is after used to create or reschedule an appointment
 * <br/>Skipped properties: id,href,searchDate,searchResult.
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
public interface ISearchTimeSlotUpdate extends ISearchTimeSlotCreate {

  List<? extends ITimeSlot> getAvailableTimeSlots();

  /**
   * Valid values for the lifecycle state of the searchTimeSlot
   * <br/><p>Recommended values: inProgress, done, rejected, terminatedWithError.
   */
  String getStatus();
}
