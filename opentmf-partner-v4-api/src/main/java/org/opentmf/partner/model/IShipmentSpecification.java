package org.opentmf.partner.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.ICharacteristicSpecification;

/**
 * Definition of the nature of a Shipment. For example, could be a standard
 * ground delivery, overnight express with signature required by an adult, etc.
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
public interface IShipmentSpecification extends IShipmentSpecificationCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();

  /**
   * List of characteristics that the shipment can take.
   */
  List<? extends ICharacteristicSpecification> getShipmentSpecificationCharacteristics();
}
