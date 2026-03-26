package org.opentmf.tmf725.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Reference to Metadata Category object. The metadata category resource is used
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
 *   <li>TMF-725: Metadata Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMetadataCategoryRef extends IEntityRef {

  /**
   * Category version.
   */
  String getVersion();
}
