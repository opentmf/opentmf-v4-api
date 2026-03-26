package org.opentmf.tmf678.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IFinancialAccountRef;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IPaymentMethodRef;
import org.opentmf.common.model.IRelatedPartyRef;
import org.opentmf.common.model.ITaxItem;
import org.opentmf.common.model.ITimePeriod;

/**
 * The billing account receives all charges (recurring, one time and usage) of
 * the offers and products assigned to it during order process. Periodically
 * according to billing cycle specifications attached to the billing account or
 * as a result of an event, a customer bill (aka invoice) is produced. This
 * customer bill concerns different related parties which play a role on it :
 * for example, a customer bill is produced by an operator, is sent to a bill
 * receiver and has to be paid by a payer.
 * <br/>A payment method could be assigned to the customer bill to build the
 * call of payment. Lettering process enables to assign automatically or
 * manually incoming amount from payments to customer bills (payment items).
 * <br/>A tax item is created for each tax rate used in the customer bill.
 * <br/>The financial account represents a financial entity which records all
 * customer’s accounting events : payment amount are recorded as credit and
 * invoices amount are recorded as debit. It gives the customer overall balance
 * (account balance).
 * <br/>The customer bill is linked to one or more documents that can be
 * downloaded via a provided url.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomerBill extends IEntity {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getAmountDue();

  /**
   * List of: The applied payment is the result of lettering process. It enables
   * to assign automatically or manually part of incoming payment amount to a
   * bill.
   */
  List<? extends IAppliedPayment> getAppliedPayments();

  /**
   * Bill date.
   */
  OffsetDateTime getBillDate();

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getBillDocuments();

  /**
   * Bill reference known by the customer or the party and displayed on the bill.
   * Could be different from the id.
   */
  String getBillNo();

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getBillingPeriod();

  /**
   * Category of the bill produced : normal, duplicate, interim, last, trial
   * customer or credit note for example.
   */
  String getCategory();

  /**
   * AccountReceivable reference. An account of money owed by a party to another
   * entity in exchange for goods or services that have been delivered or used. An
   * account receivable aggregates the amounts of one or more party accounts
   * (billing or settlement) owned by a given party.
   */
  IFinancialAccountRef getFinancialAccount();

  /**
   * Date of bill last update.
   */
  OffsetDateTime getLastUpdate();

  /**
   * ). Approximate date of the next bill production given for information (only
   * used for onCycle bill).
   */
  OffsetDateTime getNextBillDate();

  /**
   * Date at which the amount due should have been paid.
   */
  OffsetDateTime getPaymentDueDate();

  /**
   * PaymentMethod reference. A payment method defines a specific mean of payment
   * (e.g. direct debit).
   */
  IPaymentMethodRef getPaymentMethod();

  /**
   * List of: RelatedParty reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedPartyRef> getRelatedParties();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getRemainingAmount();

  /**
   * onCycle (a bill can be created as a result of a cycle run) or offCycle (a
   * bill can be created as a result of other events such as customer request or
   * account close).
   */
  String getRunType();

  /**
   * Recommended values: new, onHold, validated, sent, partiallyPaid, settled.
   */
  String getState();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxExcludedAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxIncludedAmount();

  /**
   * List of: A tax item is created for each tax rate and tax type used in the
   * bill.
   */
  List<? extends ITaxItem> getTaxItems();
}
