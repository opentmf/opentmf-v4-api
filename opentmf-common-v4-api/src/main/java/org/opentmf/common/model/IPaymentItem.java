package org.opentmf.common.model;

/**
 * The paymentItem is the result of lettering process. It enables to assign
 * automatically or manually part of incoming payment amount to a bill.
 *
 * <p><br/>
 * <strong>Required:</strong> item<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-676: Payment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPaymentItem extends IEntity {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAmount();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getItem();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTotalAmount();
}
