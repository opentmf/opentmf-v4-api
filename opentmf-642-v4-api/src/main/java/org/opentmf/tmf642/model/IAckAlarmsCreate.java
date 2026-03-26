package org.opentmf.tmf642.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAlarm;
import org.opentmf.common.model.IExtensible;

/**
 * Task resource for the acknowledge alarms operation
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> ackSystemId, ackUserId, alarmPattern<br/>
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
public interface IAckAlarmsCreate extends IExtensible {

  /**
   * Name of the acknowledging system.
   */
  String getAckSystemId();

  /**
   * Time of the acknowledgement.
   */
  OffsetDateTime getAckTime();

  /**
   * Name of the acknowledging user.
   */
  String getAckUserId();

  /**
   * The successfully acknowledged alarms.
   */
  List<? extends IAlarmRefOrValue> getAckedAlarms();

  /**
   * Alarm patterns to match target alarms. An alarm will match if all of the
   * sttributes in any of the patterns compare equal to those attributes of the
   * alarm.
   */
  List<? extends IAlarm> getAlarmPatterns();

  /**
   * Current state of the operation task.
   */
  String getState();
}
