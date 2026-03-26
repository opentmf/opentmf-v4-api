package org.opentmf.tmf725.model;

import java.net.URI;

/**
 * MetadataSpecification is a class that describes the specification of a
 * specific metadata asset.
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
public interface IMetadataSpecification extends IMetadataSpecificationCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
