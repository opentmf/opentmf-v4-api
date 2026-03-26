package org.opentmf.tmf651.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementDeleteEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IAgreementDeleteEventPayload getEvent();
}
