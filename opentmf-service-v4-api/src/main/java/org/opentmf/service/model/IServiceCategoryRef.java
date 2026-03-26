package org.opentmf.service.model;

import org.opentmf.common.model.IEntityRef;

/**
 * The (service) category resource is used to group service candidates in
 * logical containers. Categories can contain other categories.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCategoryRef extends IEntityRef {

  /**
   * Category version.
   */
  String getVersion();
}
