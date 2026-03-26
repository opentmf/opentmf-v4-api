package org.opentmf.general.model;

/**
 * The event data structure.
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
public interface IAssociationDeleteEventPayload {

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
   */
  IAssociation getAssociation();
}
