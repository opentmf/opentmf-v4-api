package org.opentmf.tmf657.model;

import java.net.URI;

/**
 * Service level objectives are defined in terms of parameters and metrics,
 * thresholds, and tolerances 
 * <br/>associated with the parameters.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-657: Service Quality Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceLevelObjective extends IServiceLevelObjectiveCreate {

  /**
   * The hyperlink to access a service level objective.
   */
  URI getHref();

  /**
   * The identifier of a service level objectives.
   */
  String getId();
}
