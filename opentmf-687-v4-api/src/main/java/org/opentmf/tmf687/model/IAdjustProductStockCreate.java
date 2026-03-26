package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * AdjustProductStock is used to log and execute on or several Product Stock
 * level change
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> adjustProductStockItem<br/>
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
public interface IAdjustProductStockCreate extends IExtensible {

  /**
   * List of: A list of AdjustProductStock items. Every item is a ProductStock
   * adjustement request.
   */
  List<? extends IAdjustProductStockItem> getAdjustProductStockItems();

  /**
   * A reason for this product stock adjustment like theft or wastage.
   */
  String getAdjustReason();

  /**
   * Date when the AdjustProductStock was created (whatever its status).
   */
  OffsetDateTime getCompletedAdjustProductStockDate();

  /**
   * Date when the AdjustProductStock was created (whatever its status).
   */
  OffsetDateTime getCreationDate();

  /**
   * Free-text description of the AdjustProductStock.
   */
  String getDescription();

  /**
   * An indicator which when the value is "true" means that requester expects the
   * adjustment immediately. If the indicator is true then the response code of
   * 200 indicates the operation is successful otherwise a task is created with a
   * response 201.
   */
  Boolean getInstantSyncAdjust();

  /**
   * Date when the AdjustProductStock was created (whatever its status).
   */
  OffsetDateTime getRequestedAdjustProductStockDate();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
