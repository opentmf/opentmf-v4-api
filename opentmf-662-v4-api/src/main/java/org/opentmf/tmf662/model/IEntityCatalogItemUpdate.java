package org.opentmf.tmf662.model;

import java.util.List;
import org.opentmf.common.model.IEntityCatalogUpdateBase;
import org.opentmf.general.model.IEntityCategoryRef;
import org.opentmf.general.model.IEntitySpecificationRef;

/**
 * An EntityCatalogItem is an entity that allows any ProductOffering,
 * ServiceCandidate, ResourceCandidate, or even any object inheriting from
 * RootEntity, to be available to a catalog. The CatalogSpecification and Policy
 * of the catalog governs the content of the EntityCatalogItem. This API
 * addresses only EntitySpecification items extended from RootEntity as
 * EntityCatalogItem.
 * <br/>The EntityCatalogItem resource (JSON format) represents a set of
 * characteristics that define the values given by the EntityCatalogItem.
 * <br/>Skipped properties: id,href,lastUpdate.
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
public interface IEntityCatalogItemUpdate extends IEntityCatalogUpdateBase {

  /**
   * List of: Reference to Entity Category object. The (entity) category resource
   * is used to group entity catalog items in logical containers. Categories can
   * contain other categories.
   * <br/>Resource IDs for categories are strings and are defined by the catalog
   * application.
   */
  List<? extends IEntityCategoryRef> getCategories();

  /**
   * reference to an EntitySpecification object.
   */
  IEntitySpecificationRef getSpecification();
}
