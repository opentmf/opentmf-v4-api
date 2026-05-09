package org.opentmf.tmf648.model;

import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IPriceBase;

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
public interface IQuotePrice extends IPriceBase {

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IPrice getPrice();

  /**
   * Unit of Measure if price depending on it (Gb, SMS volume, etc..).
   */
  String getUnitOfMeasure();
}
