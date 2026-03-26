package org.opentmf.tmf670.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IPaymentMethod;

/**
 * A check method of payment.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, bank, checkId, drawer, name, payee, signedDate<br/>
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
public interface ICheck extends IPaymentMethod {

  /**
   * Bank performing the payment of the check.
   */
  String getBank();

  /**
   * Unique identifier of the check.
   */
  String getCheckId();

  /**
   * Person or entity writing the check.
   */
  String getDrawer();

  /**
   * Person or entity the check is addressed to.
   */
  String getPayee();

  /**
   * Date when the check was signed.
   */
  OffsetDateTime getSignedDate();
}
