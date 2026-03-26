package org.opentmf.tmf620.model;

import java.util.List;
import org.opentmf.common.model.IAssociationBase;
import org.opentmf.common.model.IQuantity;

/**
 * This is representing a product offering price (charge) based on both the
 * basic cost to develop and produce products and the enterprises policy on
 * revenue targets. This price may be further revised through discounting (a
 * Product Offering Price that reflects an alteration).
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
public interface IPOPCharge extends IAssociationBase {

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IProductPriceValue getPrice();

  /**
   * List of: Is an amount, usually of money, that modifies the price charged for
   * an order item.
   */
  List<? extends IPOPAlteration> getPriceAlterations();

  /**
   * A category that describes the price charge, such as recurring, penalty, One
   * time fee and so forth.
   */
  String getPriceType();

  /**
   * The period type to repeat the application of the price
   * <br/>Could be month, week...
   */
  String getRecurringChargePeriod();

  /**
   * the period of the recurring charge: 1, 2, ... .It sets to zero if it is not
   * applicable.
   */
  Integer getRecurringChargePeriodLength();

  /**
   * An amount in a given unit.
   */
  IQuantity getUnitOfMeasure();
}
