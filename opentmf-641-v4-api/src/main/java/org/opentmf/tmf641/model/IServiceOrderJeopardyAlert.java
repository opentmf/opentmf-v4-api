package org.opentmf.tmf641.model;

import java.util.List;
import org.opentmf.common.model.IServiceOrderItemRef;

/**
 * A ServiceOrderJeopardyAlert represents a predicted exception during a service
 * order processing that would brings risk to complete successfully the order.
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
public interface IServiceOrderJeopardyAlert extends IJeopardyAlert {

  /**
   * A list of order item references corresponded to this alert.
   */
  List<? extends IServiceOrderItemRef> getServiceOrderItems();
}
