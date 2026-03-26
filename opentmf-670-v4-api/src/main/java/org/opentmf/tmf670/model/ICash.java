package org.opentmf.tmf670.model;

import java.net.URI;

/**
 * A cash method of payment. It has no additional data, but it could be extended
 * to add information e.g.: the cashier who took the payment, the person who
 * paid, etc.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, name<br/>
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
public interface ICash extends IPaymentMethodCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
