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
public interface ICancelResourceOrderInformationRequiredEventPayload {

  /**
   * Request for cancellation an existing resource order.
   */
  ICancelResourceOrder getCancelResourceOrder();
}
