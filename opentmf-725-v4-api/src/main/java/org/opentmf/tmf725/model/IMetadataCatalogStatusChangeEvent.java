package org.opentmf.tmf725.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMetadataCatalogStatusChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IMetadataCatalogStatusChangeEventPayload getEvent();
}
