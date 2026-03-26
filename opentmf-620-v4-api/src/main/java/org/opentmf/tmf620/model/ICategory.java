package org.opentmf.tmf620.model;

import java.net.URI;

/**
 * The category resource is used to group product offerings, service and
 * resource candidates in logical containers. Categories can contain other
 * categories and/or product offerings, resource or service candidates.
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
public interface ICategory extends ICategoryCreate {

  /**
   * Reference of the category.
   */
  URI getHref();

  /**
   * Unique identifier of the category.
   */
  String getId();
}
