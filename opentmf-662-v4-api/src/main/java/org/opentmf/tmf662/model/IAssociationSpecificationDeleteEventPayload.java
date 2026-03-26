package org.opentmf.tmf662.model;

/**
 * The event data structure.
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
public interface IAssociationSpecificationDeleteEventPayload {

  /**
   * AssociationSpecification is an association class that describes a type of
   * relationship between two entities. This is a generic construct that may be
   * used to describe relationship types and roles. The role and type of each
   * entity in the relationship is given by an association role specification. Two
   * role specifications are embedded in the association specification.
   */
  IAssociationSpecification getAssociationSpecification();
}
