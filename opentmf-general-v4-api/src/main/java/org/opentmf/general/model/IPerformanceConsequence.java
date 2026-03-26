package org.opentmf.general.model;

/**
 * A Consequence can be applied as a result of a threshold crossing or a
 * threshold ceasing to be crossed.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPerformanceConsequence extends IConsequence {

  /**
   * The specification of how to populate the alarm fields when generating a
   * threshold crossing alarm.
   */
  IPerformanceAlarmSpecification getAlarmSpecification();
}
