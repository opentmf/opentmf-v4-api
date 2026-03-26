package org.opentmf.tmf663.model;

import java.util.List;
import org.opentmf.common.model.ICartPriceBase;
import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IPriceAlteration;

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
public interface ICartPrice extends ICartPriceBase {

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IPrice getPrice();

  /**
   * List of: Is an amount, usually of money, that modifies the price charged for
   * an order item.
   */
  List<? extends IPriceAlteration> getPriceAlterations();

  /**
   * Could be minutes, GB...
   */
  String getUnitOfMeasure();
}
