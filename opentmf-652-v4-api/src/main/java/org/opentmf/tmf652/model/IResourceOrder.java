package org.opentmf.tmf652.model;

import java.net.URI;

/**
 * A Resource Order is a request to provision a set of Resources (logical and
 * physical) triggered by the request to provision a Service through a Service
 * Order.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrder extends IResourceOrderCreate {

  /**
   * Hyperlink to access the order.
   */
  URI getHref();

  /**
   * Identifier of an instance of the Resource Order. Required to be unique within
   * the resource type. Used in URIs as the identifier for specific instances of a
   * type.
   */
  String getId();
}
