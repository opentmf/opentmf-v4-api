package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPlaceRefOrValue;
import org.opentmf.common.model.IRelatedParty;

/**
 * CheckProductStock is used to log and execute check about product stock
 * availability
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> checkProductStockItem<br/>
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
public interface ICheckProductStockCreate extends IExtensible {

  /**
   * A list of check product stock item.
   */
  List<? extends ICheckProductStockItem> getCheckProductStockItems();

  /**
   * Date when the CheckProductStock was completed.
   */
  OffsetDateTime getCompletedCheckProductStockDate();

  /**
   * Date when the CheckProductStock was created (whatever its status).
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
   * A place described by reference or by value linked to a specific entity. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
   * the place entity and not the PlaceRefOrValue class itself.
   */
  IPlaceRefOrValue getPlace();

  /**
   * When the value is TRUE means that alternative proposal should be provided
   * (from other product stock, different date or quantity).
   */
  Boolean getProvideAlternative();

  /**
   * A list of related party references (RelatedParty [*]). A related party
   * defines party or party role linked to this CheckProductStock.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Date when the stock availability should be check.
   */
  OffsetDateTime getRequestedAvailabilityDate();

  /**
   * Date when the requester wished to have a response for this product stock
   * check query.
   */
  OffsetDateTime getRequestedCheckProductStockDate();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
