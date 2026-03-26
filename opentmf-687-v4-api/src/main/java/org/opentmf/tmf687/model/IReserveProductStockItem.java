package org.opentmf.tmf687.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IProductStockRef;
import org.opentmf.common.model.IQuantity;

/**
 * ReserveProductStockItem is used to request a stock reservation item for a
 * product.
 *
 * <p><br/>
 * <strong>Required:</strong> id, quantityRequested, requestedProduct<br/>
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
public interface IReserveProductStockItem extends IExtensible {

  /**
   * Unique identifier of the ReserveProductStockItem.
   */
  String getId();

  /**
   * ProductStockRef is a reference to a product stock.
   */
  IProductStockRef getProductStockRequested();

  /**
   * ProductStockRef is a reference to a product stock.
   */
  IProductStockRef getProductStockReserved();

  /**
   * An amount in a given unit.
   */
  IQuantity getQuantityRequested();

  /**
   * An amount in a given unit.
   */
  IQuantity getQuantityReserved();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getRequestedProduct();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getReserveProductStockState();
}
