package org.opentmf.tmf648.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-648: Quote Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQuoteInformationRequiredEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IQuoteInformationRequiredEventPayload getEvent();
}
