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
public interface IResolveIncidentCreateEventPayload {

  /**
   * An incident resolution is an action taken to resolve/repair the root cause of
   * an incident or problem, or to implement a workaround.
   */
  IResolveIncident getResolveIncident();
}
