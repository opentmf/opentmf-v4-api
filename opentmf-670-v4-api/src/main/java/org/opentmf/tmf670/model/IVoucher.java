package org.opentmf.tmf670.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IPaymentMethod;
import org.opentmf.common.model.IQuantity;

/**
 * A voucher method of payment.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, code, expirationDate, name, value<br/>
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
public interface IVoucher extends IPaymentMethod {

  /**
   * Campaign this voucher belongs to.
   */
  String getCampaign();

  /**
   * Code that identifies the voucher.
   */
  String getCode();

  /**
   * The discount that the voucher applies when it's a discount voucher.
   */
  String getDiscount();

  /**
   * The voucher's expiration date.
   */
  OffsetDateTime getExpirationDate();

  /**
   * An amount in a given unit.
   */
  IQuantity getValue();
}
