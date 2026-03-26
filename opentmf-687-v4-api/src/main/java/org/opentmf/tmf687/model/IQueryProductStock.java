package org.opentmf.tmf687.model;

import java.net.URI;

/**
 * QueryProductStock is used to query product stock availability.
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
public interface IQueryProductStock extends IQueryProductStockCreate {

  /**
   * Reference of the QueryProductStock.
   */
  URI getHref();

  /**
   * Unique identifier of the QueryProductStock.
   */
  String getId();
}
