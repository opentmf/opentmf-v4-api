package org.opentmf.tmf662.model;

import java.time.OffsetDateTime;

/**
 * The (entity) category resource is used to group entity catalog items in
 * logical containers. Categories can contain other categories.
 * <br/>Resource IDs for categories are strings and are defined by the catalog
 * application.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
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
public interface IEntityCategoryCreate extends IEntityCategoryUpdate {

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();
}
