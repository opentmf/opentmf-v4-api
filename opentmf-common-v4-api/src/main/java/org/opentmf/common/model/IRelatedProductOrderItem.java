package org.opentmf.common.model;

import java.net.URI;

/**
 * RelatedProductOrderItem (ProductOrder item) .The product order item which
 * triggered product creation/change/termination.
 *
 * <p><br/>
 * <strong>Required:</strong> orderItemId, productOrderId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-637: Product Inventory Management API</li>
 *   <li>TMF-648: Quote Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-663: Shopping Cart Management API</li>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 *   <li>TMF-680: Recommendation Management API</li>
 *   <li>TMF-687: Stock Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedProductOrderItem extends IShoppingCartRef {

  /**
   * Action of the order item for this product.
   */
  String getOrderItemAction();

  /**
   * Identifier of the order item where the product was managed.
   */
  String getOrderItemId();

  /**
   * Reference of the related entity.
   */
  URI getProductOrderHref();

  /**
   * Unique identifier of a related entity.
   */
  String getProductOrderId();

  /**
   * role of the product order item for this product.
   */
  String getRole();
}
