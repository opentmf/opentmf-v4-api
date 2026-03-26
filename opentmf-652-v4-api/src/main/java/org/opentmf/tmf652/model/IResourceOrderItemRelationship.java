package org.opentmf.tmf652.model;

import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrderItemRelationship extends IExtensible {

  IResourceOrderItemRef getOrderItem();

  /**
   * Type of the order item relationship.
   */
  String getRelationshipType();
}
