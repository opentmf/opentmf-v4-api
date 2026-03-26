package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IInteractionItem;
import org.opentmf.common.model.IInteractionRelationship;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedChannel;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360PartyInteractionVO extends IEntity {

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Where the interaction took place (e.g. web, mobile app, store, kiosk, etc.).
   */
  List<? extends IRelatedChannel> getChannels();

  /**
   * Date when the interaction is created in the system.
   */
  OffsetDateTime getCreationDate();

  /**
   * Description of the interaction.
   */
  String getDescription();

  /**
   * Specifies who started the interaction. It might be the party or the
   * enterprise exposing this API. Possible values are “inbound” and “outbound”.
   */
  String getDirection();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getInteractionDate();

  List<? extends IInteractionItem> getInteractionItems();

  List<? extends IInteractionRelationship> getInteractionRelationships();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * Reason why the interaction happened.
   */
  String getReason();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Status of the interaction (opened, inProgress, completed).
   */
  String getStatus();

  /**
   * Last time the status changed.
   */
  OffsetDateTime getStatusChangeDate();
}
