package org.opentmf.tmf670.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;

/**
 * Direct Debit is a fully automated payment instrument which is generally used
 * for recurrent payments. It allows a creditor to initiate the payment order.
 * In doing so, it exempts the debtor from having to send a separate payment
 * order at each due date.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, accountNumber, bank, firstDebitDate, mandateType, name, owner<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-670: Payment Method Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDirectDebit extends IBankAccountTransfer {

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * The date on which the (e)Mandate has been cancelled by the Debtor or the
   * Creditor.
   */
  OffsetDateTime getCancellationDate();

  /**
   * The first debit date. The debit date of the collection is the day when the
   * payment of the Debtor is due to the Creditor.
   */
  OffsetDateTime getFirstDebitDate();

  /**
   * The last debit date. The debit date of the collection is the day when the
   * payment of the Debtor is due to the Creditor.
   */
  OffsetDateTime getLastDebitDate();

  /**
   * The identification code of the Scheme e.g., core/b2b.
   */
  String getMandateCategory();

  /**
   * Unique mandate reference.
   */
  String getMandateId();

  /**
   * The status of the mandate(Active/Inactive/Pending).
   */
  String getMandateStatus();

  /**
   * The date of the mandate status change.
   */
  OffsetDateTime getMandateStatusDate();

  /**
   * The type of mandate e.g., single-use(single)/multi-use(recurring).
   */
  String getMandateType();

  /**
   * A reference that the party can later use to identify the direct debit.
   */
  String getReference();

  /**
   * The (e)Mandate electronic signature data.
   */
  String getSignature();

  /**
   * The date of signing of the (e)Mandate.
   */
  OffsetDateTime getSignatureDate();
}
