package org.opentmf.tmf657.model;

import org.opentmf.common.model.ITimePeriod;

/**
 * Service level objectives are defined in terms of parameters and metrics,
 * thresholds, and tolerances 
 * <br/>associated with the parameters.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> conformanceComparator, conformanceTarget, serviceLevelObjectiveParameter<br/>
 * </p>
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
public interface IServiceLevelObjectiveCreate extends IServiceLevelObjectiveUpdate {

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
