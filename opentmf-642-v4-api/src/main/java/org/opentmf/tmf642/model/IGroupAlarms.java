package org.opentmf.tmf642.model;

import java.net.URI;

/**
 * Task resource for group alarms operation.
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
public interface IGroupAlarms extends IGroupAlarmsCreate {

  /**
   * A reference to the task.
   */
  URI getHref();

  /**
   * The identifier of the task.
   */
  String getId();
}
