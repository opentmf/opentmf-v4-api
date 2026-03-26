package org.opentmf.tmf666.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IFinancialAccountCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IFinancialAccountCreateEventPayload getPayload();
}
