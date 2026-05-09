package org.opentmf.tmf662.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * AssociationSpecification is an association class that describes a type of
 * relationship between two entities. This is a generic construct that may be
 * used to describe relationship types and roles. The role and type of each
 * entity in the relationship is given by an association role specification. Two
 * role specifications are embedded in the association specification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-662: Entity Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAssociationSpecification extends INamedEntity {

  /**
   * Role specifications for this association.
   */
  List<? extends IAssociationRoleSpecification> getAssociationRoleSpecs();

  /**
   * Constraints relating to this association.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * Description of the specification.
   */
  String getDescription();

  /**
   * The last modified date of this specification.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Indicates the current lifecycle status.
   */
  String getLifecycleStatus();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Version of this association.
   */
  String getVersion();
}
