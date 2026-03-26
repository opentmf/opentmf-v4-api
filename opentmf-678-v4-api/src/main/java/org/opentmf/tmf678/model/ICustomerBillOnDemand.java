package org.opentmf.tmf678.model;

import java.net.URI;

/**
 * This resource is used to manage the creation request of a customer bill in
 * real-time (on demand).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomerBillOnDemand extends ICustomerBillOnDemandCreate {

  /**
   * Reference of the customer bill on demand request.
   */
  URI getHref();

  /**
   * Unique identifier of the customer bill on demand request given by the server.
   */
  String getId();
}
