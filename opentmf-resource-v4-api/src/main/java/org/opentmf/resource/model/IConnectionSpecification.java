package org.opentmf.resource.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;

/**
 * A specification for an edge in a resource graph.
 *
 * <p><br/>
 * <strong>Required:</strong> associationType, endpointSpecification<br/>
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
public interface IConnectionSpecification extends INamedEntity {

  /**
   * Association type.
   */
  String getAssociationType();

  /**
   * Specifications for resource graph vertices connected by this edge.
   */
  List<? extends IEndpointSpecificationRef> getEndpointSpecifications();
}
