package org.opentmf.tmf915.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;
import org.opentmf.general.model.IConsequence;
import org.opentmf.general.model.IPerformanceAlarmSpecification;

/**
 * A threshold rule that is based on explicit definition of attributes that
 * represent a Boolean expression.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISimpleThresholdRule extends INamedEntity {

  /**
   * An operator that when applied on a value (of conformanceTargetLower)
   * specifies whether a Performance threshold rule is crossed or ceased to be
   * crossed.
   */
  Integer getConformanceComparatorLower();

  /**
   * An operator that when applied on a value (of conformanceTargetUpper)
   * specifies whether a Performance threshold rule is crossed or ceased to be
   * crossed.
   */
  String getConformanceComparatorUpper();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getConformancePeriod();

  /**
   * A value used to determine if the Performance threshold is crossed or ceased
   * to be crossed, serving as an lower value.
   */
  Integer getConformanceTargetLower();

  /**
   * A value used to determine if the Performance threshold is crossed or ceased
   * to be crossed, serving as an upper value.
   */
  Integer getConformanceTargetUpper();

  /**
   * A threshold crossing or a threshold ceased to be crossing results in a
   * Performance consequence.
   */
  List<? extends IConsequence> getConsequences();

  /**
   * The number of times an objective can remain un-updated in reference to the
   * conformancePeriod without a Performance threshold Consequence being
   * initiated.
   */
  Integer getGracePeriods();

  /**
   * A counter/KPI to be used by the threshold rule.
   */
  IMeasurement getMeasurement();

  /**
   * A specific description of the threshold crossing (intended to be populated e
   * under the alarm under CrossedThreshold structure).
   */
  String getPerfAlarmSpecThresholdCrossingDescription();

  /**
   * The specification of how to populate the alarm fields when generating a
   * threshold crossing alarm.
   */
  IPerformanceAlarmSpecification getPerformanceAlarmSpecification();

  /**
   * A concrete threshold may have two possible values: \"Raise\" - a threshold
   * was crossed or \"Clear\" - a threshold ceased crossing.
   */
  String getThresholdRuleCondition();

  /**
   * A word, term, or phrase by which a Performance threshold rule is known and
   * distinguished from other threshold rules.
   */
  String getThresholdRuleName();

  /**
   * A threshold can be generated in different severity levels. A crossing for
   * each level may require a different condition and possibly trigger a different
   * consequence. The supported severity levels are equivalent to the possible
   * severity level of alarms.
   */
  String getThresholdRuleSeverity();

  /**
   * A percent that is used to specify when a warning should be used that
   * indicates a Performance threshold is in danger of not being met.
   */
  Integer getThresholdTarget();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getTolerancePeriod();
}
