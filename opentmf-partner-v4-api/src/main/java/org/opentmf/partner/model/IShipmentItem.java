package org.opentmf.partner.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IExternalIdentifier;
import org.opentmf.common.model.IPrice;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IProductStockRef;
import org.opentmf.common.model.IQuantity;

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
public interface IShipmentItem extends IExtensible {

  /**
   * action to be performed on the shipment item
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getAction();

  /**
   * List of characteristics with values that define the test run.
   */
  List<? extends ICharacteristic> getCharacteristics();

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
   * Identifier of the individual shipment line item.
   */
  String getId();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getProduct();

  /**
   * Product Stock Reservation reference.
   */
  IReserveProductStockRef getProductReservationRef();

  /**
   * ProductStockRef is a reference to a product stock.
   */
  IProductStockRef getProductStockRef();

  /**
   * Quantity the individual shipment line item.
   */
  String getQuantity();

  /**
   * Provides all amounts (tax included, duty free, tax rate), used currency and
   * percentage to apply for Price Alteration.
   */
  IPrice getShipmentItemPrice();

  /**
   * SKU (Stock Keeping Unit) is a unique code that you use to identify every
   * inventory item in your warehouse.
   */
  String getSku();

  /**
   * An amount in a given unit.
   */
  IQuantity getWeight();
}
