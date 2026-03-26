package org.opentmf.tmf622.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOrderStateChangeEventPayload {

  /**
   * A Product Order is a type of order which can be used to place an order
   * between a customer and a service provider or between a service provider and a
   * partner and vice versa.
   */
  IProductOrder getProductOrder();
}
