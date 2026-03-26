package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * Loyalty rule, containing conditions, event types and actions.
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
public interface ILoyaltyRule extends ILoyaltyRuleUpdate {

  /**
   * A reference to the loyalty rule.
   */
  URI getHref();

  /**
   * Unique identifier for the loyalty rule.
   */
  String getId();
}
