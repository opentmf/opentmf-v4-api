package org.opentmf.tmf671.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-671: Promotion Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPromotionAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IPromotionAttributeValueChangeEventPayload getEvent();
}
