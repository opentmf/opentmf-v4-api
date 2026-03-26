package org.opentmf.tmf621.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-621: Trouble Ticket Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITroubleTicketResolvedEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  ITroubleTicketResolvedEventPayload getEvent();
}
