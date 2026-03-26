package org.opentmf.tmf641.model;

import java.util.List;

/**
 * A ServiceOrderErrorMessage represents an error that causes a status change in
 * a service order.
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
public interface IServiceOrderErrorMessage extends IServiceOrderItemErrorMessage {

  /**
   * A list of order item references corresponded to this error.
   */
  List<? extends IServiceOrderItemRef> getServiceOrderItems();
}
