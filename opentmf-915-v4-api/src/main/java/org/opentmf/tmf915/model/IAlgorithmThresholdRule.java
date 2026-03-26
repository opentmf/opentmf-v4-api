package org.opentmf.tmf915.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.general.model.IConsequence;
import org.opentmf.general.model.IPerformanceAlarmSpecification;

/**
 * A threshold rule that is a reference to an algorithm.
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
public interface IAlgorithmThresholdRule extends INamedEntity {

  List<? extends IAlgorithmParams> getAlgorithmParamses();

  String getAlgorithmRef();

  /**
   * A threshold crossing or a threshold ceased to be crossing results in a
   * Performance consequence.
   */
  List<? extends IConsequence> getConsequences();

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
}
