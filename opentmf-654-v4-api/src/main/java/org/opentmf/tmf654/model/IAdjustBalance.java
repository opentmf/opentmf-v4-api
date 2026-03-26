package org.opentmf.tmf654.model;


/**
 * The AdjustBalance resource allows adjustments to be made to the original
 * BalanceTopup eg increment the amount, alter the recharge periodicity.
 *
 * <p><br/>
 * <strong>Required:</strong> status<br/>
 * </p>
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
public interface IAdjustBalance extends IReserveBalance {

  /**
   * Valid values for the Balance Adjust types
   * <br/><p>Recommended values: recurring, oneTime.
   */
  String getAdjustType();
}
