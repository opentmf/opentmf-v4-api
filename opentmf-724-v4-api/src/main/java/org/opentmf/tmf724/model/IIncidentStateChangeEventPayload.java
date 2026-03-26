package org.opentmf.tmf724.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-724: Incident Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIncidentStateChangeEventPayload {

  /**
   * An Incident is a record of an event that has altered the operational state of
   * a entity (Resource, Service or Customers Product). An incident represents an
   * issue that needs to be diagnosed and resolved.
   */
  IIncident getIncident();
}
