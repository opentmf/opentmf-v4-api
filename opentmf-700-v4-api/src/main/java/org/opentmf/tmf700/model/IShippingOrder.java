package org.opentmf.tmf700.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * A Shipping Order is a document used by a business to specify what items are
 * to be transferred from a storage location or warehouse to which person and to
 * which new location. A Shipping Order can typically be sent along with a
 * shipment of goods so that the person receiving them can verify that the
 * document correctly reflects the items that they actually received.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-700: Shipping Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IShippingOrder extends IShippingOrderUpdate {

  /**
   * Date of the Shipping Order.
   */
  OffsetDateTime getCreationDate();

  /**
   * Shipping Order unique reference.
   */
  URI getHref();

  /**
   * Identifier of the Shipping Order.
   */
  String getId();

  /**
   * Date of the Shipping Order.
   */
  OffsetDateTime getLastUpdateDate();
}
