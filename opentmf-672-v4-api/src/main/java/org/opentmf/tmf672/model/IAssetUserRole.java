package org.opentmf.tmf672.model;

import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IUserRoleRef;

/**
 * The AssetUserRole is the detailed information concerning an individual user
 * role.
 *
 * <p><br/>
 * <strong>Required:</strong> manageableAsset, userRole<br/>
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
public interface IAssetUserRole extends IExtensible {

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getManageableAsset();

  /**
   * A UserRoleRef is a detailed information concerning an individual access
   * entitlement.
   */
  IUserRoleRef getUserRole();
}
