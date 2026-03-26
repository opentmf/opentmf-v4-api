package org.opentmf.tmf666.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IFinancialAccountRef;
import org.opentmf.common.model.IPaymentMethodRef;
import org.opentmf.partner.model.IAccountUpdateBase;

/**
 * A party account used for billing purposes. It includes a description of the
 * bill structure (frequency, presentation media, format and so on). It is a
 * specialization of entity PartyAccount.
 * <br/>Skipped properties: id,href,accountBalance.
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
public interface IBillingAccountUpdate extends IAccountUpdateBase {

  /**
   * The structure of the bill for party accounts (billing or settlement).
   */
  IBillStructure getBillStructure();

  /**
   * PaymentMethod reference. A payment method defines a specific mean of payment
   * (e.g. direct debit).
   */
  IPaymentMethodRef getDefaultPaymentMethod();

  /**
   * AccountReceivable reference. An account of money owed by a party to another
   * entity in exchange for goods or services that have been delivered or used. An
   * account receivable aggregates the amounts of one or more party accounts
   * (billing or settlement) owned by a given party.
   */
  IFinancialAccountRef getFinancialAccount();

  /**
   * Date of last modification of the account.
   */
  OffsetDateTime getLastModified();

  /**
   * List of: Defines a plan for payment (when a party wants to spread his
   * payments).
   */
  List<? extends IPaymentPlan> getPaymentPlans();

  /**
   * The condition of the account, such as due, paid, in arrears.
   */
  String getPaymentStatus();

  /**
   * List of: Proof of freedom from taxes imposed by a taxing jurisdiction.
   */
  List<? extends IAccountTaxExemption> getTaxExemptions();
}
