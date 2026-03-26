package org.opentmf.tmf715.model;

import java.time.OffsetDateTime;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWarrantySpecificationCreate extends IWarrantySpecificationUpdate {

  /**
   * Date and time of the last update of the specification.
   */
  OffsetDateTime getLastUpdate();
}
