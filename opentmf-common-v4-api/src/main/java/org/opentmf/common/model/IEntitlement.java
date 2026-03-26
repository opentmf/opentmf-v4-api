package org.opentmf.common.model;


/**
 * An Entitlement defines access levels to operate over a given function that
 * can be included in an asset.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-672: User Role Permission Management API</li>
 *   <li>TMF-691: Federated ID Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntitlement extends IExtensible {

  /**
   * Level of access granted as part of the permission.
   */
  String getAction();

  /**
   * Specific function that can be managed over a given asset.
   */
  String getFunction();
}
