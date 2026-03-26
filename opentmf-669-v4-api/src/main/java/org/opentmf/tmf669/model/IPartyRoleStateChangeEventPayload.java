package org.opentmf.tmf669.model;

import org.opentmf.common.model.IPartyRole;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-669: Party Role Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRoleStateChangeEventPayload {

  /**
   * The part played by a party in a given context.
   */
  IPartyRole getPartyRole();
}
