package org.opentmf.tmf701.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-701: Process Flow Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProcessFlowDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IProcessFlowDeleteEventPayload getEvent();
}
