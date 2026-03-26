package org.opentmf.tmf672.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * The Permission resource represents the entitlement given by an individual
 * (granter) to another individual (user) to get access to a set of his owned
 * manageable assets. One single permission resource can hold information
 * referring to privileges granted for multiple manageable assets.
 *
 * <p><br/>
 * <strong>Required:</strong> user, validFor<br/>
 * </p>
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
public interface IPermission extends IPermissionUpdate {

  /**
   * Date when the payment was performed.
   */
  OffsetDateTime getCreationDate();

  /**
   * Hypertext Reference of the permission.
   */
  URI getHref();

  /**
   * Unique identifier of the permission.
   */
  String getId();
}
