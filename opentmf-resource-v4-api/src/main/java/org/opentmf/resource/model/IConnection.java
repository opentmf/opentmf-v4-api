package org.opentmf.resource.model;

import org.opentmf.common.model.INamedEntity;

/**
 * An edge in a resource graph.
 *
 * <p><br/>
 * <strong>Required:</strong> associationType, endpoint<br/>
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
public interface IConnection extends INamedEntity {

  /**
   * Association type.
   */
  String getAssociationType();

  /**
   * A vertex in a resource graph.
   */
  IEndpointRef getEndpoint();
}
