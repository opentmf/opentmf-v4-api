package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IPaymentMethodRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * The customer bill. Can be a regular recurring bill or an extra bill on demand
 * by the customer or the csp.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360CustomerBillVO extends IEntity {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAmountDue();

  /**
   * ....
   */
  IBillCycleRef getBillCycle();

  /**
   * Bill date, external customer view (in consequence: different to the
   * production date of the bill).
   */
  OffsetDateTime getBillDate();

  /**
   * Bill reference known by the customer or the party and displayed on the bill.
   * Could be different from the id.
   */
  String getBillNo();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getBillingPeriod();

  /**
   * Category of the bill produced : normal, duplicate, interim, last, trial
   * customer or credit note for example.
   */
  String getCategory();

  /**
   * Date of bill last update.
   */
  OffsetDateTime getLastUpdate();

  /**
   * ). Approximate date of the next bill production given for information (only
   * used/meaningful for on cycle / regular bills).
   */
  OffsetDateTime getNextBillDate();

  /**
   * Date at which the amount due should have been paid.
   */
  OffsetDateTime getPaymentDueDate();

  /**
   * PaymentMethod reference. A payment method defines a specific mean of payment
   * (e.g. direct debit).
   */
  IPaymentMethodRef getPaymentMethod();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getRemainingAmount();

  /**
   * Recommended Enumeration Type (not formal forced in standard): Valid values
   * for the runType of a bill. The bill could be produced in a regular bill cycle
   * 'onCycle'. Otherwise the bill is produced on a request (e.g. customer
   * request). This could be indicated by 'offCycle'
   * <br/><p>Recommended values: onCycle, offCycle.
   */
  String getRunType();

  /**
   * Recommended Enumeration Type (not formal forced in standard): Valid values
   * for the lifecycle state of the bill: new = 'bill is ready to validate or to
   * sent', validated = 'bill is checked (manual / automatic)', sent = 'bill is
   * sent with the channel defined in the billingaccount', settled = 'bill is
   * payed', partiallySettled = 'bill is partially payed', onHold = 'bill will not
   * be in further processing until open issues connected to the bill are solved'
   * <br/><p>Recommended values: new, onHold, validated, sent, settled,
   * partiallyPaid.
   */
  String getState();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxExcludedAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxIncludedAmount();
}
