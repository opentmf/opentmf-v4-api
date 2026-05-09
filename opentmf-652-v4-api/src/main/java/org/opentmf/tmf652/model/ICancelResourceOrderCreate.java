package org.opentmf.tmf652.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IResourceOrderRef;

/**
 * Request for cancellation an existing resource order
 * <br/>Skipped properties: id,href,state,effectiveCancellationDate.
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
public interface ICancelResourceOrderCreate extends IExtensible {

  /**
   * Reason why the order is cancelled.
   */
  String getCancellationReason();

  /**
   * Date when the submitter wants the order to be cancelled.
   */
  OffsetDateTime getRequestedCancellationDate();

  IResourceOrderRef getResourceOrder();
}
