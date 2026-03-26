package org.opentmf.tmf633.model;

import java.util.List;
import org.opentmf.common.model.IEntityCatalogUpdateBase;
import org.opentmf.common.model.IServiceCandidateRef;
import org.opentmf.service.model.IServiceCategoryRef;

/**
 * The (service) category resource is used to group service candidates in
 * logical containers. Categories can contain other categories.
 * <br/>Skipped properties: id,href,lastUpdate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCategoryUpdate extends IEntityCatalogUpdateBase {

  /**
   * List of child categories in the tree for in this category.
   */
  List<? extends IServiceCategoryRef> getCategories();

  /**
   * If true, this Boolean indicates that the category is a root of categories.
   */
  Boolean getIsRoot();

  /**
   * Unique identifier of the parent category.
   */
  String getParentId();

  /**
   * List of service candidates associated with this category.
   */
  List<? extends IServiceCandidateRef> getServiceCandidates();
}
