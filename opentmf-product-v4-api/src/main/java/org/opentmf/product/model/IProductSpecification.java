package org.opentmf.product.model;

import java.net.URI;

/**
 * Is a detailed description of a tangible or intangible object made available
 * externally in the form of a ProductOffering to customers or other parties
 * playing a party role.
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
public interface IProductSpecification extends IProductSpecificationCreate {

  /**
   * Reference of the product specification.
   */
  URI getHref();

  /**
   * Unique identifier of the product specification.
   */
  String getId();
}
