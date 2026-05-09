package org.opentmf.common.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The Payment resource represents a performed payment. It contains both
 * information about the payment and the payment method used to perform it.
 *
 * <p><br/>
 * <strong>Required:</strong> account, paymentMethod<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-676: Payment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPayment extends IPaymentCreate {

  /**
   * Hypertext Reference of the Payment.
   */
  URI getHref();

  /**
   * Unique identifier of Payment.
   */
  String getId();

  /**
   * Date when the payment was performed.
   */
  OffsetDateTime getPaymentDate();

  /**
   * POI consists of hardware and software which enables a Cardholder and/or an
   * Acceptor to perform a Local Card transaction. This is also referred to as a
   * Physical/EMV Terminal. It may be Attended or Unattended.
   */
  IPointOfInteraction getPointOfInteraction();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Status of the payment.
   */
  String getStatus();

  /**
   * Date when the status was recorded.
   */
  OffsetDateTime getStatusDate();
}
