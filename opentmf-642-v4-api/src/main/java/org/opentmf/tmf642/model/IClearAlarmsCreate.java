package org.opentmf.tmf642.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAlarm;
import org.opentmf.common.model.IExtensible;

/**
 * Task resource for clear alarms operation
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> alarmClearedTime, alarmPattern, clearSystemId, clearUserId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IClearAlarmsCreate extends IExtensible {

  /**
   * Time of the alarm clearing.
   */
  OffsetDateTime getAlarmClearedTime();

  /**
   * Alarm patterns to match target alarms. An alarm will match if all of the
   * sttributes in any of the patterns compare equal to those attributes of the
   * alarm.
   */
  List<? extends IAlarm> getAlarmPatterns();

  /**
   * Name of the clearing system.
   */
  String getClearSystemId();

  /**
   * Name of the clearing user.
   */
  String getClearUserId();

  /**
   * The successfully cleared alarms.
   */
  List<? extends IAlarmRefOrValue> getClearedAlarms();

  /**
   * Current state of the operation task.
   */
  String getState();
}
