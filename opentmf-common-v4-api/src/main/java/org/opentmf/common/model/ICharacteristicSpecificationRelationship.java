package org.opentmf.common.model;

import java.net.URI;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among Characteristic specifications. The specification
 * characteristic is embedded within the specification whose ID and href are in
 * this entity, and identified by its ID.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-653: Service Test Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-701: Process Flow Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICharacteristicSpecificationRelationship extends IFeatureRelationship {

  /**
   * Unique identifier of the characteristic within the specification.
   */
  String getCharacteristicSpecificationId();

  /**
   * Hyperlink reference to the parent specification containing the target
   * characteristic.
   */
  URI getParentSpecificationHref();

  /**
   * Unique identifier of the parent specification containing the target
   * characteristic.
   */
  String getParentSpecificationId();
}
