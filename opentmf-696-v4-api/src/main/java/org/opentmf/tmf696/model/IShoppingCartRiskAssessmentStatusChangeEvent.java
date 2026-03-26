package org.opentmf.tmf696.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-696: Risk Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShoppingCartRiskAssessmentStatusChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IShoppingCartRiskAssessmentStatusChangeEventPayload getEvent();
}
