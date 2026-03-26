package org.opentmf.tmf634.model;

import java.util.List;
import org.opentmf.common.model.IResourceCandidateRef;

/**
 * The (resource) category resource is used to group resource candidates in
 * logical containers. Categories can contain other categories.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceCategoryCreate extends IResourceCatalogUpdate {

  /**
   * If true, this Boolean indicates that the category is a root of categories.
   */
  Boolean getIsRoot();

  /**
   * Unique identifier of the parent category.
   */
  String getParentId();

  /**
   * List of resource candidates accessible via this category.
   */
  List<? extends IResourceCandidateRef> getResourceCandidates();
}
