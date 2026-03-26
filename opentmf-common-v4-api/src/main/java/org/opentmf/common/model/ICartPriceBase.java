package org.opentmf.common.model;


/**
 * Synthesized abstract parent for 6 model classes.
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
public interface ICartPriceBase extends IExtensible {

  /**
   * A narrative that explains in detail the semantics of this order item price.
   */
  String getDescription();

  /**
   * A short descriptive name such as "Subscription price".
   */
  String getName();

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
