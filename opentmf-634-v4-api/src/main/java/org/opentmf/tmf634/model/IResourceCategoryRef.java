package org.opentmf.tmf634.model;

import org.opentmf.common.model.IEntityRef;

/**
 * The (resource) category resource is used to group resource candidates in
 * logical containers. Categories can contain other categories.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
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
public interface IResourceCategoryRef extends IEntityRef {

  /**
   * Category version.
   */
  String getVersion();
}
