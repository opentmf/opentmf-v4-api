package org.opentmf.tmf725.model;

import java.util.List;
import org.opentmf.common.model.IPromotionUpdateBase;
import org.opentmf.general.model.IEntityCategoryRef;

/**
 * The category resource is used to group metadata catalog items in logical
 * containers. Categories can contain other categories.
 * <br/>Resource IDs for categories are strings and are defined by the catalog
 * application.
 * <br/>Skipped properties: id,href,lastUpdate,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type.
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
public interface IMetadataCategoryUpdate extends IPromotionUpdateBase {

  /**
   * The metadata catalog items referred to by this category.
   */
  List<? extends IMetadataCatalogItemRef> getMetadataCatalogItems();

  /**
   * The child category(ies) if any, contained in this category.
   */
  List<? extends IEntityCategoryRef> getChildCategories();

  /**
   * If true, this Boolean indicates that the category is a root of categories.
   */
  Boolean getIsRoot();

  /**
   * Unique identifier of the parent category.
   */
  String getParentId();
}
