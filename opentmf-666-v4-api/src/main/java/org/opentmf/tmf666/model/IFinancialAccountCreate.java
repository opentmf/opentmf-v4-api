package org.opentmf.tmf666.model;

import java.time.OffsetDateTime;

/**
 * An account of money owed by a party to another entity in exchange for goods
 * or services that have been delivered or used. A financial (account receivable
 * account/account payable) aggregates the amounts of one or more party accounts
 * (billing or settlement) owned by a given party. It is a specialization of
 * entity Account.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IFinancialAccountCreate extends IFinancialAccountUpdate {

  /**
   * Date of last modification of the account.
   */
  OffsetDateTime getLastModified();
}
