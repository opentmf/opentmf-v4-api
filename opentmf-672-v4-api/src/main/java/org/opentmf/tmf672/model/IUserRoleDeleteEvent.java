package org.opentmf.tmf672.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-672: User Role Permission Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUserRoleDeleteEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IUserRoleDeleteEventPayload getEvent();
}
