package org.opentmf.tmf642.model;

import java.net.URI;

/**
 * Task resource for the acknowledge alarms operation.
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
public interface IAckAlarms extends IAckAlarmsCreate {

  /**
   * A reference to the task.
   */
  URI getHref();

  /**
   * The identifier of the task.
   */
  String getId();
}
