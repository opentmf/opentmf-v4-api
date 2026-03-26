package org.opentmf.tmf678.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;
import org.opentmf.customer.model.IPaymentRef;

/**
 * The applied payment is the result of lettering process. It enables to assign
 * automatically or manually part of incoming payment amount to a bill.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAppliedPayment extends IExtensible {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAppliedAmount();

  /**
   * If an immediate payment has been done at the product order submission, the
   * payment information are captured and stored (as a reference) in the order.
   */
  IPaymentRef getPayment();
}
