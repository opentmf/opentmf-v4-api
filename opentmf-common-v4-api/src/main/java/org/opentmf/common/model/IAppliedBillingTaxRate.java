package org.opentmf.common.model;

import java.math.BigDecimal;

/**
 * The applied billing tax rate represents taxes applied billing rate it refers
 * to. It is calculated during the billing process.
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
public interface IAppliedBillingTaxRate extends IEntity {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxAmount();

  /**
   * A categorization of the tax rate.
   */
  String getTaxCategory();

  /**
   * Applied rate.
   */
  BigDecimal getTaxRate();
}
