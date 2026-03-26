package org.opentmf.tmf649.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * The schedule definition for running jobs.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IScheduleDefinition extends IExtensible {

  IMonthlyScheduleDayOfWeekDefinition getMonthlyScheduleDayOfWeekDefinition();

  /**
   * The weekly schedule is used to define a schedule that is based on the days of
   * the week, e.g. a schedule that will be active only on Monday and Tuesday.
   */
  List<? extends IDayOfWeekRecurrence> getWeeklyScheduledDefinitions();

  /**
   * A recurring frequency to run a job within day that is included in schedule
   * definition, for example: every 5 minutes, 15 minute, 30 minutes, 1 hour.
   */
  String getRecurringFrequency();

  /**
   * The Endtime of the Schedule Definition. If the attribute is empty the
   * Schedule run forever, not having a time constraint.
   */
  OffsetDateTime getScheduleDefinitionEndTime();

  /**
   * A list of time ranges within a specific day that the schedule will be active
   * on, for example 08:00-12:00, 16:00-19:00.
   */
  String getScheduleDefinitionHourRange();

  /**
   * The Start time of the Schedule Definition.
   */
  OffsetDateTime getScheduleDefinitionStartTime();
}
