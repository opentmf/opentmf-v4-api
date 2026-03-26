package org.opentmf.tmf620.model;

import java.time.OffsetDateTime;

/**
 * Represents entities that are orderable from the provider of the catalog, this
 * resource includes pricing information.
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
public interface IProductOfferingCreate extends IProductOfferingUpdate {

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
