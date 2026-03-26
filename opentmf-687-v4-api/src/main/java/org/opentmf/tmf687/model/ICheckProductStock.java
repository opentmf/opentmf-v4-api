package org.opentmf.tmf687.model;

import java.net.URI;

/**
 * CheckProductStock is used to log and execute check about product stock
 * availability.
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
public interface ICheckProductStock extends ICheckProductStockCreate {

  /**
   * Reference of the CheckProductStock.
   */
  URI getHref();

  /**
   * Unique identifier of the CheckProductStock.
   */
  String getId();
}
