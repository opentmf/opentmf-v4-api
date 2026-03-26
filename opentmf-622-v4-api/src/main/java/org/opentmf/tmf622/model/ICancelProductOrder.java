package org.opentmf.tmf622.model;

import org.opentmf.common.model.ICancelOrder;
import org.opentmf.common.model.IProductOrderRef;

/**
 * Request for cancellation an existing product order.
 *
 * <p><br/>
 * <strong>Required:</strong> productOrder<br/>
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
public interface ICancelProductOrder extends ICancelOrder {

  /**
   * ProductOrder (ProductOrder) .The product order which the recommendation is
   * related with.
   */
  IProductOrderRef getProductOrder();
}
