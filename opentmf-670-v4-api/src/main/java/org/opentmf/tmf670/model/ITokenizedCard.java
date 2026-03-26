package org.opentmf.tmf670.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IPaymentMethod;

/**
 * A Tokenized Card method of payment.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, expirationDate, lastFourDigits, name<br/>
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
public interface ITokenizedCard extends IPaymentMethod {

  /**
   * Card brand. Might be used for display purposes.
   */
  String getBrand();

  /**
   * Card type. Might be used for display purposes.
   */
  String getCardType();

  /**
   * ISO 3166-1 Alpha-2 country code that designate the country where the
   * tokenised card was issued.e.g. GB, NG, FR.
   */
  String getCountryOfIssue();

  /**
   * The tokenised card's expiration date.
   */
  OffsetDateTime getExpirationDate();

  /**
   * The entity that issued the token.
   */
  String getIssuer();

  /**
   * The last four digits of the credit card.
   */
  String getLastFourDigits();

  /**
   * The token. A series of randomly generated numbers.
   */
  String getToken();

  /**
   * Token type (e.g.: emv).
   */
  String getTokenType();
}
