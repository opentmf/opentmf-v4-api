package org.opentmf.tmf672.model;

/**
 * The event data structure.
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
public interface IUserRoleCreateEventPayload {

  /**
   * A UserRole defines access levels to operate over a given function that can be
   * included in an asset.
   */
  IUserRole getUserRole();
}
