package org.opentmf.tmf658.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ILoyaltyProgramMemberRef;
import org.opentmf.common.model.ILoyaltyProgramPartnerRef;
import org.opentmf.common.model.ILoyaltyProgramProductRef;

/**
 * A loyalty event notification.
 * <br/>Skipped properties: id,href.
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
public interface ILoyaltyEventCreate extends IExtensible {

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

  Object getEvent();

  /**
   * The identifier of the notification.
   */
  String getEventId();

  /**
   * The time that the event was received.
   */
  String getEventTime();

  /**
   * The incoming loyalty event type.
   */
  String getEventType();

  ILoyaltyProgramMemberRef getMember();

  /**
   * The member identifier of the loyalty program member.
   */
  String getMemberId();

  ILoyaltyProgramPartnerRef getPartner();

  /**
   * A priority.
   */
  String getPriority();

  ILoyaltyProgramProductRef getProgram();

  /**
   * The time the event occurred.
   */
  OffsetDateTime getTimeOccurred();

  /**
   * The title of the event.
   */
  String getTitle();
}
