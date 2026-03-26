package org.opentmf.tmf728.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-728: Dunning Case Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDunningCaseStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IDunningCaseStateChangeEventPayload getEvent();
}
