package org.opentmf.tmf620.model;

import org.opentmf.common.model.IRelatedEntityRefOrValue;

/**
 * Describes a non-composite relationship between product offering prices. For
 * example one price might be an discount alteration for another price.
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
public interface IProductOfferingPriceRelationship extends IRelatedEntityRefOrValue {

  /**
   * type of the relationship, for example override, discount, etc.
   */
  String getRelationshipType();
}
