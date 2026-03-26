package org.opentmf.tmf620.model;

import java.net.URI;

/**
 * Represents entities that are orderable from the provider of the catalog, this
 * resource includes pricing information.
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
public interface IProductOffering extends IProductOfferingCreate {

  /**
   * Reference of the ProductOffering.
   */
  URI getHref();

  /**
   * Unique identifier of the productOffering.
   */
  String getId();
}
