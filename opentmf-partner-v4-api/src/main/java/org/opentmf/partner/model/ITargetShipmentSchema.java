package org.opentmf.partner.model;

import java.net.URI;

/**
 * The reference object to the schema and type of target shipment which is
 * described by shipment specification.
 *
 * <p><br/>
 * <strong>Required:</strong> @schemaLocation, @type<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITargetShipmentSchema {

  /**
   * This field provides a link to the schema describing the target shipment.
   */
  URI getAtSchemaLocation();

  /**
   * Class type of the target shipment.
   */
  String getAtType();
}
