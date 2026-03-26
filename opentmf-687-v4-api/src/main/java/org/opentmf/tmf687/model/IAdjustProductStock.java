package org.opentmf.tmf687.model;

import java.net.URI;

/**
 * AdjustProductStock is used to log and execute on or several Product Stock
 * level change.
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
public interface IAdjustProductStock extends IAdjustProductStockCreate {

  /**
   * Reference of the AdjustProductStock.
   */
  URI getHref();

  /**
   * Unique identifier of the AdjustProductStock.
   */
  String getId();
}
