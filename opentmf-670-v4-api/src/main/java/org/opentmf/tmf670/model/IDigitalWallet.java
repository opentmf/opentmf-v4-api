package org.opentmf.tmf670.model;

import java.net.URI;
import org.opentmf.common.model.IPaymentMethod;

/**
 * A digital wallet method of payment.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, name, service, walletId, walletUrl<br/>
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
public interface IDigitalWallet extends IPaymentMethod {

  /**
   * Organization, platform or currency backing the wallet (e.g.: PayPal, Yandex,
   * BitCoin…).
   */
  String getService();

  /**
   * Account identifier in that service.
   */
  String getWalletId();

  /**
   * URI pointing at the digital wallet (e.g.: //paypal.me/johndoe).
   */
  URI getWalletUrl();
}
