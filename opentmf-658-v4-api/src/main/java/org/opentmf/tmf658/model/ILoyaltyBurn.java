package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * A specialised event to process direct loyalty points redemption for
 * purchases.
 *
 * <p><br/>
 * <strong>Required:</strong> account, description, loyaltyProgramMember, loyaltyProgramProduct, paymentMethod, quantity<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyBurn extends ILoyaltyBurnCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
