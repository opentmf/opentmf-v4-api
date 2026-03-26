package org.opentmf.resource.model;

import org.opentmf.common.model.IEntityRef;

/**
 * A specification for a vertex in a resource graph.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
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
public interface IEndpointSpecificationRef extends IEntityRef {

  /**
   * Connection point specification reference. A connection point provides a
   * service access point (SAP) for input and/or output of the resource function.
   */
  IConnectionPointSpecificationRef getConnectionPointSpecification();

  /**
   * Directionality: true when endpoint is a source, false when a sink. If true
   * for all endpoints connectivity is bidirectional. Default is true.
   */
  Boolean getIsRoot();

  /**
   * Role of the Resource Function.
   */
  String getRole();
}
