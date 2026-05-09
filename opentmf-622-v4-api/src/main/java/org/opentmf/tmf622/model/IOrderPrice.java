package org.opentmf.tmf622.model;

import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IPriceBase;

/**
 * An amount, usually of money, that represents the actual price paid by the
 * Customer for this item or this order.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IOrderPrice extends IPriceBase {

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

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
