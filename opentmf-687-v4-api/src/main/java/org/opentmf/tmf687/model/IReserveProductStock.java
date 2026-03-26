package org.opentmf.tmf687.model;

import java.net.URI;

/**
 * ReserveProductStock is used to request a product stock reservation.
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
public interface IReserveProductStock extends IReserveProductStockCreate {

  /**
   * Reference of the ReserveProductStock.
   */
  URI getHref();

  /**
   * Unique identifier of the ReserveProductStock.
   */
  String getId();
}
