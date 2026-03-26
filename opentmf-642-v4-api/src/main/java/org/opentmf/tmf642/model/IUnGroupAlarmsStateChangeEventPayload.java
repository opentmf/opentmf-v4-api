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
public interface IUnGroupAlarmsStateChangeEventPayload {

  /**
   * Task resource for ungroup alarms operation.
   */
  IUnGroupAlarms getUnGroupAlarms();
}
