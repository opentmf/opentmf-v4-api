package org.opentmf.tmf652.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrderItemRef extends IExtensible {

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
  URI getResourceOrderHref();

  /**
   * Identifier of the order that this item belongs to.
   */
  String getResourceOrderId();
}
