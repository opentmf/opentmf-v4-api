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
public interface IMetadataCatalogDeleteEventPayload {

  /**
   * Additional information to describe the catalog.
   */
  IMetadataCatalog getMetadataCatalog();
}
