package org.opentmf.common.model;


/**
 * Is an amount, usually of money, that modifies the price charged for an order
 * item.
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
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPriceAlteration extends INamedEntity {

  /**
   * Duration during which the alteration applies on the order item price (for
   * instance 2 months free of charge for the recurring charge).
   */
  Integer getApplicationDuration();

  /**
   * A narrative that explains in detail the semantics of this order item price
   * alteration.
   */
  String getDescription();

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IPrice getPrice();

  /**
   * A category that describes the price such as recurring, one time and usage.
   */
  String getPriceType();

  /**
   * Priority level for applying this alteration among all the defined alterations
   * on the order item price.
   */
  Integer getPriority();

  /**
   * ProductPriceOffering reference. An amount, usually of money, that is asked
   * for or allowed when a ProductOffering is bought, rented, or leased.
   */
  IProductOfferingPriceRef getProductOfferingPrice();

  /**
   * Could be month, week...
   */
  String getRecurringChargePeriod();

  /**
   * Could be minutes, GB...
   */
  String getUnitOfMeasure();
}
