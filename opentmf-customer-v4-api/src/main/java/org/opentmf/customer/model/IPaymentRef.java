package org.opentmf.customer.model;

import org.opentmf.common.model.IEntityRef;

/**
 * If an immediate payment has been done at the product order submission, the
 * payment information are captured and stored (as a reference) in the order.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-676: Payment Management API</li>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPaymentRef extends IEntityRef {
}
