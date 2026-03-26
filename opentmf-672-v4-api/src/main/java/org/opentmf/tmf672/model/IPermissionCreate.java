package org.opentmf.tmf672.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * The Permission resource represents the entitlement given by an individual
 * (granter) to another individual (user) to get access to a set of his owned
 * manageable assets. One single permission resource can hold information
 * referring to privileges granted for multiple manageable assets.
 * <br/>Skipped properties: id,href,creationDate.
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
public interface IPermissionCreate extends IExtensible {

  /**
   * List of: The AssetUserRole is the detailed information concerning an
   * individual user role.
   */
  List<? extends IAssetUserRole> getAssetUserRoles();

  /**
   * Text describing the contents of the payment.
   */
  String getDescription();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getGranter();

  /**
   * List of: A Privilege is a detailed information concerning an individual
   * access entitlement.
   */
  List<? extends IPrivilege> getPrivileges();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getUser();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
