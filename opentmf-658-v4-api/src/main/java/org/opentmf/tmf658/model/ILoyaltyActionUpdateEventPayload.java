package org.opentmf.tmf658.model;

/**
 * The event data structure.
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
public interface ILoyaltyActionUpdateEventPayload {

  /**
   * Contains information on a loyalty action that should be applied should
   * certain conditions be met for a loyalty rule and program.
   */
  ILoyaltyAction getLoyaltyAction();
}
