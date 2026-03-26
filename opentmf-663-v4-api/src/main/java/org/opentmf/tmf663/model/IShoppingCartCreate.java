package org.opentmf.tmf663.model;

import java.util.List;
import org.opentmf.common.model.ITimePeriod;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation
 * of product offerings in e-commerce, call center and retail purchase. Shopping
 * cart supports purchase of both physical and digital goods and service (e.g.
 * handset, telecom network service). Shopping Cart contain list of cart items,
 * a reference to customer (partyRole) or contact medium in case customer not
 * exist, and the total items price including promotions
 * <br/>Skipped properties: id,href.
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
public interface IShoppingCartCreate extends IShoppingCartUpdate {

  /**
   * Total amount of the shopping cart, usually of money, that represents the
   * actual price paid by the Customer for cart (considering only "Active" cart
   * items).
   */
  List<? extends ICartPrice> getCartTotalPrices();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
