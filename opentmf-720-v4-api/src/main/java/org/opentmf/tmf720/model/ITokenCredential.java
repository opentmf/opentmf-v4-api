package org.opentmf.tmf720.model;


/**
 * A Credential based on a token.
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
public interface ITokenCredential extends ICredential {

  /**
   * credential login.
   */
  String getLogin();

  /**
   * Token credential identifier.
   */
  String getTokenCredential();
}
