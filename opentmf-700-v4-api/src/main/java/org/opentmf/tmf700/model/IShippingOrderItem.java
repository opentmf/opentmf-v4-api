package org.opentmf.tmf700.model;

import java.util.List;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductPrice;
import org.opentmf.common.model.IProductRef;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.partner.model.IShippingInstruction;

/**
 * A list of shipping order items.
 *
 * <p><br/>
 * <strong>Required:</strong> action, id<br/>
 * </p>
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
public interface IShippingOrderItem extends IEntity {

  /**
   * action to be performed on the shipping order item
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getAction();

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

  IProductRef getProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * Reference to an order item that can typically be queried with another API.
   */
  IProductOrderItemRef getProductOrderItem();

  /**
   * Quantity the individual shipment line item.
   */
  String getQuantity();

  /**
   * A party which is involved in this shipment and the role they are playing and
   * address. In case of shipping to addresses where a geo location is needed than
   * then PlaceTo,PlaceFrom can be used.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();

  /**
   * A shipment defined by value or existing defined by reference. The polymorphic
   * attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are related to the
   * shipment entity and not the related ShipmentRefOrValue class itself.
   */
  IShipmentRefOrValue getShipment();

  /**
   * Instructions and details for the carrier.
   */
  IShippingInstruction getShippingInstruction();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getShippingOrderItemOffering();

  /**
   * An amount, usually of money, that represents the actual price paid by a
   * Customer for a purchase, a rent or a lease of a Product. The price is valid
   * for a defined period of time.
   */
  IProductPrice getShippingOrderItemPrice();

  /**
   * status of shipping order item. e.g. "active" , "savedForLater".
   */
  String getStatus();
}
