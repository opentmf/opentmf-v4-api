package org.opentmf.tmf672.model;

import org.opentmf.common.model.IEntitlement;
import org.opentmf.common.model.IEntityRef;

/**
 * A Privilege is a detailed information concerning an individual access
 * entitlement.
 *
 * <p><br/>
 * <strong>Required:</strong> action, function, manageableAsset<br/>
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
public interface IPrivilege extends IEntitlement {

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getManageableAsset();
}
