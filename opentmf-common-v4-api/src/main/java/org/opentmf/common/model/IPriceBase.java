package org.opentmf.common.model;

import java.util.List;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>CartPrice (663)</li>
 *   <li>OrderPrice (622)</li>
 *   <li>QuotePrice (648)</li>
 *   <li>WorkPrice (713, 714)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPriceBase extends IExtensible {

  /**
   * A narrative that explains in detail the semantics of this order item price.
   */
  String getDescription();

  /**
   * A short descriptive name such as "Subscription price".
   */
  String getName();

  /**
   * List of: Is an amount, usually of money, that modifies the price charged for
   * an order item.
   */
  List<? extends IPriceAlteration> getPriceAlterations();

  /**
   * A category that describes the price, such as recurring, discount, allowance,
   * penalty, and so forth.
   */
  String getPriceType();

  /**
   * ProductPriceOffering reference. An amount, usually of money, that is asked
   * for or allowed when a ProductOffering is bought, rented, or leased.
   */
  IProductOfferingPriceRef getProductOfferingPrice();

  /**
   * Could be month, week...
   */
  String getRecurringChargePeriod();
}
