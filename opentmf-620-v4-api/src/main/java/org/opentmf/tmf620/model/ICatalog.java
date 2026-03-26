package org.opentmf.tmf620.model;

import java.net.URI;

/**
 * A collection of Product Offerings, intended for a specific
 * DistributionChannel, enhanced with additional information such as SLA
 * parameters, invoicing and shipping details.
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
public interface ICatalog extends ICatalogCreate {

  /**
   * Unique reference of the catalog.
   */
  URI getHref();

  /**
   * Unique identifier of the Catalog.
   */
  String getId();
}
