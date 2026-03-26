package org.opentmf.tmf703.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IMEntityBase;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.general.model.IEntityRelationship;
import org.opentmf.general.model.IEntitySpecificationRef;

/**
 * ManagedEntity represents an entity that describes the common set of
 * attributes shared by all concrete entities (e.g. Resource, Service, ..) in
 * the Entity Inventory.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-703: Entity Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IManagedEntity extends IMEntityBase {

  /**
   * Attachments that may be of relevance to this entity, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * A string used to give a context to the entity.
   */
  String getContext();

  /**
   * A date time( DateTime). The date till the entity is effective.
   */
  OffsetDateTime getEndDate();

  /**
   * A list of entities related to this entity.
   */
  List<? extends IEntityRelationship> getEntityRelationships();

  /**
   * reference to an EntitySpecification object.
   */
  IEntitySpecificationRef getEntitySpecification();

  /**
   * isExternal determines whether an entity represents an external entity in the
   * inventory.
   */
  Boolean getIsExternal();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A date time( DateTime). The date that the entity status changed.
   */
  OffsetDateTime getStatusChangeDate();

  /**
   * A field that identifies the specific version of an instance of an entity.
   */
  String getVersion();
}
