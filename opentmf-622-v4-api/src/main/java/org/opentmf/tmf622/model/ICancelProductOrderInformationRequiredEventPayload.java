package org.opentmf.tmf622.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICancelProductOrderInformationRequiredEventPayload {

  /**
   * Request for cancellation an existing product order.
   */
  ICancelProductOrder getCancelProductOrder();
}
