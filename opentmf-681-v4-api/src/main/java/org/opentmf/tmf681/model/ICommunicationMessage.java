package org.opentmf.tmf681.model;

import java.net.URI;

/**
 * Communication message means a notification approach in the format of a
 * message which can be dispatched (sent) to the certain user by the system with
 * the content which can be felt and understood by the recipient. The user can
 * be either a final customer or a customer service agent. The message can reach
 * the customer in different interaction channels, including: email, short
 * message, mobile app notification (push).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-681: Communication Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICommunicationMessage extends ICommunicationMessageUpdate {

  /**
   * Hypertext Reference of the Communication Message.
   */
  URI getHref();

  /**
   * Unique identifier of Communication Message.
   */
  String getId();
}
