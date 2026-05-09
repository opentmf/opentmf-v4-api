package org.opentmf.partner.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExternalIdentifier;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IPaymentMethodRef;
import org.opentmf.common.model.IProductPrice;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IRelatedShipment;
import org.opentmf.common.model.IShipmentTrackingRef;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShipment extends INamedEntity {

  /**
   * Attachments that may be of relevance to this shipment, such as
   * shippingLabels, Signature or photos of the delivery.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * The date the package was collected from the carrier (Collection scenario).
   */
  OffsetDateTime getCollectionDate();

  /**
   * Effective delivery date amended by the provider.
   */
  OffsetDateTime getCompletionDate();

  /**
   * Is the date at which the shipment was completed (customer has taken ownership
   * of the package).
   */
  OffsetDateTime getDeliveryDate();

  /**
   * Description of the shipment. It could be the same as the description of the
   * shipment specification.
   */
  String getDescription();

  /**
   * The date that the shipment will be delivered.
   */
  OffsetDateTime getExpectedDeliveryDate();

  /**
   * An identification of an entity that is owned by or originates in a software
   * system different from the current system, for example a ProductOrder handed
   * off from a commerce platform into an order handling system. The structure
   * identifies the system itself, the nature of the entity within the system
   * (e.g. class name) and the unique ID of the entity within the system. It is
   * anticipated that multiple external IDs can be held for a single entity, e.g.
   * if the entity passed through multiple systems on the way to the current
   * system. In this case the consumer is expected to sequence the IDs in the
   * array in reverse order of provenance, i.e. most recent system first in the
   * list.
   */
  List<? extends IExternalIdentifier> getExternalIdentifiers();

  /**
   * A list of notes made on this shipment.
   */
  List<? extends INote> getNotes();

  /**
   * PaymentMethod reference. A payment method defines a specific mean of payment
   * (e.g. direct debit).
   */
  IPaymentMethodRef getPaymentMethod();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getPlaceFrom();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getPlaceTo();

  /**
   * A list of parties which are involved in this shipment and the role they are
   * playing.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();

  /**
   * A list of existing shipments that has some form of correlation with the given
   * shipment.
   */
  List<? extends IRelatedShipment> getRelatedShipments();

  /**
   * The date requester by the sender for shipment delivery.
   */
  OffsetDateTime getRequestedDeliveryDate();

  /**
   * List of characteristics with values.
   */
  List<? extends ICharacteristic> getShipmentCharacteristics();

  /**
   * List of items that are part of the shipment (parcel/package).
   */
  List<? extends IShipmentItem> getShipmentItems();

  /**
   * An amount, usually of money, that represents the actual price paid by a
   * Customer for a purchase, a rent or a lease of a Product. The price is valid
   * for a defined period of time.
   */
  IProductPrice getShipmentPrice();

  /**
   * A shipment specification defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are
   * related to the shipment specification entity and not the related
   * ShipmentSpecificationRefOrValue class itself.
   */
  IShipmentSpecificationRefOrValue getShipmentSpecification();

  /**
   * ShipmentTracking reference.
   */
  IShipmentTrackingRef getShipmentTracking();

  /**
   * Instructions and details for the carrier.
   */
  IShippingInstruction getShippingInstruction();

  /**
   * The current status of the shipment.
   */
  String getState();

  /**
   * An amount in a given unit.
   */
  IQuantity getWeight();
}
