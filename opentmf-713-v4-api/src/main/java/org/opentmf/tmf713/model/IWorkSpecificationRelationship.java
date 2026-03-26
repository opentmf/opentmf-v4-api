package org.opentmf.tmf713.model;

import org.opentmf.common.model.IAssociationSpecificationRef;
import org.opentmf.common.model.IRelatedEntityRefOrValue;
import org.opentmf.common.model.ITimePeriod;

/**
 * A migration, substitution, dependency or exclusivity relationship
 * between/among entity specifications.
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkSpecificationRelationship extends IRelatedEntityRefOrValue {

  /**
   * reference to an AssociationSpecification object.
   */
  IAssociationSpecificationRef getAssociationSpec();

  /**
   * Type of relationship such as migration, substitution, dependency,
   * exclusivity.
   */
  String getRelationshipType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
