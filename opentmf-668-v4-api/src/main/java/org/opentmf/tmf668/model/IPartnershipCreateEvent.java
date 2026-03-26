package org.opentmf.tmf668.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-668: Partnership Type</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartnershipCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IPartnershipCreateEventPayload getEvent();
}
