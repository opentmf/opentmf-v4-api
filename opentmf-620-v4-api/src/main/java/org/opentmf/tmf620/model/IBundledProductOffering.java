package org.opentmf.tmf620.model;

import org.opentmf.product.model.IBundledProductSpecification;

/**
 * A type of ProductOffering that belongs to a grouping of ProductOfferings made
 * available to the market. It inherits of all attributes of ProductOffering.
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
public interface IBundledProductOffering extends IBundledProductSpecification {

  /**
   * A set of numbers that specifies the lower and upper limits for a
   * ProductOffering that can be procured as part of the related
   * BundledProductOffering. Values can range from 0 to unbounded.
   */
  IBundledProductOfferingOption getBundledProductOfferingOption();
}
