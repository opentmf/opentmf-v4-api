package org.opentmf.tmf620.model;

import org.opentmf.product.model.IProductSpecification;

/**
 * The event data structure.
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
public interface IProductSpecificationAttributeValueChangeEventPayload {

  /**
   * Is a detailed description of a tangible or intangible object made available
   * externally in the form of a ProductOffering to customers or other parties
   * playing a party role.
   */
  IProductSpecification getProductSpecification();
}
