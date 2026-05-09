package org.opentmf.general.model;

import java.net.URI;

/**
 * ThresholdRule A base entity for concrete definition of thresholds.This
 * datatype is abstract.
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
public interface IThresholdRule extends IThresholdRuleUpdate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
