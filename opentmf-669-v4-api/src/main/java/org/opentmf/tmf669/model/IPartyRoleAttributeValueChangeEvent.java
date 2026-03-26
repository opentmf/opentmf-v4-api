package org.opentmf.tmf669.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-669: Party Role Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyRoleAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IPartyRoleAttributeValueChangeEventPayload getEvent();
}
