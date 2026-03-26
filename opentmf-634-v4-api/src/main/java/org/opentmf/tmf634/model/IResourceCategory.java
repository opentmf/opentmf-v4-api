package org.opentmf.tmf634.model;

import java.net.URI;

/**
 * The (resource) category resource is used to group resource candidates in
 * logical containers. Categories can contain other categories.
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
public interface IResourceCategory extends IResourceCategoryUpdate {

  /**
   * Hyperlink reference to the category.
   */
  URI getHref();

  /**
   * Unique identifier of the category.
   */
  String getId();
}
