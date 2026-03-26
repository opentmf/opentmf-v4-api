package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * A Order cancel is a type of task which can be used to place a request to
 * cancel an order.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-641: Service Ordering Management API</li>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICancelOrder extends IEntity {

  /**
   * Reason why the order is cancelled.
   */
  String getCancellationReason();

  /**
   * Date when the order is cancelled.
   */
  OffsetDateTime getEffectiveCancellationDate();

  /**
   * Date when the submitter wants the order to be cancelled.
   */
  OffsetDateTime getRequestedCancellationDate();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
