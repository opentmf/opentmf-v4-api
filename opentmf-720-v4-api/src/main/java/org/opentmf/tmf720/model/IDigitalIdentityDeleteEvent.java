package org.opentmf.tmf720.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-720: Digital Identity Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDigitalIdentityDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IDigitalIdentityDeleteEventPayload getEvent();
}
