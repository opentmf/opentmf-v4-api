package org.opentmf.tmf632.model;

import org.opentmf.common.model.IExtensible;

/**
 * Child references of an organization in a structure of organizations.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IOrganizationChildRelationship extends IExtensible {

  IOrganizationRef getOrganization();

  /**
   * Type of the relationship. Could be juridical, hierarchical, geographical,
   * functional for example.
   */
  String getRelationshipType();
}
