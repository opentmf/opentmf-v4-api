package org.opentmf.tmf620.model;

import org.opentmf.common.model.IExtensible;

/**
 * A set of numbers that specifies the lower and upper limits for a
 * ProductOffering that can be procured as part of the related
 * BundledProductOffering. Values can range from 0 to unbounded.
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
public interface IBundledProductOfferingOption extends IExtensible {

  /**
   * Default number of product offerings that should be procured as part of the
   * related BundledProductOffering.
   */
  Integer getNumberRelOfferDefault();

  /**
   * lower limit for a product offering that can be procured as part of the
   * related BundledProductOffering.
   */
  Integer getNumberRelOfferLowerLimit();

  /**
   * upper limit for a product offering that can be procured as part of the
   * related BundledProductOffering.
   */
  Integer getNumberRelOfferUpperLimit();
}
