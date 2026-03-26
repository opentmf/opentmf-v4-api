package org.opentmf.tmf622.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * A Product Order is a type of order which can be used to place an order
 * between a customer and a service provider or between a service provider and a
 * partner and vice versa.
 *
 * <p><br/>
 * <strong>Required:</strong> productOrderItem<br/>
 * </p>
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
public interface IProductOrder extends IProductOrderUpdate {

  /**
   * Hyperlink to access the order.
   */
  URI getHref();

  /**
   * ID created on repository side (OM system).
   */
  String getId();

  /**
   * Date when the order was created.
   */
  OffsetDateTime getOrderDate();
}
