package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * A customer bill displays applied billing rates created before or during the
 * billing process.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 *   <li>TMF-728: Dunning Case Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAppliedCustomerBillingRate extends INamedEntity {

  /**
   * List of: The applied billing tax rate represents taxes applied billing rate
   * it refers to. It is calculated during the billing process.
   */
  List<? extends IAppliedBillingTaxRate> getAppliedTaxes();

  /**
   * Bill reference.
   */
  IBillRef getBill();

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * List of: An applied billing rate has dynamic characteristics according to the
   * its type (characteristics are based on the service type, line of business or
   * on others parameters).
   */
  List<? extends IAppliedBillingRateCharacteristic> getCharacteristics();

  /**
   * Creation date of the applied billing rate.
   */
  OffsetDateTime getDate();

  /**
   * Additional data to be displayed on the bill for this customer applied billing
   * rate.
   */
  String getDescription();

  /**
   * If isBilled = true then bill should be provided, if false then billingAccount
   * should be provided.
   */
  Boolean getIsBilled();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getPeriodCoverage();

  IProductRef getProduct();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxExcludedAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxIncludedAmount();

  /**
   * Type of the applied billing rate : appliedBillingCharge (any kind of charge
   * except taxation charges : recurringCharge, oneTimeCharge, usageCharge),
   * appliedBillingCredit (any kind of credit : rebate or productAlteration) or
   * appliedPenaltyCharge (penalty charges such as late fees, payment rejection
   * fees,...).
   */
  String getType();
}
