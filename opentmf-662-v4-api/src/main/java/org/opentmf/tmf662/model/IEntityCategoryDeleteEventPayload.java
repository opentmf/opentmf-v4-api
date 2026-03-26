package org.opentmf.tmf662.model;

/**
 * The event data structure.
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
public interface IEntityCategoryDeleteEventPayload {

  /**
   * The (entity) category resource is used to group entity catalog items in
   * logical containers. Categories can contain other categories.
   * <br/>Resource IDs for categories are strings and are defined by the catalog
   * application.
   */
  IEntityCategory getEntityCategory();
}
