package org.opentmf.tmf662.model;

import java.util.List;
import org.opentmf.common.model.IAssociationBase;

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
public interface IAssociationSpecification extends IAssociationBase {

  /**
   * Role specifications for this association.
   */
  List<? extends IAssociationRoleSpecification> getAssociationRoleSpecs();
}
