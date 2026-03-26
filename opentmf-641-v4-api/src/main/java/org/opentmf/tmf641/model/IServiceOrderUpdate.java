package org.opentmf.tmf641.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExternalReference;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedParty;

/**
 * Skipped properties:
 * id,href,orderDate,jeopardyAlert,errorMessage,milestone,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type,cancellationDate,cancellationReason,category,completionDate,startDate.
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
public interface IServiceOrderUpdate {

  /**
   * A free-text description of the service order.
   */
  String getDescription();

  /**
   * Expected delivery date amended by the provider.
   */
  OffsetDateTime getExpectedCompletionDate();

  /**
   * ID given by the consumer to facilitate searches.
   */
  String getExternalId();

  /**
   * List of: External reference of the individual or reference in other system.
   */
  List<? extends IExternalReference> getExternalReferences();

  /**
   * Extra-information about the order; e.g. useful to add extra delivery
   * information that could be useful for a human process.
   */
  List<? extends INote> getNotes();

  /**
   * Contact attached to the order to send back information regarding this order.
   */
  String getNotificationContact();

  /**
   * A list of service orders related to this order (e.g. prerequisite, dependent
   * on).
   */
  List<? extends IServiceOrderRelationship> getOrderRelationships();

  /**
   * Can be used by consumers to prioritize orders in a Service Order Management
   * system.
   */
  String getPriority();

  /**
   * A list of parties which are involved in this order and the role they are
   * playing.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Requested delivery date from the requesters perspective.
   */
  OffsetDateTime getRequestedCompletionDate();

  /**
   * Order start date wished by the requester.
   */
  OffsetDateTime getRequestedStartDate();

  /**
   * A list of service order items to be processed by this order.
   */
  List<? extends IServiceOrderItem> getServiceOrderItems();

  /**
   * Possible values for the state of the order
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, completed, failed, partial, assessingCancellation,
   * pendingCancellation.
   */
  String getState();
}
