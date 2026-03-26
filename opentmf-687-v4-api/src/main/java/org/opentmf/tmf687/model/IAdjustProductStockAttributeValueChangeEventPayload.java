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
public interface IAdjustProductStockAttributeValueChangeEventPayload {

  /**
   * AdjustProductStock is used to log and execute on or several Product Stock
   * level change.
   */
  IAdjustProductStock getAdjustProductStock();
}
