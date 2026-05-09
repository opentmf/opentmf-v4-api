package org.opentmf.common.model;


/**
 * Relationship among cart items mainly other than hierarchical relationships
 * such as "RelyOn", "DependentOn", "Shipping" etc.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-663: Shopping Cart Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICartItemRelationship extends IExtensible {

  /**
   * Unique identifier of the referred cart item.
   */
  String getId();

  /**
   * Type of the cart item relationship.
   */
  String getRelationshipType();
}
