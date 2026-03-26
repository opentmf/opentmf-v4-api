package org.opentmf.tmf673.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-673: Geographic Address Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicAddressValidationStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IGeographicAddressValidationStateChangeEventPayload getEvent();
}
