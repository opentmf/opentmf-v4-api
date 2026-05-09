package org.opentmf.customer.model;

import java.net.URI;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> engagedParty<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer extends ICustomerUpdate {

  /**
   * Url used to reference the customer.
   */
  URI getHref();

  /**
   * Unique identifier for Customers.
   */
  String getId();
}
