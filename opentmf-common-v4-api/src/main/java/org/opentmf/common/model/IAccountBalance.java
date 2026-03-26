package org.opentmf.common.model;


/**
 * Balances linked to the account.
 *
 * <p><br/>
 * <strong>Required:</strong> amount, balanceType, validFor<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-666: Account Management API</li>
 *   <li>TMF-678: Customer Bill Management API</li>
 *   <li>TMF-728: Dunning Case Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAccountBalance extends IEntity {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAmount();

  /**
   * Type of the balance : deposit balance, disputed balance, loyalty balance,
   * receivable balance...
   */
  String getBalanceType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
