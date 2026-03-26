package org.opentmf.tmf725.model;

/**
 * The event data structure.
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
public interface IMetadataSpecificationAttributeValueChangeEventPayload {

  /**
   * MetadataSpecification is a class that describes the specification of a
   * specific metadata asset.
   */
  IMetadataSpecification getMetadataSpecification();
}
