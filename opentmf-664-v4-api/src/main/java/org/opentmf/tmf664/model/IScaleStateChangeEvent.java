package org.opentmf.tmf664.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IScaleStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IScaleStateChangeEventPayload getEvent();
}
