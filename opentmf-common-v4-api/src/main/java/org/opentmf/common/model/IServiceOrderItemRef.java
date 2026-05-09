package org.opentmf.common.model;

import java.net.URI;

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
public interface IServiceOrderItemRef extends IExtensible {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Identifier of the line item.
   */
  String getItemId();

  /**
   * Link to the order to which this item belongs to.
   */
  URI getServiceOrderHref();

  /**
   * Identifier of the order that this item belongs to.
   */
  String getServiceOrderId();
}
