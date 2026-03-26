package org.opentmf.tmf676.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * The Refund resource represents a performed Refund. It contains both
 * information about the refund and the payment method used to perform it.
 *
 * <p><br/>
 * <strong>Required:</strong> account, paymentMethod<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-676: Payment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRefund extends IRefundCreate {

  /**
   * Hypertext Reference of the refund.
   */
  URI getHref();

  /**
   * Unique identifier of Refund.
   */
  String getId();

  /**
   * Status of the refund.
   */
  String getStatus();

  /**
   * Date when the status was recorded.
   */
  OffsetDateTime getStatusDate();
}
