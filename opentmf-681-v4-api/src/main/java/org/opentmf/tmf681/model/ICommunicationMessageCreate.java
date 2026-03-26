package org.opentmf.tmf681.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachment;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;

/**
 * Communication message means a notification approach in the format of a
 * message which can be dispatched (sent) to the certain user by the system with
 * the content which can be felt and understood by the recipient. The user can
 * be either a final customer or a customer service agent. The message can reach
 * the customer in different interaction channels, including: email, short
 * message, mobile app notification (push).
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> content, messageType, receiver, sender<br/>
 * </p>
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
public interface ICommunicationMessageCreate extends IExtensible {

  /**
   * Any attachment associated with this message.
   */
  List<? extends IAttachment> getAttachments();

  /**
   * Any additional characteristic(s) of this message.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * The content of the communication message.
   */
  String getContent();

  /**
   * Description for the whole object.
   */
  String getDescription();

  Boolean getLogFlag();

  /**
   * The type of message, such as: SMS, Email, Mobile app push notification.
   */
  String getMessageType();

  /**
   * The priority of the communication message.
   * <br/>Small number means higher priority.
   */
  String getPriority();

  /**
   * The receiver(s) of this message.
   */
  List<? extends IReceiver> getReceivers();

  /**
   * The scheduled time for sending the communication message.
   */
  OffsetDateTime getScheduledSendTime();

  /**
   * The time of sending communication message.
   */
  OffsetDateTime getSendTime();

  /**
   * The time of completion of sending communication message.
   */
  OffsetDateTime getSendTimeComplete();

  /**
   * Sender of the communication message.
   */
  ISender getSender();

  /**
   * Communication message state type
   * <br/><p>Recommended values: initial, inProgress, completed, cancelled,
   * failed.
   */
  String getState();

  /**
   * The title of the message, necessary for the email and mobile app push.
   */
  String getSubject();

  /**
   * How many times do you want to retry the delivery of this message?.
   */
  Integer getTryTimes();
}
