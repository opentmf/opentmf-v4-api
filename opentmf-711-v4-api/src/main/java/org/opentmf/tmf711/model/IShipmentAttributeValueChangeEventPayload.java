package org.opentmf.tmf711.model;

import org.opentmf.partner.model.IShipment;

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
public interface IShipmentAttributeValueChangeEventPayload {

  IShipment getShipment();
}
