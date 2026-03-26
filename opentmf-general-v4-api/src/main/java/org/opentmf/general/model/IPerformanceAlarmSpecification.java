package org.opentmf.general.model;


/**
 * The specification of how to populate the alarm fields when generating a
 * threshold crossing alarm.
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
public interface IPerformanceAlarmSpecification {

  String getPerfAlarmSpecAdditionalText();

  String getPerfAlarmSpecAlarmType();

  String getPerfAlarmSpecProbableCause();

  /**
   * This datatype lists the possible severities that can be allocated to a Alarm.
   * The values are consistent with ITU-T Recommendation X.733. This specification
   * does not recommend the use of indeterminate.
   * <br/><p>Recommended values: CRITICAL, MAJOR, MINOR, WARNING, INDETERMINATE,
   * CLEARED.
   */
  String getPerfAlarmSpecSeverity();

  String getPerfAlarmSpecSpecificProblem();

  String getPerfAlarmThresholdCrossingDescription();

  /**
   * A Consequence can be applied as a result of a threshold crossing or a
   * threshold ceasing to be crossed.
   */
  IPerformanceConsequence getPerformanceConsequence();
}
