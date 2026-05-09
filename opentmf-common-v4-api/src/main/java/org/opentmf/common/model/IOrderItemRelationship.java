package org.opentmf.common.model;


/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IOrderItemRelationship extends IExtensible {

  String getId();

  /**
   * The type of order item relationship.
   */
  String getRelationshipType();
}
