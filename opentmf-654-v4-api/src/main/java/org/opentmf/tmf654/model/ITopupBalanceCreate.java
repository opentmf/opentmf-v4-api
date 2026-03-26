package org.opentmf.tmf654.model;

import org.opentmf.common.model.IPaymentMethodRef;

/**
 * Represents a detailed description of a recharge operation requested over a
 * bucket (defined by a specific product or reference to a product (i.e.: a
 * commercial id such as an msisidn) and a service type)
 * <br/>Skipped properties:
 * id,href,status,requestedDate,confirmationDate,relatedParty.
 *
 * <p><br/>
 * <strong>Required:</strong> amount, bucket, partyAccount, usageType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITopupBalanceCreate extends IReserveBalanceCreate {

  /**
   * Related Entity reference. A related balance topup defines a relationship via
   * a role to another balance topup. Used in the PrepayBalanceManagement API to
   * track child topups that are related to the parent (initiating balance topup
   * resource). PrepayBalanceManagement defines the child role.
   */
  IRelatedTopupBalance getBalanceTopup();

  /**
   * Indicates if the topup requested is an autotopup (to be processed
   * periodically).
   */
  Boolean getIsAutoTopup();

  /**
   * For autotopup indicates the number of occurrences of the period the recharge
   * operation must be executed. If not included then no limit is set to stop the
   * executionof the topup every period.
   */
  Integer getNumberOfPeriods();

  /**
   * PaymentMethod reference. A payment method defines a specific mean of payment
   * (e.g. direct debit).
   */
  IPaymentMethodRef getPaymentMethod();

  /**
   * Valid values for this type
   * <br/><p>Recommended values: weekly, fortnightly, monthly.
   */
  String getRecurringPeriod();

  /**
   * Identifier for a voucher when the topup can be performed by this means.
   */
  String getVoucher();
}
