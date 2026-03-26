package org.opentmf.tmf653.model;

import org.opentmf.common.model.IExtensible;

/**
 * An Applied Consequence defines the action (prescribed action or notification)
 * to take when a 
 * <br/>MeasureThresholdRuleViolation occurs.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAppliedConsequence extends IExtensible {

  /**
   * The action for a violated threshold. This could be a hyperlink to 
   * <br/>the action.
   */
  String getAppliedAction();

  /**
   * A narrative that explains in detail what the consequence is.
   */
  String getDescription();

  /**
   * A word, term, or phrase by which Consequence is known and 
   * <br/>distinguished from other MetricDefMeasureConsequences.
   */
  String getName();

  /**
   * An indicator used to specify that a consequence should cease 
   * <br/>being applied if a value is in the same range as the previous value or
   * continue being applied if a value is in the same range as the previous value.
   * <br/>If the repeatAction is True, if the consequence is always applied as
   * soon as the MetricMeasure value is in the range of values and if the
   * repeatAction is False, the consequence is applied only if the previous
   * MetricMeasure value was not in the same range.
   */
  Boolean getRepeatAction();
}
