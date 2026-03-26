package org.opentmf.tmf725.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * An MetadataCatalogItem is an entity that allows any metadata asset or even
 * any object inheriting from RootEntity, to be available to a catalog. The
 * MetadataSpecification and Policy of the catalog governs the content of the
 * MetadataCatalogItem. This API addresses only MetadataSpecification items
 * extended from RootEntity as MetadataCatalogItem.
 * <br/>The MetadataCatalogItem resource (JSON format) represents a set of
 * characteristics that define the values given by the MetadataCatalogItem.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> description, name, specification<br/>
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
public interface IMetadataCatalogItemCreate extends IMetadataCatalogItemUpdate {

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
   * Date and time of the last update of this REST resource.
   */
  OffsetDateTime getLastUpdate();
}
