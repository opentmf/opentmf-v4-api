package org.opentmf.tmf724.model;

import org.opentmf.common.model.IExtensible;

/**
 * A stage in the incident lifecycle. The purpose of diagnosis is to identify a
 * workaround for an incident (ITIL Service Operation). 
 * <br/>Diagnosing Incidents by Incident SN
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> incident<br/>
 * </p>
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
public interface IDiagnoseIncidentCreate extends IExtensible {

  /**
   * Reason for failure.
   */
  String getErrorLog();

  /**
   * Incident reference.
   */
  IIncidentRef getIncident();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
