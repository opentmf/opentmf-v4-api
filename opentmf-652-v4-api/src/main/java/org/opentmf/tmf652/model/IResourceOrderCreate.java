package org.opentmf.tmf652.model;

import java.time.OffsetDateTime;

/**
 * A Resource Order is a request to provision a set of Resources (logical and
 * physical) triggered by the request to provision a Service through a Service
 * Order
 * <br/>Skipped properties: id,href.
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
public interface IResourceOrderCreate extends IResourceOrderUpdate {

  /**
   * Date when the order was completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Date when the order was created.
   */
  OffsetDateTime getOrderDate();
}
