package org.opentmf.common.model;

/**
 * The part played by a party in a given context.
 *
 * <p><br/>
 * <strong>Required:</strong> name, roleType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-669: Party Role Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRole extends IPartner {

  /**
   * RoleType reference.
   */
  IRoleTypeRef getRoleType();
}
