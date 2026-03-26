package org.opentmf.general.model;

import org.opentmf.common.model.IExtensible;

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
public interface ITopicCreate extends IExtensible {

  /**
   * is the filter that will be applied on the content of the Event.
   */
  String getContentQuery();

  /**
   * is the filter that will be applied on the Event header properties.
   */
  String getHeaderQuery();

  /**
   * use to identify grouping of events, per domain, per event types, per access
   * control-right and so on.
   */
  String getName();
}
