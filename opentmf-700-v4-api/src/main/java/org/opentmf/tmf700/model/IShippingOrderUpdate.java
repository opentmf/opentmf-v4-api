package org.opentmf.tmf700.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductOrderRef;
import org.opentmf.common.model.IProductPrice;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.partner.model.IShippingInstruction;

/**
 * A Shipping Order is a document used by a business to specify what items are
 * to be transferred from a storage location or warehouse to which person and to
 * which new location. A Shipping Order can typically be sent along with a
 * shipment of goods so that the person receiving them can verify that the
 * document correctly reflects the items that they actually received.
 * <br/>Skipped properties: id,href,creationDate,lastUpdateDate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShippingOrderUpdate extends IExtensible {

  /**
   * A list of notes made on this shipping shipment.
   */
  List<? extends INote> getNotes();

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
   * ProductOrder (ProductOrder) .The product order which the recommendation is
   * related with.
   */
  IProductOrderRef getProductOrder();

  /**
   * An existing related party that has some form of correlation with the given
   * shipping order. It can be recipient, payer, etc.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();

  /**
   * A related shipping order addressable entity.
   */
  IRelatedShippingOrder getRelatedShippingOrder();

  /**
   * Instructions and details for the carrier.
   */
  IShippingInstruction getShippingInstruction();

  /**
   * List of characteristics with values.
   */
  List<? extends ICharacteristic> getShippingOrderCharacteristics();

  /**
   * A list of shipping order items. Each shipping order item has a corresponding
   * Shipment(e.g. parcel) which has one or multiple products in it.
   */
  List<? extends IShippingOrderItem> getShippingOrderItems();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getShippingOrderOffering();

  /**
   * An amount, usually of money, that represents the actual price paid by a
   * Customer for a purchase, a rent or a lease of a Product. The price is valid
   * for a defined period of time.
   */
  IProductPrice getShippingOrderPrice();

  /**
   * status of shipping order e.g. "active" , "savedForLater".
   */
  String getStatus();
}
