package org.opentmf.resource.model;

import org.opentmf.common.model.ICharacteristicRelationship;

/**
 * Describes link between resource graph specifications.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceGraphSpecificationRelationship extends ICharacteristicRelationship {

  /**
   * Resource graph specification reference.
   */
  IResourceGraphSpecificationRef getResourceGraph();
}
