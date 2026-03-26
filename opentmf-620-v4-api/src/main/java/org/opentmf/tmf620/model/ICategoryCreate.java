package org.opentmf.tmf620.model;

import java.time.OffsetDateTime;

/**
 * The category resource is used to group product offerings, service and
 * resource candidates in logical containers. Categories can contain other
 * categories and/or product offerings, resource or service candidates.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICategoryCreate extends ICategoryUpdate {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * When subclassing, this defines the subclass Extensible name.
   */
  String getAtType();

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getLastUpdate();
}
