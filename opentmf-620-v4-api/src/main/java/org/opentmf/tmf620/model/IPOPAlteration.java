package org.opentmf.tmf620.model;

import org.opentmf.common.model.IDuration;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.ITimePeriod;

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
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPOPAlteration extends INamedEntity {

  /**
   * A time interval in a given unit of time.
   */
  IDuration getApplicationDuration();

  /**
   * A narrative that explains in detail the semantics of this order item price
   * alteration.
   */
  String getDescription();

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IProductPriceValue getPrice();

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
   * Could be month, week...
   */
  String getRecurringChargePeriod();

  /**
   * An amount in a given unit.
   */
  IQuantity getUnitOfMeasure();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
