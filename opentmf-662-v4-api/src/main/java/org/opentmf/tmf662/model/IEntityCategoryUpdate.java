package org.opentmf.tmf662.model;

import java.util.List;
import org.opentmf.common.model.IEntityCatalogUpdateBase;
import org.opentmf.general.model.IEntityCategoryRef;

/**
 * The (entity) category resource is used to group entity catalog items in
 * logical containers. Categories can contain other categories.
 * <br/>Resource IDs for categories are strings and are defined by the catalog
 * application.
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
public interface IEntityCategoryUpdate extends IEntityCatalogUpdateBase {

  /**
   * The child category(ies) if any, contained in this category.
   */
  List<? extends IEntityCategoryRef> getChildCategories();

  /**
   * The catalog items referred to by this category.
   */
  List<? extends IEntityCatalogItemRef> getEntityCatalogItems();

  /**
   * If true, this Boolean indicates that the category is a root of categories.
   */
  Boolean getIsRoot();

  /**
   * Unique identifier of the parent category.
   */
  String getParentId();
}
