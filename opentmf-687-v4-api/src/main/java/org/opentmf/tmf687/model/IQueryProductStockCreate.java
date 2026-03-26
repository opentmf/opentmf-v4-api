package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;

/**
 * QueryProductStock is used to query product stock availability
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> searchCriteria<br/>
 * </p>
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
public interface IQueryProductStockCreate extends IExtensible {

  /**
   * Date when the QueryProductStock was completed.
   */
  OffsetDateTime getCompletedQueryProductStockDate();

  /**
   * Date when the QueryProductStock was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * An indicator which when the value is "true" means that requester expects to
   * get result immediately in the response. If the indicator is true then the
   * response code of 200 indicates the operation is successful otherwise a task
   * is created with a response 201.
   */
  Boolean getInstantSyncCheck();

  /**
   * A list of query product stock item - only present in response.
   */
  List<? extends IProductStock> getQueryProductStockItems();

  /**
   * A list of related party references (RelatedParty [*]). A related party
   * defines party or party role linked to this QueryProductStock.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Date when the stock availability should be query.
   */
  OffsetDateTime getRequestedAvailabilityDate();

  /**
   * Date when the requester wished to have a response for this product stock
   * query.
   */
  OffsetDateTime getRequestedQueryProductStockDate();

  /**
   * ProductStock is a base class for defining a product (or configured product
   * with values characteristic) stock level.
   */
  IProductStock getSearchCriteria();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
