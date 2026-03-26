package org.opentmf.tmf670.model;

import java.net.URI;

/**
 * A Payment Method is a pure-virtual super-class that defines a specific method
 * of payment such as Direct Debit, Cash, Digital Wallet,Tokenized Card, Bank
 * Account Transfer, Bank Account Debit, Bank Card, Voucher, Check, Bucket
 * PaymentMethod, Account PaymentMethod, and Loyalty PaymentMethod with all
 * details associated. Use the {@literal @}type attribute to specify the concrete type in
 * the API calls.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, name<br/>
 * </p>
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
public interface IPaymentMethodCreate extends IPaymentMethodUpdate {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * Type of payment method (e.g.: bank card, cash, voucher, etc).
   */
  String getAtType();
}
