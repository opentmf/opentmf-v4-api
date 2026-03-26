package org.opentmf.tmf662.model;

import java.net.URI;

/**
 * The (entity) category resource is used to group entity catalog items in
 * logical containers. Categories can contain other categories.
 * <br/>Resource IDs for categories are strings and are defined by the catalog
 * application.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-662: Entity Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityCategory extends IEntityCategoryCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
