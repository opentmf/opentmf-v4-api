package org.opentmf.common.model;

import java.util.List;

/**
 * The Payment resource represents a performed payment. It contains both
 * information about the payment and the payment method used to perform it.
 * <br/>Skipped properties: id,href,status,statusDate,paymentDate.
 *
 * <p><br/>
 * <strong>Required:</strong> account, paymentMethod, totalAmount<br/>
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
public interface IPaymentCreate extends IExtensible {

  /**
   * Account reference. An account may be a party account or a financial account.
   */
  IAccountRef getAccount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAmount();

  /**
   * Authorization code retrieved from an external payment gateway that could be
   * used for conciliation.
   */
  String getAuthorizationCode();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  /**
   * Unique identifier in the client for the payment in case it is needed to
   * correlate.
   */
  String getCorrelatorId();

  /**
   * Text describing the contents of the payment.
   */
  String getDescription();

  /**
   * Screen name of the payment.
   */
  String getName();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getPayer();

  /**
   * List of: The paymentItem is the result of lettering process. It enables to
   * assign automatically or manually part of incoming payment amount to a bill.
   */
  List<? extends IPaymentItem> getPaymentItems();

  /**
   * link to the resource that holds information about the payment mean used to
   * complete the operation.
   */
  IPaymentMethodRefOrValue getPaymentMethod();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTotalAmount();
}
