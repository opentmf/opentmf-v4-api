package org.opentmf.tmf657.model;

/**
 * The event data structure.
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
public interface IServiceLevelObjectiveAttributeValueChangeEventPayload {

  /**
   * Service level objectives are defined in terms of parameters and metrics,
   * thresholds, and tolerances 
   * <br/>associated with the parameters.
   */
  IServiceLevelObjective getServiceLevelObjective();
}
