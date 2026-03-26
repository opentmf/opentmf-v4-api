package org.opentmf.tmf725.model;

import java.net.URI;

/**
 * The category resource is used to group metadata catalog items in logical
 * containers. Categories can contain other categories.
 * <br/>Resource IDs for categories are strings and are defined by the catalog
 * application.
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
public interface IMetadataCategory extends IMetadataCategoryCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
