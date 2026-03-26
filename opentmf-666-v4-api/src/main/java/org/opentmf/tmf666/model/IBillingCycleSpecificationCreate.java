package org.opentmf.tmf666.model;

import org.opentmf.common.model.IBillPresentationMediaUpdate;
import org.opentmf.common.model.ITimePeriod;

/**
 * A detailed description of when to initiate a billing cycle and the various
 * sub steps of a billing cycle.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
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
public interface IBillingCycleSpecificationCreate extends IBillPresentationMediaUpdate {

  /**
   * An offset of a billing/settlement date. The offset is expressed as number of
   * days with regard to the start of the billing/settlement period.
   */
  Integer getBillingDateShift();

  /**
   * A billing time period. It can be recurring, for example: week, month, quarter
   * of year, year .
   */
  String getBillingPeriod();

  /**
   * An offset of a date through which charges previously received by the billing
   * system will appear on the bill. The offset is expressed as number of days
   * with regard to the start of the BillingPeriod.
   */
  Integer getChargeDateOffset();

  /**
   * An offset of a date through which credits previously received by the billing
   * system will appear on the bill. The offset is expressed as number of days
   * with regard to the start of the BillingPeriod.
   */
  Integer getCreditDateOffset();

  /**
   * Frequency of the billing cycle (monthly for instance).
   */
  String getFrequency();

  /**
   * An offset of a customer bill mailing date. The offset is expressed as number
   * of days with regard to the start of the BillingPeriod.
   */
  Integer getMailingDateOffset();

  /**
   * An offset of a payment due date. The offset is expressed as number of days
   * with regard to the start of the BillingPeriod.
   */
  Integer getPaymentDueDateOffset();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
