package org.opentmf.tmf652.model;

import org.opentmf.common.model.ICancelOrder;

/**
 * Request for cancellation an existing resource order.
 *
 * <p><br/>
 * <strong>Required:</strong> resourceOrder<br/>
 * </p>
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
public interface ICancelResourceOrder extends ICancelOrder {

  IResourceOrderRef getResourceOrder();
}
