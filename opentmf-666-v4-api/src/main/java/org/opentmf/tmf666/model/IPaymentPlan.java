package org.opentmf.tmf666.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IPaymentMethodRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * Defines a plan for payment (when a party wants to spread his payments).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPaymentPlan extends IExtensible {

  /**
   * Number of payments used to spread the global payment.
   */
  Integer getNumberOfPayments();

  /**
   * Frequency of the payments, such as monthly and bimonthly.
   */
  String getPaymentFrequency();

  /**
   * PaymentMethod reference. A payment method defines a specific mean of payment
   * (e.g. direct debit).
   */
  IPaymentMethodRef getPaymentMethod();

  /**
   * Type of payment plan.
   */
  String getPlanType();

  /**
   * Priority of the payment plan.
   */
  Integer getPriority();

  /**
   * Status of the payment plan (effective, ineffective).
   */
  String getStatus();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTotalAmount();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
