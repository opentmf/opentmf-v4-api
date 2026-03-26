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
public interface ILoyaltyProgramMemberUpdateEventPayload {

  /**
   * A person or group that opts in to a loyalty program.
   */
  ILoyaltyProgramMember getLoyaltyProgramMember();
}
