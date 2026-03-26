package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * The manually configured common object for event notification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEventBase {

  /**
   * The correlation id for this event.
   */
  String getCorrelationId();

  /**
   * An explanatory description of the event.
   */
  String getDescription();

  /**
   * The domain of the event.
   */
  String getDomain();

  /**
   * The identifier of the notification.
   */
  String getEventId();

  /**
   * Time of the event occurrence.
   */
  OffsetDateTime getEventTime();

  /**
   * The type of the notification.
   */
  String getEventType();

  /**
   * A priority.
   */
  String getPriority();

  /**
   * The time the event occurred.
   */
  OffsetDateTime getTimeOccurred();

  /**
   * The title of the event.
   */
  String getTitle();
}
