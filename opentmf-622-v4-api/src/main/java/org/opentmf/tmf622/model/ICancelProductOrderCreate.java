package org.opentmf.tmf622.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOrderRef;

/**
 * Request for cancellation an existing product order
 * <br/>Skipped properties: id,href,state,effectiveCancellationDate.
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
public interface ICancelProductOrderCreate extends IExtensible {

  /**
   * Reason why the order is cancelled.
   */
  String getCancellationReason();

  /**
   * ProductOrder (ProductOrder) .The product order which the recommendation is
   * related with.
   */
  IProductOrderRef getProductOrder();

  /**
   * Date when the submitter wants the order to be cancelled.
   */
  OffsetDateTime getRequestedCancellationDate();
}
