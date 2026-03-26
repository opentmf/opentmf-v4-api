package org.opentmf.common.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-683: Party Interaction Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IInteractionItem extends IEntity {

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Where the interaction took place (e.g.: web, mobile app, store, kiosk, etc.).
   */
  List<? extends IRelatedChannel> getChannels();

  /**
   * Date when the interaction item is created in the system.
   */
  OffsetDateTime getCreationDate();

  /**
   * A reference to an entity, where the type of the entity is not known in
   * advance. A related entity defines a entity described by reference or by value
   * linked to a specific entity. The polymorphic attributes {@literal @}type,
   * {@literal @}schemaLocation & {@literal @}referredType are related to the Entity and not the
   * RelatedEntityRefOrValue class itself.
   */
  IRelatedEntityRefOrValue getItem();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getItemDate();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * Reason why this item is referred.
   */
  String getReason();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Resolution of the interaction item.
   */
  String getResolution();
}
