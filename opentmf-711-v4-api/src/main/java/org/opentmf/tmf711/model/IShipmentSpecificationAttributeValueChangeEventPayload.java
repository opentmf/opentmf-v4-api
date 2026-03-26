package org.opentmf.tmf711.model;

import org.opentmf.partner.model.IShipmentSpecification;

/**
 * The event data structure.
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
public interface IShipmentSpecificationAttributeValueChangeEventPayload {

  /**
   * Definition of the nature of a Shipment. For example, could be a standard
   * ground delivery, overnight express with signature required by an adult, etc.
   */
  IShipmentSpecification getShipmentSpecification();
}
