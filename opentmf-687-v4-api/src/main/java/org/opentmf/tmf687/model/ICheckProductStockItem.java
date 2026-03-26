package org.opentmf.tmf687.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IQuantity;

/**
 * CheckProductStockItem is used to log and execute query about one product (or
 * configured product) stock availability.
 *
 * <p><br/>
 * <strong>Required:</strong> checkedProductStock, id, requestedQuantity<br/>
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
public interface ICheckProductStockItem extends IExtensible {

  /**
   * A list of alternate availability - from other product stock , different date
   * or quantity.
   */
  List<? extends IAlternateProductStock> getAlternates();

  /**
   * Result of the availability like available, notAvailable, alternate.
   */
  String getAvailabilityResult();

  /**
   * ProductStock is a base class for defining a product (or configured product
   * with values characteristic) stock level.
   */
  IProductStock getCheckedProductStock();

  /**
   * Unique identifier of the Check Product Stock item.
   */
  String getId();

  /**
   * When the value is TRUE means that alternative proposal should be provided
   * (from other product stock, different date or quantity).
   */
  Boolean getProvideAlternative();

  /**
   * An amount in a given unit.
   */
  IQuantity getRequestedQuantity();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
