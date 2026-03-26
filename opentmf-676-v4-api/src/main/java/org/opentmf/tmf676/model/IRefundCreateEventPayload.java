package org.opentmf.tmf676.model;

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
public interface IRefundCreateEventPayload {

  /**
   * The Refund resource represents a performed Refund. It contains both
   * information about the refund and the payment method used to perform it.
   */
  IRefund getRefund();
}
