package org.opentmf.common.model;

import java.util.List;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType, service<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-638: Service Inventory Management API</li>
 *   <li>TMF-640: Service Activation Management API</li>
 *   <li>TMF-641: Service Ordering Management API</li>
 *   <li>TMF-645: Service Qualification Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceRelationship extends ICharacteristicRelationship {

  /**
   * A Service to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the Service entity and not the RelatedServiceRefOrValue class itself.
   */
  IServiceRefOrValue getService();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getServiceRelationshipCharacteristics();
}
