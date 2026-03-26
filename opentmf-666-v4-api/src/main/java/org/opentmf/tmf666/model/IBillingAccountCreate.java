package org.opentmf.tmf666.model;

import java.util.List;
import org.opentmf.common.model.IAccountBalance;

/**
 * A party account used for billing purposes. It includes a description of the
 * bill structure (frequency, presentation media, format and so on). It is a
 * specialization of entity PartyAccount.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, relatedParty<br/>
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
public interface IBillingAccountCreate extends ISettlementAccountUpdate {

  /**
   * List of: Balances linked to the account.
   */
  List<? extends IAccountBalance> getAccountBalances();
}
