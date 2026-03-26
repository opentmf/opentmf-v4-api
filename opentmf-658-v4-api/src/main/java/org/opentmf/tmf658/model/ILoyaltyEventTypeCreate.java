package org.opentmf.tmf658.model;


/**
 * An event type used to match filter incoming loyalty events.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> eventType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyEventTypeCreate {

  /**
   * The topic to which the event type relates.
   */
  String getEventTopic();

  /**
   * The type of loyalty event expected to trigger the loyalty rule evaluation,
   * e.g. a CustomerOrder or an Invoice. The eventType should be unique to prevent
   * existing resources not being reused. An eventType that already exists will
   * result in a 422 error.
   */
  String getEventType();
}
