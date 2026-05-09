package org.opentmf.tmf620.model;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import org.opentmf.common.model.IBundledProductOfferingPriceRelationship;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IPlaceRef;
import org.opentmf.common.model.IProductOfferingUpdateBase;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.ITaxItem;

/**
 * Is based on both the basic cost to develop and produce products and the
 * enterprises policy on revenue targets. This price may be further revised
 * through discounting (a Product Offering Price that reflects an alteration).
 * The price, applied for a productOffering may also be influenced by the
 * productOfferingTerm, the customer selected, eg: a productOffering can be
 * offered with multiple terms, like commitment periods for the contract. The
 * price may be influenced by this productOfferingTerm. A productOffering may be
 * cheaper with a 24 month commitment than with a 12 month commitment.
 * <br/>Skipped properties: id,href,lastUpdate,{@literal @}type,{@literal @}baseType.
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
public interface IProductOfferingPriceUpdate extends IProductOfferingUpdateBase {

  /**
   * hyperlink reference to the schema describing this resource.
   */
  URI getAtSchemaLocation();

  /**
   * this object represents a bundle relationship from a bundle product offering
   * price (parent) to a simple product offering price (child). A simple product
   * offering price may participate in more than one bundle relationship.
   */
  List<? extends IBundledProductOfferingPriceRelationship> getBundledPopRelationships();

  /**
   * The Constraint resource represents a policy/rule applied to
   * ProductOfferingPrice.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * Percentage to apply if this Product Offering Price is an Alteration (such as
   * a Discount).
   */
  BigDecimal getPercentage();

  /**
   * Place defines the places where the products are sold or delivered.
   */
  List<? extends IPlaceRef> getPlaces();

  /**
   * Product Offering Prices related to this Product Offering Price, for example a
   * price alteration such as allowance or discount.
   */
  List<? extends IProductOfferingPriceRelationship> getPopRelationships();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getPrice();

  /**
   * A category that describes the price, such as recurring, discount, allowance,
   * penalty, and so forth.
   */
  String getPriceType();

  /**
   * The PricingLogicAlgorithm entity represents an instantiation of an interface
   * specification to external rating function (without a modeled behavior in
   * SID). Some of the parameters of the interface definition may be already set
   * (such as price per unit) and some may be gathered during the rating process
   * from the event (such as call duration) or from ProductCharacteristicValues
   * (such as assigned bandwidth).
   */
  List<? extends IPricingLogicAlgorithm> getPricingLogicAlgorithms();

  /**
   * A use of the ProductSpecificationCharacteristicValue by a
   * ProductOfferingPrice to which additional properties (attributes) apply or
   * override the properties of similar properties contained in
   * ProductSpecificationCharacteristicValue. It should be noted that
   * characteristics which their value(s) addressed by this object must exist in
   * corresponding product specification. The available characteristic values for
   * a ProductSpecificationCharacteristic in a Product specification can be
   * modified at the ProductOffering and ProductOfferingPrice level. The list of
   * values in ProductSpecificationCharacteristicValueUse is a strict subset of
   * the list of values as defined in the corresponding product specification
   * characteristics.
   */
  List<? extends IProductSpecificationCharacteristicValueUse> getProdSpecCharValueUses();

  /**
   * A list of conditions under which a ProductOfferingPrice is made available to
   * Customers. For instance, a Product Offering Price can be offered with
   * multiple commitment periods.
   */
  List<? extends IProductOfferingTerm> getProductOfferingTerms();

  /**
   * the period of the recurring charge: 1, 2, ... .It sets to zero if it is not
   * applicable.
   */
  Integer getRecurringChargePeriodLength();

  /**
   * The period to repeat the application of the price
   * <br/>Could be month, week...
   */
  String getRecurringChargePeriodType();

  /**
   * An amount of money levied on the price of a Product by a legislative body.
   */
  List<? extends ITaxItem> getTaxes();

  /**
   * An amount in a given unit.
   */
  IQuantity getUnitOfMeasure();
}
