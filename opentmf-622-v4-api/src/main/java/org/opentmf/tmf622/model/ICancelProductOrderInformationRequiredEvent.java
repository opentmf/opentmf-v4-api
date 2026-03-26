package org.opentmf.tmf622.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICancelProductOrderInformationRequiredEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  ICancelProductOrderInformationRequiredEventPayload getEvent();
}
