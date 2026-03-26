package org.opentmf.tmf672.model;

import java.util.List;
import org.opentmf.common.model.IEntitlement;
import org.opentmf.common.model.IExtensible;

/**
 * A UserRole defines access levels to operate over a given function that can be
 * included in an asset.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> entitlement<br/>
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
public interface IUserRoleCreate extends IExtensible {

  /**
   * List of: An Entitlement defines access levels to operate over a given
   * function that can be included in an asset.
   */
  List<? extends IEntitlement> getEntitlements();

  /**
   * Indication of the part that a user plays in its involvement with a manageable
   * asset (product, service or resource).
   */
  String getInvolvementRole();
}
