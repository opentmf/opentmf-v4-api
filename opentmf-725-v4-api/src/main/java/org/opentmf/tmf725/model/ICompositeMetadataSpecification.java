package org.opentmf.tmf725.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A type of MetadataSpecification that belongs to a grouping of
 * MetadataSpecifications. It inherits of all attributes of
 * MetadataSpecification.
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
public interface ICompositeMetadataSpecification extends INamedEntity {

  /**
   * Used to indicate the current lifecycle status.
   */
  String getLifecycleStatus();
}
