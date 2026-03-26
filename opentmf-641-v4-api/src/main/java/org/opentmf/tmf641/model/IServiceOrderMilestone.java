package org.opentmf.tmf641.model;

import java.util.List;

/**
 * ServiceOrderMilestone represents an action or event marking a significant
 * change or stage in processing of a service order.
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
public interface IServiceOrderMilestone extends IMilestone {

  /**
   * A list of order item references corresponded to this milestone.
   */
  List<? extends IServiceOrderItemRef> getServiceOrderItems();
}
