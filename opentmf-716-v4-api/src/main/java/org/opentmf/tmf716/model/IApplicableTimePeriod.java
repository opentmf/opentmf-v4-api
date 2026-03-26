package org.opentmf.tmf716.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * The period of time for which Capacity or CapacityDemand applies.
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
public interface IApplicableTimePeriod extends IExtensible {

  /**
   * A day or days representing when the schedule is applicable. For example 2, 3
   * represent Monday and Tuesday.
   */
  String getDayOfWeek();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getFromToDateTime();

  /**
   * An indicator that specifies the inclusion or exclusion of the from and to
   * DateTime attributes. 
   * <br/>Possible values are "open", "closed", "closedBottom" and "closedTop".
   */
  String getRangeInterval();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
