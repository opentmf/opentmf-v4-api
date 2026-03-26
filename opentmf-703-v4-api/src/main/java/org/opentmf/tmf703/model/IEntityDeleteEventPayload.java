package org.opentmf.tmf703.model;

import org.opentmf.common.model.IEntity;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-703: Entity Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntityDeleteEventPayload {

  /**
   * Base entity schema for use in TMForum Open-APIs.
   */
  IEntity getEntity();
}
