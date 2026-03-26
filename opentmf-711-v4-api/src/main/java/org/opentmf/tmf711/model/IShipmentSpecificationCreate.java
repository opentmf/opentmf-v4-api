package org.opentmf.tmf711.model;

import java.time.OffsetDateTime;

/**
 * Definition of the nature of a Shipment. For example, could be a standard
 * ground delivery, overnight express with signature required by an adult, etc.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-711: Shipment Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShipmentSpecificationCreate extends IShipmentSpecificationUpdate {

  /**
   * Date and time of the last update of this REST resource.
   */
  OffsetDateTime getLastUpdate();
}
