package org.opentmf.tmf622.model;

import java.time.OffsetDateTime;

/**
 * A Product Order is a type of order which can be used to place an order
 * between a customer and a service provider or between a service provider and a
 * partner and vice versa,
 * <br/>Skipped properties: id,href,orderDate.
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
public interface IProductOrderUpdate extends IProductOrderCreate {

  /**
   * Date when the order was completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Expected delivery date amended by the provider.
   */
  OffsetDateTime getExpectedCompletionDate();

  /**
   * Possible values for the state of the order
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, completed, failed, partial, assessingCancellation,
   * pendingCancellation.
   */
  String getState();
}
