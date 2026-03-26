package org.opentmf.tmf715.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWarrantyDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IWarrantyDeleteEventPayload getEvent();
}
