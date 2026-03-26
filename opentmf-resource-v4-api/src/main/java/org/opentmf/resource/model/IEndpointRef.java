package org.opentmf.resource.model;

import org.opentmf.common.model.IEntityRef;

/**
 * A vertex in a resource graph.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEndpointRef extends IEntityRef {

  /**
   * Connection point reference. A connection point provides a service access
   * point (SAP) for input and/or output of the resource function.
   */
  IConnectionPointRef getConnectionPoint();

  /**
   * Directionality: true when endpoint is a source, false when a sink. If true
   * for all endpoints connectivity is bidirectional. Default is true.
   */
  Boolean getIsRoot();
}
