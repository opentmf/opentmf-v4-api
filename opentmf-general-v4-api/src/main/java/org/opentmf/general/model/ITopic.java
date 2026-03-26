package org.opentmf.general.model;

import org.opentmf.common.model.INamedEntity;

/**
 * Is a event channel provided by the Event Streaming API.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-688: Event Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITopic extends INamedEntity {

  /**
   * is the filter that will be applied on the content of the Event.
   */
  String getContentQuery();

  /**
   * is the filter that will be applied on the Event header properties.
   */
  String getHeaderQuery();
}
