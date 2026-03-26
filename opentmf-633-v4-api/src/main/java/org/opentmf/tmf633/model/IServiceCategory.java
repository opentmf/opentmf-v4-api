package org.opentmf.tmf633.model;

import java.net.URI;

/**
 * The (service) category resource is used to group service candidates in
 * logical containers. Categories can contain other categories.
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
public interface IServiceCategory extends IServiceCategoryCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
