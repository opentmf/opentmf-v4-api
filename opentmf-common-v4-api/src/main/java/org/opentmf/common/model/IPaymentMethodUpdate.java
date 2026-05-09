package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * A Payment Method is a pure-virtual super-class that defines a specific method
 * of payment such as Direct Debit, Cash, Digital Wallet,Tokenized Card, Bank
 * Account Transfer, Bank Account Debit, Bank Card, Voucher, Check, Bucket
 * PaymentMethod, Account PaymentMethod, and Loyalty PaymentMethod with all
 * details associated. Use the {@literal @}type attribute to specify the concrete type in
 * the API calls.
 * <br/>Skipped properties: id,href,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IPaymentMethodUpdate {

  /**
   * Reference to the accounts that are linked to the payment method. May be a
   * party account or a financial account.
   */
  List<? extends IAccountRef> getAccounts();

  /**
   * Review: Authorization code provided by a financial institution. Typically
   * this would be populated for recurring payments using the method, as payments
   * have an authorization code of their own.
   */
  String getAuthorizationCode();

  /**
   * Text description of the contents of the payment method.
   */
  String getDescription();

  /**
   * If the method is the preferred one by the owner. Typically used when querying
   * for the payment methods of a specific customer or account.
   */
  Boolean getIsPreferred();

  /**
   * Friendly name assigned to the payment method.
   */
  String getName();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRelatedParty();

  /**
   * A Place and an associated role as installation adress, delivery address,
   * etc....
   */
  IRelatedPlace getRelatedPlace();

  /**
   * Status of the payment method.
   */
  String getStatus();

  /**
   * The last time the payment method status changed.
   */
  OffsetDateTime getStatusDate();

  /**
   * The reason for the last status change.
   */
  String getStatusReason();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
