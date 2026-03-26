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
public interface IDiagnoseIncidentStateChangeEventPayload {

  /**
   * A stage in the incident lifecycle. The purpose of diagnosis is to identify a
   * workaround for an incident (ITIL Service Operation). 
   * <br/>Diagnosing Incidents by Incident SN.
   */
  IDiagnoseIncident getDiagnoseIncident();
}
