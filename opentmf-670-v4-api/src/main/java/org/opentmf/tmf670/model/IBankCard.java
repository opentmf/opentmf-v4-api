package org.opentmf.tmf670.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IPaymentMethod;

/**
 * A bank card method of payment.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, brand, cardNumber, expirationDate, name, nameOnCard<br/>
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
public interface IBankCard extends IPaymentMethod {

  /**
   * The bank that issued the card.
   */
  String getBank();

  /**
   * The card brand.
   */
  String getBrand();

  /**
   * The bank card number.
   */
  String getCardNumber();

  /**
   * The type of card e.g. Credit, debit etc.
   */
  String getCardType();

  /**
   * The security code (e.g.: CVV, CVV2) of the card.
   */
  String getCvv();

  /**
   * Expiration date of the bank card.
   */
  OffsetDateTime getExpirationDate();

  /**
   * The last four digits of the credit card.
   */
  String getLastFourDigits();

  /**
   * The name on the card.
   */
  String getNameOnCard();
}
