package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IEntity;

/**
 * A Product Order is a type of order which can be used to place an order
 * between a customer and a service provider or between a service provider and a
 * partner and vice versa.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360ProductOrderVO extends IEntity {

  /**
   * Date when the order is cancelled. This is used when order is cancelled.
   */
  OffsetDateTime getCancellationDate();

  /**
   * Reason why the order is cancelled. This is used when order is cancelled.
   */
  String getCancellationReason();

  /**
   * Used to categorize the order from a business perspective that can be useful
   * for the OM system (e.g. "enterprise", "residential", ...).
   */
  String getCategory();

  /**
   * Date when the order was completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Description of the product order.
   */
  String getDescription();

  /**
   * Expected delivery date amended by the provider.
   */
  OffsetDateTime getExpectedCompletionDate();

  /**
   * ID given by the consumer and only understandable by him (to facilitate his
   * searches afterwards).
   */
  String getExternalId();

  /**
   * Contact attached to the order to send back information regarding this order.
   */
  String getNotificationContact();

  /**
   * Date when the order was created.
   */
  OffsetDateTime getOrderDate();

  /**
   * A way that can be used by consumers to prioritize orders in OM system (from 0
   * to 4 : 0 is the highest priority, and 4 the lowest).
   */
  String getPriority();

  /**
   * Requested delivery date from the requester perspective.
   */
  OffsetDateTime getRequestedCompletionDate();

  /**
   * Order fulfillment start date wished by the requester. This is used when, for
   * any reason, requester cannot allow seller to begin to operationally begin the
   * fulfillment before a date.
   */
  OffsetDateTime getRequestedStartDate();

  /**
   * Possible values for the state of the order
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, completed, failed, partial, assessingCancellation,
   * pendingCancellation.
   */
  String getState();
}
