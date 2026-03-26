package org.opentmf.tmf655.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IChangeRequestAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IChangeRequestAttributeValueChangeEventPayload getEvent();
}
