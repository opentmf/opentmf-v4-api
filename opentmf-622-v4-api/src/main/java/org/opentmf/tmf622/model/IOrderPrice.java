package org.opentmf.tmf622.model;

import java.util.List;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.ICartPriceBase;
import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IPriceAlteration;

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
public interface IOrderPrice extends ICartPriceBase {

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
   * a structure used to describe a price alteration.
   */
  List<? extends IPriceAlteration> getPriceAlterations();

  /**
   * Could be minutes, GB...
   */
  String getUnitOfMeasure();
}
