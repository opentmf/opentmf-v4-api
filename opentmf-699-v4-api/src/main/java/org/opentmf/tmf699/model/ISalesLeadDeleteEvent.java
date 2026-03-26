package org.opentmf.tmf699.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-699: Sales Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISalesLeadDeleteEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  ISalesLeadDeleteEventPayload getEvent();
}
