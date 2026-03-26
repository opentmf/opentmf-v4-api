package org.opentmf.tmf725.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * MetadataSpecification is a class that describes the specification of a
 * specific metadata asset
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, description, name<br/>
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
public interface IMetadataSpecificationCreate extends IMetadataSpecificationUpdate {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * When subclassing, this defines the subclass Extensible name.
   */
  String getAtType();

  /**
   * Date and time of the last update of the specification.
   */
  OffsetDateTime getLastUpdate();
}
