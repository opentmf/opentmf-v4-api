package org.opentmf.tmf666.model;

import java.util.List;
import org.opentmf.common.model.IAccountBalance;
import org.opentmf.partner.model.IAccountUpdateBase;

/**
 * An account of money owed by a party to another entity in exchange for goods
 * or services that have been delivered or used. A financial (account receivable
 * account/account payable) aggregates the amounts of one or more party accounts
 * (billing or settlement) owned by a given party. It is a specialization of
 * entity Account.
 * <br/>Skipped properties: id,href,lastModified.
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
public interface IFinancialAccountUpdate extends IAccountUpdateBase {

  /**
   * List of: Balances linked to the account.
   */
  List<? extends IAccountBalance> getAccountBalances();

  /**
   * List of: Proof of freedom from taxes imposed by a taxing jurisdiction.
   */
  List<? extends IAccountTaxExemption> getTaxExemptions();
}
