package org.opentmf.common.model;

import java.net.URI;

/**
 * Resource is an abstract entity that describes the common set of attributes
 * shared by all concrete resources (e.g. TPE, EQUIPMENT) in the inventory.
 *
 * <p><br/>
 * <strong>Required:</strong> href, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-639: Resource Inventory Management API</li>
 *   <li>TMF-652: Resource Order Management API</li>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 *   <li>TMF-702: Resource Activation Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-716: ResourceReservation</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResource extends IResourceUpdate {

  /**
   * The URI for the object itself.
   */
  URI getHref();

  /**
   * Identifier of an instance of the resource. Required to be unique within the
   * resource type. Used in URIs as the identifier for specific instances of a
   * type.
   */
  String getId();
}
