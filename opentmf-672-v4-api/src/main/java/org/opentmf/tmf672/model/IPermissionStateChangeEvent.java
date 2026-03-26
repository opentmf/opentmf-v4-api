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
public interface IPermissionStateChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IPermissionStateChangeEventPayload getEvent();
}
