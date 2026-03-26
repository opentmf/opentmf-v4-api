package org.opentmf.resource.model;

import org.opentmf.common.model.IResource;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-639: Resource Inventory Management API</li>
 *   <li>TMF-702: Resource Activation Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceCreateEventPayload {

  /**
   * Resource is an abstract entity that describes the common set of attributes
   * shared by all concrete resources (e.g. TPE, EQUIPMENT) in the inventory.
   */
  IResource getResource();
}
