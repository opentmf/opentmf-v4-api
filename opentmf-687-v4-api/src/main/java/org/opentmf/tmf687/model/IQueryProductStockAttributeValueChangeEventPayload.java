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
public interface IQueryProductStockAttributeValueChangeEventPayload {

  /**
   * QueryProductStock is used to query product stock availability.
   */
  IQueryProductStock getQueryProductStock();
}
