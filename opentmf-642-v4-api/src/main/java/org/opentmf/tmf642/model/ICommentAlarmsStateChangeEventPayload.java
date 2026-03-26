package org.opentmf.tmf642.model;

/**
 * The event data structure.
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
public interface ICommentAlarmsStateChangeEventPayload {

  /**
   * Task resource for comment alarms operation.
   */
  ICommentAlarms getCommentAlarms();
}
