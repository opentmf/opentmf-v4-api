package org.opentmf.tmf670.model;

import org.opentmf.common.model.IPaymentMethod;

/**
 * A bank transfer method of payment.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, accountNumber, bank, name, owner<br/>
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
public interface IBankAccountTransfer extends IPaymentMethod {

  /**
   * The Business Identifier Code/Swift code of the financial institution where
   * the account is located.
   */
  String getBIC();

  /**
   * The bank account number, this could refer to the iban or swift number.
   */
  String getAccountNumber();

  /**
   * The type of account number (e.g.: IBAN, SWIFT, ...).
   */
  String getAccountNumberType();

  /**
   * The display name of the bank.
   */
  String getBank();

  /**
   * The owner of the bank account. This is also the account name.
   */
  String getOwner();
}
