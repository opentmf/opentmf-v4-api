package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * A condition, comprised of a attribute that will be tested against a value.
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
public interface ILoyaltyCondition extends ILoyaltyConditionUpdate {

  /**
   * A reference to the loyalty event type.
   */
  URI getHref();

  /**
   * Unique identifier for the loyalty condition.
   */
  String getId();
}
