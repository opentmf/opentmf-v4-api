package org.opentmf.tmf720.model;


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
public interface ILoginPasswordCredential extends ICredential {

  /**
   * credential login.
   */
  String getLogin();

  /**
   * credential password - must be in write only.
   */
  String getPassword();
}
