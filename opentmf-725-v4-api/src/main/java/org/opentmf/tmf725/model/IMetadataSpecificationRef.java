package org.opentmf.tmf725.model;

import org.opentmf.common.model.IEntityRef;

/**
 * reference to an MetadataSpecification object.
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
public interface IMetadataSpecificationRef extends IEntityRef {

  /**
   * MetadataSpecification version.
   */
  String getVersion();
}
