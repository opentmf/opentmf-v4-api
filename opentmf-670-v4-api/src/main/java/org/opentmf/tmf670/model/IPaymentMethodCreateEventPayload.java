package org.opentmf.tmf670.model;

import org.opentmf.common.model.IPaymentMethod;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-670: Payment Method Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPaymentMethodCreateEventPayload {

  /**
   * A Payment Method is a pure-virtual super-class that defines a specific method
   * of payment such as Direct Debit, Cash, Digital Wallet,Tokenized Card, Bank
   * Account Transfer, Bank Account Debit, Bank Card, Voucher, Check, Bucket
   * PaymentMethod, Account PaymentMethod, and Loyalty PaymentMethod with all
   * details associated. Use the {@literal @}type attribute to specify the concrete type in
   * the API calls.
   */
  IPaymentMethod getPaymentMethod();
}
