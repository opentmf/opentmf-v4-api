package org.opentmf.tmf644.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyPrivacyProfileSpecificationDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IPartyPrivacyProfileSpecificationDeleteEventPayload getEvent();
}
