package org.opentmf.tmf657.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Some consequences for the provider of the Service are resulted when the
 * service level objective
 * <br/>does not meet.
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
public interface IServiceLevelSpecConsequence extends IExtensible {

  /**
   * Recommended remedy for a violated Service Level Objective. 
   * <br/>This could be a hyperlink to the recommended action.
   */
  String getPrescribedAction();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
