package org.opentmf.tmf720.model;

import org.opentmf.common.model.IResourceRef;

/**
 * A Credential based on a login and a password.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-720: Digital Identity Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface INetworkCredential extends ICredential {

  /**
   * credential password to use resource based credential - must be in write only.
   */
  String getPassword();

  IResourceRef getResource();
}
