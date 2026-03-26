package org.opentmf.tmf724.model;


/**
 * An incident resolution is an action taken to resolve/repair the root cause of
 * an incident or problem, or to implement a workaround
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
public interface IResolveIncidentCreate extends IDiagnoseIncidentCreate {

  /**
   * The clear time of the incident, for example 2020-03-10T04:01:12Z.
   */
  String getClearTime();
}
