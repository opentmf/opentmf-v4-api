package org.opentmf.tmf724.model;

import java.net.URI;

/**
 * A stage in the incident lifecycle. The purpose of diagnosis is to identify a
 * workaround for an incident (ITIL Service Operation). 
 * <br/>Diagnosing Incidents by Incident SN.
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
public interface IDiagnoseIncident extends IDiagnoseIncidentCreate {

  /**
   * Reference of the diagnose incident task.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
