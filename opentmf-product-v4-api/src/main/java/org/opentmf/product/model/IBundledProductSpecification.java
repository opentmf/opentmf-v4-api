package org.opentmf.product.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A type of ProductSpecification that belongs to a grouping of
 * ProductSpecifications made available to the market. It inherits of all
 * attributes of ProductSpecification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IBundledProductSpecification extends INamedEntity {

  /**
   * Used to indicate the current lifecycle status.
   */
  String getLifecycleStatus();
}
