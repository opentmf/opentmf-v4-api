package org.opentmf.tmf663.model;

import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IPriceBase;

/**
 * An amount, usually of money, that represents the actual price paid by the
 * customer for this item. May represent the total price of the shopping cart or
 * the total of the cart item depending on the relation.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-663: Shopping Cart Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICartPrice extends IPriceBase {

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IPrice getPrice();

  /**
   * Could be minutes, GB...
   */
  String getUnitOfMeasure();
}
