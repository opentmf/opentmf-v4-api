package org.opentmf.tmf641.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;

/**
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
public interface IServiceOrder extends IServiceOrderCreate {

  /**
   * Effective delivery date amended by the provider.
   */
  OffsetDateTime getCompletionDate();

  /**
   * the error(s) cause an order status change.
   */
  List<? extends IServiceOrderErrorMessage> getErrorMessages();

  /**
   * Expected delivery date amended by the provider.
   */
  OffsetDateTime getExpectedCompletionDate();

  /**
   * Hyperlink to access the order.
   */
  URI getHref();

  /**
   * ID created on repository side.
   */
  String getId();

  /**
   * A list of jeopardy alerts related to this order.
   */
  List<? extends IServiceOrderJeopardyAlert> getJeopardyAlerts();

  /**
   * A list of milestones related to this order.
   */
  List<? extends IServiceOrderMilestone> getMilestones();

  OffsetDateTime getOrderDate();

  /**
   * Date when the order was started for processing.
   */
  OffsetDateTime getStartDate();

  /**
   * Possible values for the state of the order
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, completed, failed, partial, assessingCancellation,
   * pendingCancellation.
   */
  String getState();
}
