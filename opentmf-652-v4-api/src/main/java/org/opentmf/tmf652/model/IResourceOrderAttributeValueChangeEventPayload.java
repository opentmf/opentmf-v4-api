package org.opentmf.tmf652.model;

/**
 * The event data structure.
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
public interface IResourceOrderAttributeValueChangeEventPayload {

  /**
   * A Resource Order is a request to provision a set of Resources (logical and
   * physical) triggered by the request to provision a Service through a Service
   * Order.
   */
  IResourceOrder getResourceOrder();
}
