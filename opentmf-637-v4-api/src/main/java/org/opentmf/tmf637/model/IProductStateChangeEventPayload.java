package org.opentmf.tmf637.model;

import org.opentmf.common.model.IProduct;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-637: Product Inventory Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductStateChangeEventPayload {

  /**
   * A product offering procured by a customer or other interested party playing a
   * party role. A product is realized as one or more service(s) and / or
   * resource(s).
   */
  IProduct getProduct();
}
