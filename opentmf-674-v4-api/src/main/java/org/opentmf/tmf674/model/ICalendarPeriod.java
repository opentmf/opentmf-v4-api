package org.opentmf.tmf674.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-674: Geographic Site Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICalendarPeriod extends IExtensible {

  /**
   * Days when the calendar status applies (e.g.: monday, mon-to-fri, weekdays,
   * weekend, all week, ...).
   */
  String getDay();

  List<? extends IHourPeriod> getHourPeriods();

  /**
   * Indication of the availability of the site (e.g.: open).
   */
  String getStatus();

  /**
   * Indication of the timezone applicable to the calendar information (e.g.:
   * Paris, GMT+1).
   */
  String getTimeZone();
}
