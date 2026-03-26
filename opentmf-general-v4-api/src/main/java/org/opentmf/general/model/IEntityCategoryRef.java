package org.opentmf.general.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Reference to Entity Category object. The (entity) category resource is used
 * to group entity catalog items in logical containers. Categories can contain
 * other categories.
 * <br/>Resource IDs for categories are strings and are defined by the catalog
 * application.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityCategoryRef extends IEntityRef {

  /**
   * Category version.
   */
  String getVersion();
}
