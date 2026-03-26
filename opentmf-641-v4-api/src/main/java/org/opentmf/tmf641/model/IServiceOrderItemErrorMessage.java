package org.opentmf.tmf641.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IError;

/**
 * AServiceOrderItemErrorMessage represents an error that causes a status change
 * in a service order item.
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
public interface IServiceOrderItemErrorMessage extends IError {

  /**
   * Date when the error happened.
   */
  OffsetDateTime getTimestamp();
}
