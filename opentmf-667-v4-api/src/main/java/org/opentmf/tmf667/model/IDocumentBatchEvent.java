package org.opentmf.tmf667.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-667: Document Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDocumentBatchEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IDocumentBatchEventPayload getEvent();
}
