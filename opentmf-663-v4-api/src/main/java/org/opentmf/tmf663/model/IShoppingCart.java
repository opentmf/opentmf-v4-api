package org.opentmf.tmf663.model;

import java.net.URI;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation
 * of product offerings in e-commerce, call center and retail purchase. Shopping
 * cart supports purchase of both physical and digital goods and service (e.g.
 * handset, telecom network service). Shopping Cart contain list of cart items,
 * a reference to customer (partyRole) or contact medium in case customer not
 * exist, and the total items price including promotions.
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
public interface IShoppingCart extends IShoppingCartCreate {

  /**
   * Hyperlink to access the shopping cart.
   */
  URI getHref();

  /**
   * Unique identifier created on provider side (e.g. Order Capture system).
   */
  String getId();
}
