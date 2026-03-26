package org.opentmf.resource.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;

/**
 * Resource graph specification.
 *
 * <p><br/>
 * <strong>Required:</strong> connectionSpecification<br/>
 * </p>
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
public interface IResourceGraphSpecification extends INamedEntity {

  /**
   * Resource graph edge specifications.
   */
  List<? extends IConnectionSpecification> getConnectionSpecifications();

  /**
   * Description of the resource graph specification.
   */
  String getDescription();

  /**
   * Relationships to other resource graph specifications.
   */
  List<? extends IResourceGraphSpecificationRelationship> getGraphSpecificationRelationships();
}
