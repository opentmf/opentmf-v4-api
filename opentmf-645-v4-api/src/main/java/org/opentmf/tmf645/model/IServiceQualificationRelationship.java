package org.opentmf.tmf645.model;

import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceQualificationRelationship extends IExtensible {

  /**
   * The id of the target qualification pointed to by this relationship.
   */
  String getId();

  /**
   * The type of relationship.
   */
  String getRelationshipType();
}
