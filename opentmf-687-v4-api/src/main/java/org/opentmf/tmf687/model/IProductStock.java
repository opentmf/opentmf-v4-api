package org.opentmf.tmf687.model;

import java.net.URI;

/**
 * ProductStock is a base class for defining a product (or configured product
 * with values characteristic) stock level.
 *
 * <p><br/>
 * <strong>Required:</strong> productStockLevel, stockedProduct<br/>
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
public interface IProductStock extends IProductStockCreate {

  /**
   * Reference of the ProductStock.
   */
  URI getHref();

  /**
   * Unique identifier of the ProductStock.
   */
  String getId();
}
