package org.opentmf.tmf679.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingQualificationCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IProductOfferingQualificationCreateEventPayload getEvent();
}
