package org.opentmf.tmf663.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;

/**
 * An identified part of the shopping cart. A shopping cart is decomposed into
 * one or more shopping cart item. Cart item represents a product offering or
 * bundled product offering that user wish to purchase, as well as the pricing
 * of the product offering, reference to product in case of configured
 * characteristic or installation address. Cart items can be related to other
 * cart item to related bundled offerings or reference cart Items to a shipping
 * options.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-663: Shopping Cart Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICartItem extends IExtensible {

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by the customer for this item. May represent the total price of the shopping
   * cart or the total of the cart item depending on the relation.
   */
  List<? extends ICartPrice> getItemTotalPrices();

  /**
   * action to be performed on the product
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getAction();

  /**
   * List of: An identified part of the shopping cart. A shopping cart is
   * decomposed into one or more shopping cart item. Cart item represents a
   * product offering or bundled product offering that user wish to purchase, as
   * well as the pricing of the product offering, reference to product in case of
   * configured characteristic or installation address. Cart items can be related
   * to other cart item to related bundled offerings or reference cart Items to a
   * shipping options.
   */
  List<? extends ICartItem> getCartItems();

  /**
   * List of: Relationship among cart items mainly other than hierarchical
   * relationships such as "RelyOn", "DependentOn", "Shipping" etc.
   */
  List<? extends ICartItemRelationship> getCartItemRelationships();

  /**
   * Identifier of the cart item (generally it is a sequence number 01, 02, 03,
   * ...) in the shopping cart.
   */
  String getId();

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by the customer for this item. May represent the total price of the shopping
   * cart or the total of the cart item depending on the relation.
   */
  List<? extends ICartPrice> getItemPrices();

  List<? extends ICartTerm> getItemTerms();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * Quantity of cart items.
   */
  Integer getQuantity();

  /**
   * Possible values for the status of the cart item
   * <br/><p>Recommended values: active, saveForLater.
   */
  String getStatus();
}
