package org.opentmf.general.model;

import java.util.List;
import org.opentmf.common.model.IAssociationCreateBase;
import org.opentmf.common.model.IAssociationSpecificationRef;
import org.opentmf.common.model.IConstraintRef;

/**
 * Association is the class that describes a relationship between two or more
 * entities or entity specifications based on a given association specification.
 * The role of each endpoint in the relationship is given by an association
 * role. The type of endpoints in the relationship should match the ones as
 * defined in the corresponding association role specification. A relationship
 * between entity specifications may be governed by conditions and rules which
 * are addressed by constraint references in this resource. Constraints for a
 * relationship may include new rules and conditions in addition to those
 * defined for the corresponding association specification
 * <br/>Skipped properties: id,href,lastUpdate.
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
public interface IAssociationUpdate extends IAssociationCreateBase {

  /**
   * This embedded object represents the role and type of each entity involved in
   * a relationship.
   */
  IAssociationRole getAssociationRole();

  /**
   * reference to an AssociationSpecification object.
   */
  IAssociationSpecificationRef getAssociationSpec();

  /**
   * Any constraints in this association.
   */
  List<? extends IConstraintRef> getConstraints();
}
