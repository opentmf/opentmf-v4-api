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
public interface IReserveBalanceCancelEventPayload {

  /**
   * The ReserveBalance resource allows adjustments to be made to the original
   * BalanceTopup eg increment the amount, alter the recharge periodicity.
   */
  IReserveBalance getReserveBalance();
}
