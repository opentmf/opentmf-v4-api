package org.opentmf.tmf657.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-657: Service Quality Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceLevelObjectiveDeleteEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IServiceLevelObjectiveDeleteEventPayload getEvent();
}
