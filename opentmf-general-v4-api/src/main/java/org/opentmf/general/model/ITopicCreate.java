package org.opentmf.general.model;

import org.opentmf.common.model.IRuleUpdate;

/**
 * Is a event channel provided by the Event Streaming API
 * <br/>Skipped properties: id,href.
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
public interface ITopicCreate extends IRuleUpdate {

  /**
   * is the filter that will be applied on the content of the Event.
   */
  String getContentQuery();

  /**
   * is the filter that will be applied on the Event header properties.
   */
  String getHeaderQuery();
}
