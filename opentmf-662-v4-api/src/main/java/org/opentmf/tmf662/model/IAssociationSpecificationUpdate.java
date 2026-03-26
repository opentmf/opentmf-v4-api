package org.opentmf.tmf662.model;

import java.util.List;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.IEntityCatalogUpdateBase;

/**
 * AssociationSpecification is an association class that describes a type of
 * relationship between two entities. This is a generic construct that may be
 * used to describe relationship types and roles. The role and type of each
 * entity in the relationship is given by an association role specification. Two
 * role specifications are embedded in the association specification.
 * <br/>Skipped properties: id,href,lastUpdate.
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
public interface IAssociationSpecificationUpdate extends IEntityCatalogUpdateBase {

  /**
   * This embedded object represents the role and type of each entity involved in
   * a relationship.
   */
  IAssociationRoleSpecification getAssociationRoleSpec();

  /**
   * Constraints relating to this association.
   */
  List<? extends IConstraintRef> getConstraints();
}
