package org.opentmf.tmf634.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceCandidateCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IResourceCandidateCreateEventPayload getEvent();
}
