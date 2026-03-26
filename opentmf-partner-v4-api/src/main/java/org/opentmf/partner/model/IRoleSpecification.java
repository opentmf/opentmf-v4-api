package org.opentmf.partner.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A RoleSpecification represents a specification of a role.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 *   <li>TMF-668: Partnership Type</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRoleSpecification extends INamedEntity {

  /**
   * An explanatory text documenting the role specification.
   */
  String getDescription();
}
