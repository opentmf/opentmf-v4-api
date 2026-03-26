package org.opentmf.tmf687.model;

/**
 * The event data structure.
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
public interface IReserveProductStockBatchEventPayload {

  /**
   * ReserveProductStock is used to request a product stock reservation.
   */
  IReserveProductStock getReserveProductStock();
}
