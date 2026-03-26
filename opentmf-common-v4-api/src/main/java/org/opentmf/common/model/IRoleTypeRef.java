package org.opentmf.common.model;

import java.net.URI;

/**
 * RoleType reference.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRoleTypeRef extends IEntityRef {

  /**
   * Reference url of the partnership type containing the role type.
   */
  URI getPartnershipHref();

  /**
   * The identifier of the partnership type containing the role type.
   */
  String getPartnershipId();

  /**
   * The name of the partnership type defining this role type.
   */
  String getPartnershipName();
}
