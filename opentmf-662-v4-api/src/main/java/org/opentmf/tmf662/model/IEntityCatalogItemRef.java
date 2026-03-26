package org.opentmf.tmf662.model;

import org.opentmf.common.model.IEntityRef;

/**
 * reference to EntityCatalogItem object.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
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
public interface IEntityCatalogItemRef extends IEntityRef {

  /**
   * EntityCatalogItem version.
   */
  String getVersion();
}
