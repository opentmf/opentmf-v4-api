package org.opentmf.common.model;

/**
 * AccountReceivable reference. An account of money owed by a party to another
 * entity in exchange for goods or services that have been delivered or used. An
 * account receivable aggregates the amounts of one or more party accounts
 * (billing or settlement) owned by a given party.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IFinancialAccountRef extends IEntityRef {

  /**
   * Balances linked to the account.
   */
  IAccountBalance getAccountBalance();
}
