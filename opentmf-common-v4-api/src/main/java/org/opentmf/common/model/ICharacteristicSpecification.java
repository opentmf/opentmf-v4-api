package org.opentmf.common.model;

import java.util.List;

/**
 * This class defines a characteristic specification.
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
public interface ICharacteristicSpecification extends ICharacteristicSpecificationBase {

  /**
   * An aggregation, migration, substitution, dependency or exclusivity
   * relationship between/among Specification Characteristics.
   */
  List<? extends ICharacteristicSpecificationRelationship> getCharSpecRelationships();

  /**
   * A CharacteristicValueSpecification object is used to define a set of
   * attributes, each of which can be assigned to a corresponding set of
   * attributes in a CharacteristicSpecification object. The values of the
   * attributes in the CharacteristicValueSpecification object describe the values
   * of the attributes that a corresponding Characteristic object can take on.
   */
  List<? extends ICharacteristicValueSpecification> getCharacteristicValueSpecifications();
}
