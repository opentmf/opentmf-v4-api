package org.opentmf.tmf725.model;

import org.opentmf.common.model.IEntityRef;

/**
 * Reference to Metadata Category Item object.
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
public interface IMetadataCatalogItemRef extends IEntityRef {

  /**
   * Catalog Item version.
   */
  String getVersion();
}
