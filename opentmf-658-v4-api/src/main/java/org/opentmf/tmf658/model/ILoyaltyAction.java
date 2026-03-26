package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * Contains information on a loyalty action that should be applied should
 * certain conditions be met for a loyalty rule and program.
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
public interface ILoyaltyAction extends ILoyaltyActionUpdate {

  /**
   * A reference to the loyalty event type.
   */
  URI getHref();

  /**
   * Unique identifier for the loyalty event type.
   */
  String getId();
}
