package org.opentmf.common.model;

import java.util.List;

/**
 * An amount, usually of money, that represents the actual price paid by a
 * Customer for a purchase, a rent or a lease of a Product. The price is valid
 * for a defined period of time.
 *
 * <p><br/>
 * <strong>Required:</strong> price, priceType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-637: Product Inventory Management API</li>
 *   <li>TMF-648: Quote Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-663: Shopping Cart Management API</li>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 *   <li>TMF-680: Recommendation Management API</li>
 *   <li>TMF-687: Stock Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductPrice extends INamedEntity {

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * A narrative that explains in detail the semantics of this product price.
   */
  String getDescription();

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IPrice getPrice();

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
   * List of: Is an amount, usually of money, that modifies the price charged for
   * an order item.
   */
  List<? extends IPriceAlteration> getProductPriceAlterations();

  /**
   * Could be month, week...
   */
  String getRecurringChargePeriod();

  /**
   * Could be minutes, GB...
   */
  String getUnitOfMeasure();
}
