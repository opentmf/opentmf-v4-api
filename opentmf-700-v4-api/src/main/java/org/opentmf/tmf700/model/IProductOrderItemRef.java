package org.opentmf.tmf700.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Reference to an order item that can typically be queried with another API.
 *
 * <p><br/>
 * <strong>Required:</strong> productOrderId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOrderItemRef extends IEntityRef {

  /**
   * Identifier of the order of which the item is a part of.
   */
  String getProductOrderId();
}
