package org.opentmf.tmf662.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-662: Entity Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityCatalogDeleteEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IEntityCatalogDeleteEventPayload getEvent();
}
