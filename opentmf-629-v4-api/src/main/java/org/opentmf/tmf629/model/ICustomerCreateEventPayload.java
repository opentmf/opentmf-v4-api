package org.opentmf.tmf629.model;

import org.opentmf.customer.model.ICustomer;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomerCreateEventPayload {

  ICustomer getCustomer();
}
