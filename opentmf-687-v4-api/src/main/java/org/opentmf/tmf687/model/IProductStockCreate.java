package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;

/**
 * ProductStock is a base class for defining a product (or configured product
 * with values characteristic) stock level.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> productStockLevel, productStockStatusType, stockedProduct<br/>
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
public interface IProductStockCreate extends IProductStockUpdate {

  /**
   * Date when the ProductStock was created (whatever its status).
   */
  OffsetDateTime getCreationDate();
}
