package org.opentmf.tmf915.model;

import org.opentmf.general.model.IEvent;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEventCreateEventPayload {

  /**
   * event with common attributes.
   */
  IEvent getEvent();
}
