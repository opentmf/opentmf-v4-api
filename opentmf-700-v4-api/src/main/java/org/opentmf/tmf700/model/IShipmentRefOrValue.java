package org.opentmf.tmf700.model;

import org.opentmf.partner.model.IShipment;

/**
 * A shipment defined by value or existing defined by reference. The polymorphic
 * attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are related to the
 * shipment entity and not the related ShipmentRefOrValue class itself.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShipmentRefOrValue extends IShipment {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
