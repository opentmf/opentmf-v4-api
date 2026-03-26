package org.opentmf.tmf908.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Party role reference. A party role represents the part played by a party in a
 * given context.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRoleRef extends IEntityRef {

  /**
   * The identifier of the engaged party that is linked to the PartyRole object.
   */
  String getPartyId();

  /**
   * The name of the engaged party that is linked to the PartyRole object.
   */
  String getPartyName();
}
