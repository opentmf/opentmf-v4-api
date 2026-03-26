package org.opentmf.tmf649.model;

import org.opentmf.general.model.IThresholdRule;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IThresholdRuleCreateEventPayload {

  /**
   * ThresholdRule A base entity for concrete definition of thresholds.This
   * datatype is abstract.
   */
  IThresholdRule getThresholdRule();
}
