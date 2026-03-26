package org.opentmf.tmf620.model;

import java.math.BigDecimal;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and
 * percentage to apply for Price Alteration.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductPriceValue extends IExtensible {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getDutyFreeAmount();

  /**
   * Percentage to apply for ProdOfferPriceAlteration.
   */
  BigDecimal getPercentage();

  /**
   * Tax category.
   */
  String getTaxCategory();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxIncludedAmount();

  /**
   * Tax rate.
   */
  BigDecimal getTaxRate();
}
