package org.opentmf.tmf676.model;

import org.opentmf.common.model.IPayment;

/**
 * The event data structure.
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
public interface IPaymentStateChangeEventPayload {

  /**
   * The Payment resource represents a performed payment. It contains both
   * information about the payment and the payment method used to perform it.
   */
  IPayment getPayment();
}
