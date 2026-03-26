package org.opentmf.tmf648.model;

import java.util.List;
import org.opentmf.common.model.ICartPriceBase;
import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IPriceAlteration;

/**
 * Description of price and discount awarded.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-648: Quote Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQuotePrice extends ICartPriceBase {

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
   * Unit of Measure if price depending on it (Gb, SMS volume, etc..).
   */
  String getUnitOfMeasure();
}
