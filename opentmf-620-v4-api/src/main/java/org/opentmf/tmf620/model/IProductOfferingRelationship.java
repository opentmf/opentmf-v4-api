package org.opentmf.tmf620.model;

import org.opentmf.product.model.IProductSpecificationRelationship;

/**
 * A relationship between two product Offerings.
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
public interface IProductOfferingRelationship extends IProductSpecificationRelationship {

  /**
   * The association role for the source product offering.
   */
  String getRole();
}
