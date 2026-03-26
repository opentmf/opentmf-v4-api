package org.opentmf.tmf642.model;

import java.util.List;
import org.opentmf.common.model.IAlarm;
import org.opentmf.common.model.IComment;
import org.opentmf.common.model.IExtensible;

/**
 * Task resource for comment alarms operation
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> alarmPattern, comment<br/>
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
public interface ICommentAlarmsCreate extends IExtensible {

  /**
   * Alarm patterns to match target alarms. An alarm will match if all of the
   * sttributes in any of the patterns compare equal to those attributes of the
   * alarm.
   */
  List<? extends IAlarm> getAlarmPatterns();

  /**
   * Indicates the comments entered on the alarm.
   */
  IComment getComment();

  /**
   * The successfully commented alarms.
   */
  List<? extends IAlarmRefOrValue> getCommentedAlarms();

  /**
   * Current state of the operation task.
   */
  String getState();
}
