package org.opentmf.tmf662.model;


/**
 * This embedded object represents the role and type of each entity involved in
 * a relationship.
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
public interface IAssociationRoleSpecification {

  /**
   * A flag indicates that if this role is an aggregation or a simple
   * relationship.
   */
  String getAggregation();

  /**
   * Default quantity of the association role.
   */
  Integer getDefaultQuantity();

  /**
   * The target (root) entity type associated with this role.
   */
  String getEntityType();

  /**
   * A flag indicating if access from the other end of association is allowed or
   * not.
   */
  Boolean getIsNavigable();

  /**
   * A flag indicating if the participant involved in a uni-directional
   * relationship is the source or not. This flag is true If the association is
   * bi-directional.
   */
  Boolean getIsSource();

  /**
   * Maximum allowed quantity of the association role.
   */
  Integer getMaxQuantity();

  /**
   * Minimum allowed quantity of the association role.
   */
  Integer getMinQuantity();

  /**
   * The association role of this relationship participant.
   */
  String getRole();
}
