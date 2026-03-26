package org.opentmf.common.model;

import java.net.URI;

/**
 * RelatedWorkOrderItem (WorkOrder item). The work order item which triggered
 * this unit of work's creation/change/termination.
 *
 * <p><br/>
 * <strong>Required:</strong> orderItemId, workOrderId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedWorkOrderItem extends IExtensible {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Action of the order item for this unit of work.
   */
  String getOrderItemAction();

  /**
   * Identifier of the work order item where the unit of work was managed.
   */
  String getOrderItemId();

  /**
   * Role of the work order item for this unitof work.
   */
  String getRole();

  /**
   * Reference of the related entity.
   */
  URI getWorkOrderHref();

  /**
   * Unique identifier of a related entity.
   */
  String getWorkOrderId();
}
