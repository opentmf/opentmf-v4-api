package org.opentmf.tmf641.model;

import org.opentmf.common.model.ICancelOrder;

/**
 * Request for cancellation an existing Service order.
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
public interface ICancelServiceOrder extends ICancelOrder {

  /**
   * an optional message describing the completion of the task if it is done as
   * expected or it is denied for a reason (like order in an state of PoNR).
   */
  String getCompletionMessage();

  /**
   * represents an Error.
   */
  IErrorMessage getErrorMessage();

  /**
   * Service Order reference. Useful to understand the which was the Service order
   * through which the service was instantiated in the service inventory.
   */
  IServiceOrderRef getServiceOrder();
}
