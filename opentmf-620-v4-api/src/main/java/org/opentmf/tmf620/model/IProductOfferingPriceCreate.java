package org.opentmf.tmf620.model;

import java.time.OffsetDateTime;

/**
 * Is based on both the basic cost to develop and produce products and the
 * enterprises policy on revenue targets. This price may be further revised
 * through discounting (a Product Offering Price that reflects an alteration).
 * The price, applied for a productOffering may also be influenced by the
 * productOfferingTerm, the customer selected, eg: a productOffering can be
 * offered with multiple terms, like commitment periods for the contract. The
 * price may be influenced by this productOfferingTerm. A productOffering may be
 * cheaper with a 24 month commitment than with a 12 month commitment.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IProductOfferingPriceCreate extends IProductOfferingPriceUpdate {

  /**
   * the immediate base class type of this product offering price.
   */
  String getAtBaseType();

  /**
   * The class type of this Product offering price.
   */
  String getAtType();

  /**
   * the last update time of this ProductOfferingPrice.
   */
  OffsetDateTime getLastUpdate();
}
