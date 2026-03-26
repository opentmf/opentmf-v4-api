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
public interface IPermissionCreateEventPayload {

  /**
   * The Permission resource represents the entitlement given by an individual
   * (granter) to another individual (user) to get access to a set of his owned
   * manageable assets. One single permission resource can hold information
   * referring to privileges granted for multiple manageable assets.
   */
  IPermission getPermission();
}
