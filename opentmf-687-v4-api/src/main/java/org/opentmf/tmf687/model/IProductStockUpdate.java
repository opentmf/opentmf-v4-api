package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMarketSegmentRef;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IResourceRef;

/**
 * ProductStock is a base class for defining a product (or configured product
 * with values characteristic) stock level.
 * <br/>Skipped properties: id,href,creationDate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-687: Stock Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductStockUpdate extends IExtensible {

  /**
   * List of: The channel to which the resource reference to. e.g. channel for
   * selling product offerings, channel for opening a trouble ticket etc..
   */
  List<? extends IChannelRef> getChannels();

  /**
   * Free-text description of the ProductStock.
   */
  String getDescription();

  /**
   * Last inventory count date for this ProductStock.
   */
  OffsetDateTime getLastInventoryDate();

  /**
   * Last date when the ProductStock record was updated.
   */
  OffsetDateTime getLastUpdate();

  /**
   * provides references to the corresponding market segment as target of a
   * product stock. A market segment is grouping of Parties, GeographicAreas,
   * SalesChannels, and so forth.
   */
  List<? extends IMarketSegmentRef> getMarketSegments();

  /**
   * An amount in a given unit.
   */
  IQuantity getMaxStockLevel();

  /**
   * An amount in a given unit.
   */
  IQuantity getMinStockLevel();

  /**
   * Name of the ProductStock.
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
   * An amount in a given unit.
   */
  IQuantity getProductStockLevel();

  /**
   * relationship to other product stock.
   */
  List<? extends IProductStockRelationship> getProductStockRelationships();

  /**
   * Possible values for the status of the stock level
   * <br/><p>Recommended values: reserved, available, unavailable, unknown.
   */
  String getProductStockStatusType();

  /**
   * Possible values for the usage of the stock level - This is illustrative
   * <br/><p>Recommended values: inTransit, onDisplay, damaged, returned,
   * replenishmentInProgress, inShop.
   */
  String getProductStockUsageType();

  /**
   * A list of related party references (RelatedParty [*]). A related party
   * defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * An amount in a given unit.
   */
  IQuantity getReorderQuantity();

  /**
   * Planned date for future replenishment for this ProductStock.
   */
  OffsetDateTime getReplenishmentDate();

  /**
   * The Resource managed through this ProductStock is used.
   */
  List<? extends IResourceRef> getResources();

  /**
   * An amount in a given unit.
   */
  IQuantity getStockLevelAlert();

  /**
   * Category of the ProductStock.
   */
  String getStockLevelCategory();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getStockedProduct();
}
