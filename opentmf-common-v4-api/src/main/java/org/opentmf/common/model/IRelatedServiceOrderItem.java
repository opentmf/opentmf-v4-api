package org.opentmf.common.model;

import java.net.URI;

/**
 * RelatedServiceOrderItem (a ServiceOrder item) .The service order item which
 * triggered service creation/change/termination.
 *
 * <p><br/>
 * <strong>Required:</strong> itemId, serviceOrderId<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-638: Service Inventory Management API</li>
 *   <li>TMF-640: Service Activation Management API</li>
 *   <li>TMF-641: Service Ordering Management API</li>
 *   <li>TMF-645: Service Qualification Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedServiceOrderItem extends IEntity {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * action to be performed on the product
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getItemAction();

  /**
   * Identifier of the order item where the service was managed.
   */
  String getItemId();

  /**
   * role of the service order item for this service.
   */
  String getRole();

  /**
   * Reference of the related entity.
   */
  URI getServiceOrderHref();

  /**
   * Unique identifier of a related entity.
   */
  String getServiceOrderId();
}
