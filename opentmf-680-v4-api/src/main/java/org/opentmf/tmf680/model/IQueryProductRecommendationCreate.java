package org.opentmf.tmf680.model;

import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOrderRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.customer.model.IRecommendationItem;
import org.opentmf.customer.model.IShoppingCartRef;

/**
 * Recommendation API is used to recommend offering quickly based on the history
 * and real-time context of customer. It is a real-time and personalized
 * recommendation API. It is usually provided by e-commerce or BSS, CRM system
 * in omni-channel.
 * <br/>Skipped properties: id,href,validFor,item.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-680: Recommendation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQueryProductRecommendationCreate extends IExtensible {

  /**
   * List of: The category for grouping recommendations.
   */
  List<? extends ICategoryRef> getCategories();

  /**
   * List of: The channel to which the resource reference to. e.g. channel for
   * selling product offerings, channel for opening a trouble ticket etc..
   */
  List<? extends IChannelRef> getChannels();

  String getDescription();

  /**
   * An indicator which when the value is "true" means that requester expects to
   * get recommendation result in the response.
   */
  Boolean getInstantSyncRecommendation();

  /**
   * Name of the queryProductRecommendation.
   */
  String getName();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getPlace();

  /**
   * List of: ProductOrder (ProductOrder) .The product order which the
   * recommendation is related with.
   */
  List<? extends IProductOrderRef> getProductOrders();

  /**
   * List of: Describes a specific item contained in a parent element.
   */
  List<? extends IItemRef> getProductOrderItems();

  /**
   * List of: A list of recommendation items. Every item is a product offering and
   * its rank.
   */
  List<? extends IRecommendationItem> getRecommendationItems();

  /**
   * The type of the queryProductRecommendation.
   */
  String getRecommendationType();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRelatedParty();

  /**
   * List of: ShoppingCart (ShoppingCartRef) . The shopping cart which the
   * recommendation is related with.
   */
  List<? extends IShoppingCartRef> getShoppingCarts();

  /**
   * List of: Describes a specific item contained in a parent element.
   */
  List<? extends IItemRef> getShoppingCartItems();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
