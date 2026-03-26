package org.opentmf.tmf687.model;

import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IProductStockRef;
import org.opentmf.common.model.IQuantity;

/**
 * A list of AdjustProductStock items. Every item is a ProductStock adjustement
 * request.
 *
 * <p><br/>
 * <strong>Required:</strong> adjustProductStockQuantity, id, productStockTarget<br/>
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
public interface IAdjustProductStockItem extends IEntity {

  /**
   * An amount in a given unit.
   */
  IQuantity getAdjustProductStockQuantity();

  /**
   * ProductStockRef is a reference to a product stock.
   */
  IProductStockRef getProductStockTarget();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
