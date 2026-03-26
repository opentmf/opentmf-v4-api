package org.opentmf.common.model;

import java.util.List;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkRelationship extends ICharacteristicRelationship {

  /**
   * A Unit of Work defined by value or existing defined by reference. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are related
   * to the work entity and not the related WorkRefOrValue class itself.
   */
  IWorkRefOrValue getWork();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getWorkRelationshipCharacteristics();
}
