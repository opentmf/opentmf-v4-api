package org.opentmf.tmf634.model;

import java.net.URI;

/**
 * The root entity for resource catalog management.
 * <br/>A resource catalog is a group of resource specifications made available
 * through resource candidates that an organization provides to the consumers
 * (internal consumers like its employees or B2B customers or B2C customers).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceCatalog extends IResourceCatalogUpdate {

  /**
   * Unique reference of the catalog.
   */
  URI getHref();

  /**
   * Unique identifier of the Catalog.
   */
  String getId();
}
