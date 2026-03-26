package org.opentmf.general.model;

import org.opentmf.common.model.IAssociationSpecificationRef;
import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * A uni-directionmal relationship from this entity to a target entity instance.
 *
 * <p><br/>
 * <strong>Required:</strong> entity, relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-703: Entity Inventory Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityRelationship extends IExtensible {

  /**
   * reference to an AssociationSpecification object.
   */
  IAssociationSpecificationRef getAssociationSpec();

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getEntity();

  /**
   * Type of relationship such as containment, substitution, dependency,
   * exclusivity.
   */
  String getRelationshipType();

  /**
   * The association role for this entity.
   */
  String getRole();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
