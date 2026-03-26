package org.opentmf.general.model;

import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;

/**
 * This embedded object represents the role and type of each entity involved in
 * a relationship.
 *
 * <p><br/>
 * <strong>Required:</strong> entity, role<br/>
 * </p>
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
public interface IAssociationRole extends IExtensible {

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getEntity();

  /**
   * A flag indicating if the participant involved in a relationship is the source
   * or not. If this flag is true for both roles in an association, the
   * association is bi-directional (both end points are navigable).
   */
  Boolean getIsSource();

  /**
   * The association role of this relationship participant as defined in the
   * associationRoleSpecification.
   */
  String getRole();
}
