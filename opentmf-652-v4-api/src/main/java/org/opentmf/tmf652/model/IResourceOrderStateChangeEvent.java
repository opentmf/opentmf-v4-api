package org.opentmf.tmf652.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrderStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IResourceOrderStateChangeEventPayload getEvent();
}
