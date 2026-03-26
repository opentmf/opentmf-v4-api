package org.opentmf.tmf633.model;

import java.time.OffsetDateTime;

/**
 * The (service) category resource is used to group service candidates in
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
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCategoryCreate extends IServiceCategoryUpdate {

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();
}
