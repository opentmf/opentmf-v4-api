package org.opentmf.partner.model;


/**
 * A shipment specification defined by value or existing defined by reference.
 * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are
 * related to the shipment specification entity and not the related
 * ShipmentSpecificationRefOrValue class itself.
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
public interface IShipmentSpecificationRefOrValue extends IShipmentSpecification {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
