package org.opentmf.tmf641.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICancelServiceOrderInformationRequiredEventPayload {

  /**
   * Request for cancellation an existing Service order.
   */
  ICancelServiceOrder getCancelServiceOrder();
}
