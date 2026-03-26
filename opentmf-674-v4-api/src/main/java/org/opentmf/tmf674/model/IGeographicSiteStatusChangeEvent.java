package org.opentmf.tmf674.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-674: Geographic Site Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicSiteStatusChangeEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IGeographicSiteStatusChangeEventPayload getEvent();
}
