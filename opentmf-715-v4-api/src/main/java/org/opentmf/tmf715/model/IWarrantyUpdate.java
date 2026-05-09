package org.opentmf.tmf715.model;

import java.util.List;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IResourceRefOrValue;
import org.opentmf.common.model.ITimePeriod;
import org.opentmf.common.model.IWarrantyRelationship;
import org.opentmf.common.model.IWarrantySpecificationRef;
import org.opentmf.general.model.IEntityRelationship;
import org.opentmf.general.model.IEntitySpecificationRef;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWarrantyUpdate extends IExtensible {

  /**
   * List of: A product to be created defined by value or existing defined by
   * reference. The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType
   * are related to the product entity and not the RelatedProductRefOrValue class
   * itself.
   */
  List<? extends IProductRefOrValue> getAppliesToProducts();

  /**
   * List of: Resource is an abstract entity that describes the common set of
   * attributes shared by all concrete resources. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the Resource entity and
   * not the related ResourceRefOrValue class itself.
   */
  List<? extends IResourceRefOrValue> getAppliesToResources();

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
   * free-text description of the entity.
   */
  String getDescription();

  /**
   * A date time( DateTime). The date till the entity is effective.
   */
  String getEndDate();

  /**
   * A list of entities related to this entity.
   */
  List<? extends IEntityRelationship> getEntityRelationships();

  /**
   * reference to an EntitySpecification object.
   */
  IEntitySpecificationRef getEntitySpecification();

  /**
   * isBundle determines whether an entity represents a single entity (false), or
   * a bundle of entities(true).
   */
  Boolean getIsBundle();

  /**
   * isExternal determines whether an entity represents an external entity in the
   * inventory.
   */
  Boolean getIsExternal();

  /**
   * A string used to give a name to the entity.
   */
  String getName();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * List of: Related Entity reference. A related place defines a place described
   * by reference or by value linked to a specific entity. The polymorphic
   * attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place
   * entity and not the RelatedPlaceRefOrValue class itself.
   */
  List<? extends IRelatedPlaceRefOrValue> getPlaces();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A date time( DateTime). The date from which the entity is effective.
   */
  String getStartDate();

  /**
   * Valid values for the lifecycle state of the service
   * <br/><p>Recommended values: feasibilityChecked, designed, reserved, inactive,
   * active, terminated.
   */
  String getState();

  /**
   * The life cycle state of the entity.
   */
  String getStatus();

  /**
   * A date time( DateTime). The date that the entity status changed.
   */
  String getStatusChangeDate();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * A field that identifies the specific version of an instance of an entity.
   */
  String getVersion();

  List<? extends IWarranty> getWarranties();

  /**
   * List of: Agreement reference. An agreement represents a contract or
   * arrangement, either written or verbal and sometimes enforceable by law, such
   * as a service level agreement or a customer price agreement. An agreement
   * involves a number of other business entities, such as products, services, and
   * resources and/or their specifications.
   */
  List<? extends IAgreementRef> getWarrantyAgreements();

  /**
   * List of: Linked products to the one instantiate, such as [bundled] if the
   * product is a bundle and you want to describe the bundled products inside this
   * bundle; [reliesOn] if the product needs another already owned product to rely
   * on (e.g. an option on an already owned mobile access product) [targets] or
   * [isTargeted] (depending on the way of expressing the link) for any other kind
   * of links that may be useful.
   */
  List<? extends IWarrantyRelationship> getWarrantyRelationships();

  IWarrantySpecificationRef getWarrantySpecification();
}
