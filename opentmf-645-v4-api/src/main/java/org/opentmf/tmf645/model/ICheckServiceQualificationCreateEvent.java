package org.opentmf.tmf645.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckServiceQualificationCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ICheckServiceQualificationCreateEventPayload getEvent();
}
