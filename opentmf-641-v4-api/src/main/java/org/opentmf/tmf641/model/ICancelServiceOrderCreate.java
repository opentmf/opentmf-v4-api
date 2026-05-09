package org.opentmf.tmf641.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IServiceOrderRef;

/**
 * Request for cancellation an existing Service order
 * <br/>Skipped properties:
 * id,href,state,effectiveCancellationDate,completionMessage,errorMessage.
 *
 * <p><br/>
 * <strong>Required:</strong> serviceOrder<br/>
 * </p>
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
public interface ICancelServiceOrderCreate extends IExtensible {

  /**
   * Reason why the order is cancelled.
   */
  String getCancellationReason();

  /**
   * Date when the submitter wants the order to be cancelled.
   */
  OffsetDateTime getRequestedCancellationDate();

  /**
   * Service Order reference. Useful to understand the which was the Service order
   * through which the service was instantiated in the service inventory.
   */
  IServiceOrderRef getServiceOrder();
}
