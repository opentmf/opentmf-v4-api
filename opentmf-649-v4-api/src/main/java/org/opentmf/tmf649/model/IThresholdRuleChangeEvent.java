package org.opentmf.tmf649.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
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
public interface IThresholdRuleChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IThresholdRuleChangeEventPayload getEvent();
}
