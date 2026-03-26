package org.opentmf.tmf724.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-724: Incident Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDiagnoseIncidentCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IDiagnoseIncidentCreateEventPayload getEvent();
}
