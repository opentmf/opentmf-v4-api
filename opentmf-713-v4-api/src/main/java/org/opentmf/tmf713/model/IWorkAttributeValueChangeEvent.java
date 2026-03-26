package org.opentmf.tmf713.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IWorkAttributeValueChangeEventPayload getEvent();
}
