package org.opentmf.tmf662.model;

import java.net.URI;

/**
 * An EntityCatalogItem is an entity that allows any ProductOffering,
 * ServiceCandidate, ResourceCandidate, or even any object inheriting from
 * RootEntity, to be available to a catalog. The CatalogSpecification and Policy
 * of the catalog governs the content of the EntityCatalogItem. This API
 * addresses only EntitySpecification items extended from RootEntity as
 * EntityCatalogItem.
 * <br/>The EntityCatalogItem resource (JSON format) represents a set of
 * characteristics that define the values given by the EntityCatalogItem.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-662: Entity Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityCatalogItem extends IEntityCatalogItemCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
