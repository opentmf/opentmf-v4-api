package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * A specialised event to process direct loyalty points earnings.
 *
 * <p><br/>
 * <strong>Required:</strong> description, loyaltyProgramMember, loyaltyProgramProduct, quantity<br/>
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
public interface ILoyaltyEarn extends ILoyaltyEarnCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
