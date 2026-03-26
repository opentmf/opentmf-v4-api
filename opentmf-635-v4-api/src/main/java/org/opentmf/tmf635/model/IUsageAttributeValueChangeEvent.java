package org.opentmf.tmf635.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IUsageAttributeValueChangeEventPayload getEvent();
}
