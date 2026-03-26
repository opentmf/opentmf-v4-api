package org.opentmf.common.model;

import java.math.BigDecimal;

/**
 * A tax item is created for each tax rate and tax type used in the bill.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITaxItem extends IEntity {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxAmount();

  /**
   * Tax category.
   */
  String getTaxCategory();

  /**
   * Applied rate of the tax.
   */
  BigDecimal getTaxRate();
}
