package org.opentmf.tmf676.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IAccountRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IPaymentMethodRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.customer.model.IPaymentRef;

/**
 * The Refund resource represents a performed Refund. It contains both
 * information about the refund and the payment method used to perform it.
 * <br/>Skipped properties: id,href,status,statusDate,RefundDate.
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
public interface IRefundCreate extends IExtensible {

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
   * Unique identifier in the client for the refund in case it is needed to
   * correlate.
   */
  String getCorrelatorId();

  /**
   * Text describing the contents of the refund.
   */
  String getDescription();

  /**
   * Screen name of the refund.
   */
  String getName();

  /**
   * If an immediate payment has been done at the product order submission, the
   * payment information are captured and stored (as a reference) in the order.
   */
  IPaymentRef getPayment();

  /**
   * link to the resource that holds information about the payment mean used to
   * complete the operation.
   */
  IPaymentMethodRefOrValue getPaymentMethod();

  /**
   * Date when the refund was performed.
   */
  OffsetDateTime getRefundDate();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRequester();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTotalAmount();
}
