package org.opentmf.general.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAssociationSpecificationRef;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * Association is the class that describes a relationship between two or more
 * entities or entity specifications based on a given association specification.
 * The role of each endpoint in the relationship is given by an association
 * role. The type of endpoints in the relationship should match the ones as
 * defined in the corresponding association role specification. A relationship
 * between entity specifications may be governed by conditions and rules which
 * are addressed by constraint references in this resource. Constraints for a
 * relationship may include new rules and conditions in addition to those
 * defined for the corresponding association specification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-703: Entity Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAssociation extends INamedEntity {

  /**
   * The end point roles of this association.
   */
  List<? extends IAssociationRole> getAssociationRoles();

  /**
   * reference to an AssociationSpecification object.
   */
  IAssociationSpecificationRef getAssociationSpec();

  /**
   * Any constraints in this association.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * Description of the association.
   */
  String getDescription();

  /**
   * The last modified date of this association object.
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
   * Version of this REST resource.
   */
  String getVersion();
}
