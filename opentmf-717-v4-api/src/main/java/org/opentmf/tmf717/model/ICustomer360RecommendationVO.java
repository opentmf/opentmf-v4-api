package org.opentmf.tmf717.model;

import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IGeographicLocationRef;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IProductOrderRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IShoppingCartRef;
import org.opentmf.common.model.ITimePeriod;
import org.opentmf.customer.model.IRecommendationItem;

/**
 * Recommendation API is used to recommend offering quickly based on the history
 * and real-time context of customer. It is a real-time and personalized
 * recommendation API. It is usually provided by e-commerce or BSS, CRM system
 * in omni-channel.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360RecommendationVO extends INamedEntity {

  /**
   * The category for grouping recommendations.
   */
  ICategoryRef getCategory();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  String getDescription();

  /**
   * List of: A list of recommendation items. Every item is a product offering and
   * its rank.
   */
  List<? extends IRecommendationItem> getItems();

  IGeographicLocationRef getLocation();

  /**
   * ProductOrder (ProductOrder) .The product order which the recommendation is
   * related with.
   */
  IProductOrderRef getOrder();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getParty();

  /**
   * The type of recommendation.
   */
  String getRecommendationType();

  /**
   * ShoppingCart (ShoppingCartRef) . The shopping cart which the recommendation
   * is related with.
   */
  IShoppingCartRef getShoppingCart();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
