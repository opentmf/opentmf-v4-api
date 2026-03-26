package org.opentmf.general.model;

/**
 * The event data structure.
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
public interface ITopicChangeEventPayload {

  /**
   * Is a event channel provided by the Event Streaming API.
   */
  ITopic getTopic();
}
