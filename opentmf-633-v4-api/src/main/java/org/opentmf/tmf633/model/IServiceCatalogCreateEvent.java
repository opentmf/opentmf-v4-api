package org.opentmf.tmf633.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCatalogCreateEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IServiceCatalogCreateEventPayload getEvent();
}
