package org.opentmf.tmf654.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITopupBalanceCreateEventPayload {

  /**
   * Represents a detailed description of a recharge operation requested over a
   * bucket (defined by a specific product or reference to a product (i.e.: a
   * commercial id such as an msisidn) and a service type).
   */
  ITopupBalance getTopupBalance();
}
